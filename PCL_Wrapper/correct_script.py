import sys
import os
import fnmatch
import glob
import queue

def correct_file(filepath,top_package_classes):
    filename=os.path.basename(filepath)
    if filename.endswith(".java"):
        if filename.startswith("SWIGTYPE_p_"):
            f=open(filepath)
            c=f.read()
            f.close()
            a=c.replace("protected", "public")
            try:
                f=open(filepath,"w")
                f.write(a)
                f.close()
            except:
                print("falied to write file: "+filepath)
        else:
            f=open(filepath,"r")
            #c=f.read()
            a=f.read()
            f.close()
            if not "package "+packagename+";" in a:
               for class_name in top_package_classes:
                   a=a.replace(packagename + "." + class_name,class_name)# correct error if the file was previously opened
                   a=a.replace(class_name,packagename + "." + class_name)
            #a=c.replace("SWIGTYPE_p_", packagename + ".SWIGTYPE_p_")# correct the classes names only, and by using get_top_package_classes
            a=a.replace("protected static long getCPtr","public static long getCPtr") #manual correction from a problem generated by using boost shared ptr
            classname=filename.replace(".java","") # remove .java from file name so it will be class name 
            a=a.replace("protected "+classname,"public "+classname) #manual correction from a problem generated by using boost shared ptr - correction of a constructor access 
            try:
                f=open(filepath,"w")
                f.write(a)
                f.close()
            except:
                print("falied to write file: "+filepath)

def get_top_package_classes(top_package_directory):
    sub_files_dirs=os.listdir(top_package_directory)
    top_package_classes=list()
    for file_dir in sub_files_dirs:
        if os.path.isfile(file_dir):
           class_name=file_dir.replace(".java","")
           top_package_classes.append(class_name)
    return top_package_classes

def main():
    q=queue.Queue()
    item=os.getcwd()
    top_package_classes=get_top_package_classes(item)
    q.put(item)
    while not q.empty():
        item=q.get()
        if os.path.isdir(item):
            sub_files_dirs=os.listdir(item)
            for file_dir in sub_files_dirs:
                path=os.path.join(item, file_dir)
                q.put(path)
        else:
            correct_file(item,top_package_classes)

#os.chdir("/home/teammember/Desktop/swig_java_test")
if len(sys.argv)!=3:
    sys.exit("usage python3 correct_script.py <the package name with which you execute swig with - highest level java package>")
packagename =sys.argv[1]
os.chdir(sys.argv[2])
main()
