/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper.pcl;

public class NormalEstimation_PointXYZRGBA_Normal extends wrapper.pcl.Feature_PointXYZRGBA_Normal {
  private long swigCPtr;

  public NormalEstimation_PointXYZRGBA_Normal(long cPtr, boolean cMemoryOwn) {
    super(wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(NormalEstimation_PointXYZRGBA_Normal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wrapper.pcl_moduleJNI.delete_pcl_NormalEstimation_PointXYZRGBA_Normal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setFeature_name_(String value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_feature_name__set(swigCPtr, this, value);
  }

  public String getFeature_name_() {
    return wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_feature_name__get(swigCPtr, this);
  }

  public String getClassName() {
    return wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_getClassName(swigCPtr, this);
  }

  public void setIndices_(wrapper.vector_int value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_indices__set(swigCPtr, this, wrapper.vector_int.getCPtr(value), value);
  }

  public wrapper.vector_int getIndices_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_indices__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.vector_int(cPtr, true);
  }

  public void setInput_(wrapper.pcl.PointCloud_PointXYZRGBA value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_input__set(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(value));
  }

  public wrapper.pcl.PointCloud_PointXYZRGBA getInput_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_input__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZRGBA(cPtr, true);
  }

  public void setSurface_(wrapper.pcl.PointCloud_PointXYZRGBA value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_surface__set(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(value));
  }

  public wrapper.pcl.PointCloud_PointXYZRGBA getSurface_() {
    long cPtr = wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_surface__get(swigCPtr, this);
    return (cPtr == 0) ? null : new wrapper.pcl.PointCloud_PointXYZRGBA(cPtr, true);
  }

  public void setK_(int value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_k__set(swigCPtr, this, value);
  }

  public int getK_() {
    return wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_k__get(swigCPtr, this);
  }

  public void setSearch_radius_(double value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_search_radius__set(swigCPtr, this, value);
  }

  public double getSearch_radius_() {
    return wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_search_radius__get(swigCPtr, this);
  }

  public void setSearch_parameter_(double value) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_search_parameter__set(swigCPtr, this, value);
  }

  public double getSearch_parameter_() {
    return wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_search_parameter__get(swigCPtr, this);
  }

  public NormalEstimation_PointXYZRGBA_Normal() {
    this(wrapper.pcl_moduleJNI.new_pcl_NormalEstimation_PointXYZRGBA_Normal(), true);
  }

  public void computePointNormal(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices, wrapper.SWIGTYPE_p_Eigen__Vector4f plane_parameters, wrapper.SWIGTYPE_p_float curvature) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_computePointNormal__SWIG_0(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, wrapper.vector_int.getCPtr(indices), indices, wrapper.SWIGTYPE_p_Eigen__Vector4f.getCPtr(plane_parameters), wrapper.SWIGTYPE_p_float.getCPtr(curvature));
  }

  public void computePointNormal(wrapper.pcl.PointCloud_PointXYZRGBA cloud, wrapper.vector_int indices, wrapper.SWIGTYPE_p_float nx, wrapper.SWIGTYPE_p_float ny, wrapper.SWIGTYPE_p_float nz, wrapper.SWIGTYPE_p_float curvature) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_computePointNormal__SWIG_1(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud), cloud, wrapper.vector_int.getCPtr(indices), indices, wrapper.SWIGTYPE_p_float.getCPtr(nx), wrapper.SWIGTYPE_p_float.getCPtr(ny), wrapper.SWIGTYPE_p_float.getCPtr(nz), wrapper.SWIGTYPE_p_float.getCPtr(curvature));
  }

  public void setInputCloud(wrapper.pcl.PointCloud_PointXYZRGBA cloud) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_setInputCloud(swigCPtr, this, wrapper.pcl.PointCloud_PointXYZRGBA.getCPtr(cloud));
  }

  public void setViewPoint(float vpx, float vpy, float vpz) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_setViewPoint(swigCPtr, this, vpx, vpy, vpz);
  }

  public void getViewPoint(wrapper.SWIGTYPE_p_float vpx, wrapper.SWIGTYPE_p_float vpy, wrapper.SWIGTYPE_p_float vpz) {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_getViewPoint(swigCPtr, this, wrapper.SWIGTYPE_p_float.getCPtr(vpx), wrapper.SWIGTYPE_p_float.getCPtr(vpy), wrapper.SWIGTYPE_p_float.getCPtr(vpz));
  }

  public void useSensorOriginAsViewPoint() {
    wrapper.pcl_moduleJNI.pcl_NormalEstimation_PointXYZRGBA_Normal_useSensorOriginAsViewPoint(swigCPtr, this);
  }

}