%include <stdint.i>
%include <std_vector.i>
%include "swig/point_types/PointXYZ.i"

%{
#include <pcl/point_cloud.h>
%}

%rename (Add) operator+;
%rename (Add_To_Self) operator+=;
%rename (at) operator();//will be ignored by swig , but to facilate using file with other languages
%rename (at) operator[];//same as above
typedef unsigned int size_t;

template <typename PointT>
  class pcl::PointCloud
  {
    public:
      /** \brief Default constructor. Sets \ref is_dense to true, \ref width
        * and \ref height to 0, and the \ref sensor_origin_ and \ref
        * sensor_orientation_ to identity.
        */
      PointCloud () : 
        header (), points (), width (0), height (0), is_dense (true),
        sensor_origin_ (Eigen::Vector4f::Zero ()), sensor_orientation_ (Eigen::Quaternionf::Identity ()),
        mapping_ ()
      {}

      /** \brief Copy constructor (needed by compilers such as Intel C++)
        * \param[in] pc the cloud to copy into this
        */
      PointCloud (PointCloud<PointT> &pc) : 
        header (), points (), width (0), height (0), is_dense (true), 
        sensor_origin_ (Eigen::Vector4f::Zero ()), sensor_orientation_ (Eigen::Quaternionf::Identity ()),
        mapping_ ()
      {
        *this = pc;
      }

      /** \brief Copy constructor (needed by compilers such as Intel C++)
        * \param[in] pc the cloud to copy into this
        */
      PointCloud (const PointCloud<PointT> &pc) : 
        header (), points (), width (0), height (0), is_dense (true), 
        sensor_origin_ (Eigen::Vector4f::Zero ()), sensor_orientation_ (Eigen::Quaternionf::Identity ()),
        mapping_ ()
      {
        *this = pc;
      }

      /** \brief Copy constructor from point cloud subset
        * \param[in] pc the cloud to copy into this
        * \param[in] indices the subset to copy
        */
      PointCloud (const PointCloud<PointT> &pc, 
                  const std::vector<int> &indices) :
        header (pc.header), points (indices.size ()), width (indices.size ()), height (1), is_dense (pc.is_dense),
        sensor_origin_ (pc.sensor_origin_), sensor_orientation_ (pc.sensor_orientation_),
        mapping_ ()
      {
        // Copy the obvious
        assert (indices.size () <= pc.size ());
        for (size_t i = 0; i < indices.size (); i++)
          points[i] = pc.points[indices[i]];
      }

      /** \brief Allocate constructor from point cloud subset
        * \param[in] width_ the cloud width
        * \param[in] height_ the cloud height
        * \param[in] value_ default value
        */
      PointCloud (uint32_t width_, uint32_t height_, const PointT& value_ = PointT ())
        : header ()
        , points (width_ * height_, value_)
        , width (width_)
        , height (height_)
        , is_dense (true)
        , sensor_origin_ (Eigen::Vector4f::Zero ())
        , sensor_orientation_ (Eigen::Quaternionf::Identity ())
        , mapping_ ()
      {}

      /** \brief Destructor. */
      virtual ~PointCloud () {}

      /** \brief Add a point cloud to the current cloud.
        * \param[in] rhs the cloud to add to the current cloud
        * \return the new cloud as a concatenation of the current cloud and the new given cloud
        */ 
      inline PointCloud&
      operator += (const PointCloud& rhs)
      {
        // Make the resultant point cloud take the newest stamp
        if (rhs.header.stamp > header.stamp)
          header.stamp = rhs.header.stamp;

        size_t nr_points = points.size ();
        points.resize (nr_points + rhs.points.size ());
        for (size_t i = nr_points; i < points.size (); ++i)
          points[i] = rhs.points[i - nr_points];

        width    = static_cast<uint32_t>(points.size ());
        height   = 1;
        if (rhs.is_dense && is_dense)
          is_dense = true;
        else
          is_dense = false;
        return (*this);
      }

      /** \brief Add a point cloud to another cloud.
        * \param[in] rhs the cloud to add to the current cloud
        * \return the new cloud as a concatenation of the current cloud and the new given cloud
        */ 
      inline const PointCloud
      operator + (const PointCloud& rhs)
      {
        return (PointCloud (*this) += rhs);
      }
      
      /** \brief Obtain the point given by the (column, row) coordinates. Only works on organized 
        * datasets (those that have height != 1).
        * \param[in] column the column coordinate
        * \param[in] row the row coordinate
        */
      inline const PointT&
      at (int column, int row) const
      {
        if (this->height > 1)
          return (points.at (row * this->width + column));
        else
          throw IsNotDenseException ("Can't use 2D indexing with a unorganized point cloud");
      }

      /** \brief Obtain the point given by the (column, row) coordinates. Only works on organized 
        * datasets (those that have height != 1).
        * \param[in] column the column coordinate
        * \param[in] row the row coordinate
        */
      inline PointT&
      at (int column, int row)
      {
        if (this->height > 1)
          return (points.at (row * this->width + column));
        else
          throw IsNotDenseException ("Can't use 2D indexing with a unorganized point cloud");
      }

      /** \brief Obtain the point given by the (column, row) coordinates. Only works on organized 
        * datasets (those that have height != 1).
        * \param[in] column the column coordinate
        * \param[in] row the row coordinate
        */
      inline const PointT&
      operator () (size_t column, size_t row) const
      {
        return (points[row * this->width + column]);
      }

      /** \brief Obtain the point given by the (column, row) coordinates. Only works on organized 
        * datasets (those that have height != 1).
        * \param[in] column the column coordinate
        * \param[in] row the row coordinate
        */
      inline PointT&
      operator () (size_t column, size_t row)
      {
        return (points[row * this->width + column]);
      }

      /** \brief Return whether a dataset is organized (e.g., arranged in a structured grid).
        * \note The height value must be different than 1 for a dataset to be organized.
        */
      inline bool
      isOrganized () const
      {
        return (height > 1);
      }
      
      /** \brief Return an Eigen MatrixXf (assumes float values) mapped to the specified dimensions of the PointCloud.
        * \anchor getMatrixXfMap
        * \note This method is for advanced users only! Use with care!
        * 
        * \attention Since 1.4.0, Eigen matrices are forced to Row Major to increase the efficiency of the algorithms in PCL
        *   This means that the behavior of getMatrixXfMap changed, and is now correctly mapping 1-1 with a PointCloud structure, 
        *   that is: number of points in a cloud = rows in a matrix, number of point dimensions = columns in a matrix
        *
        * \param[in] dim the number of dimensions to consider for each point
        * \param[in] stride the number of values in each point (will be the number of values that separate two of the columns)
        * \param[in] offset the number of dimensions to skip from the beginning of each point
        *            (stride = offset + dim + x, where x is the number of dimensions to skip from the end of each point)
        * \note for getting only XYZ coordinates out of PointXYZ use dim=3, stride=4 and offset=0 due to the alignment.
        * \attention PointT types are most of the time aligned, so the offsets are not continuous! 
        */
      inline Eigen::Map<Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> > 
      getMatrixXfMap (int dim, int stride, int offset)
      {
        if (Eigen::MatrixXf::Flags & Eigen::RowMajorBit)
          return (Eigen::Map<Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >(reinterpret_cast<float*>(&points[0])+offset, points.size (), dim, Eigen::OuterStride<> (stride)));
        else
          return (Eigen::Map<Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >(reinterpret_cast<float*>(&points[0])+offset, dim, points.size (), Eigen::OuterStride<> (stride)));
      }

      /** \brief Return an Eigen MatrixXf (assumes float values) mapped to the specified dimensions of the PointCloud.
        * \anchor getMatrixXfMap
        * \note This method is for advanced users only! Use with care!
        * 
        * \attention Since 1.4.0, Eigen matrices are forced to Row Major to increase the efficiency of the algorithms in PCL
        *   This means that the behavior of getMatrixXfMap changed, and is now correctly mapping 1-1 with a PointCloud structure, 
        *   that is: number of points in a cloud = rows in a matrix, number of point dimensions = columns in a matrix
        *
        * \param[in] dim the number of dimensions to consider for each point
        * \param[in] stride the number of values in each point (will be the number of values that separate two of the columns)
        * \param[in] offset the number of dimensions to skip from the beginning of each point
        *            (stride = offset + dim + x, where x is the number of dimensions to skip from the end of each point)
        * \note for getting only XYZ coordinates out of PointXYZ use dim=3, stride=4 and offset=0 due to the alignment.
        * \attention PointT types are most of the time aligned, so the offsets are not continuous! 
        */
      inline const Eigen::Map<const Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >
      getMatrixXfMap (int dim, int stride, int offset) const
      {
        if (Eigen::MatrixXf::Flags & Eigen::RowMajorBit)
          return (Eigen::Map<const Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >(reinterpret_cast<float*>(const_cast<PointT*>(&points[0]))+offset, points.size (), dim, Eigen::OuterStride<> (stride)));
        else
          return (Eigen::Map<const Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >(reinterpret_cast<float*>(const_cast<PointT*>(&points[0]))+offset, dim, points.size (), Eigen::OuterStride<> (stride)));                
      }

      /** \brief Return an Eigen MatrixXf (assumes float values) mapped to the PointCloud.
        * \note This method is for advanced users only! Use with care!
        * \attention PointT types are most of the time aligned, so the offsets are not continuous! 
        * See \ref getMatrixXfMap for more information.
        */
      inline Eigen::Map<Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >
      getMatrixXfMap () 
      {
        return (getMatrixXfMap (sizeof (PointT) / sizeof (float),  sizeof (PointT) / sizeof (float), 0));
      }

      /** \brief Return an Eigen MatrixXf (assumes float values) mapped to the PointCloud.
        * \note This method is for advanced users only! Use with care!
        * \attention PointT types are most of the time aligned, so the offsets are not continuous! 
        * See \ref getMatrixXfMap for more information.
        */
      inline const Eigen::Map<const Eigen::MatrixXf, Eigen::Aligned, Eigen::OuterStride<> >
      getMatrixXfMap () const
      {
        return (getMatrixXfMap (sizeof (PointT) / sizeof (float),  sizeof (PointT) / sizeof (float), 0));
      }

      /** \brief The point cloud header. It contains information about the acquisition time. */
      pcl::PCLHeader header;

      /** \brief The point data. */
      std::vector<PointT, Eigen::aligned_allocator<PointT> > points;

      /** \brief The point cloud width (if organized as an image-structure). */
      uint32_t width;
      /** \brief The point cloud height (if organized as an image-structure). */
      uint32_t height;

      /** \brief True if no points are invalid (e.g., have NaN or Inf values). */
      bool is_dense;

      /** \brief Sensor acquisition pose (origin/translation). */
      Eigen::Vector4f    sensor_origin_;
      /** \brief Sensor acquisition pose (rotation). */
      Eigen::Quaternionf sensor_orientation_;

      typedef PointT PointType;  // Make the template class available from the outside
      typedef std::vector<PointT, Eigen::aligned_allocator<PointT> > VectorType;
      typedef std::vector<PointCloud<PointT>, Eigen::aligned_allocator<PointCloud<PointT> > > CloudVectorType;
      typedef boost::shared_ptr<PointCloud<PointT> > Ptr;
      typedef boost::shared_ptr<const PointCloud<PointT> > ConstPtr;

      // iterators
      typedef typename VectorType::iterator iterator;
      typedef typename VectorType::const_iterator const_iterator;
      inline iterator begin () { return (points.begin ()); }
      inline iterator end ()   { return (points.end ()); }
      inline const_iterator begin () const { return (points.begin ()); }
      inline const_iterator end () const  { return (points.end ()); }

      //capacity
      inline size_t size () const { return (points.size ()); }
      inline void reserve (size_t n) { points.reserve (n); }
      inline bool empty () const { return points.empty (); }

      /** \brief Resize the cloud
        * \param[in] n the new cloud size
        */
      inline void resize (size_t n) 
      { 
        points.resize (n);
        if (width * height != n)
        {
          width = static_cast<uint32_t> (n);
          height = 1;
        }
      }

      //element access
      inline const PointT& operator[] (size_t n) const { return (points[n]); }
      inline PointT& operator[] (size_t n) { return (points[n]); }
      inline const PointT& at (size_t n) const { return (points.at (n)); }
      inline PointT& at (size_t n) { return (points.at (n)); }
      inline const PointT& front () const { return (points.front ()); }
      inline PointT& front () { return (points.front ()); }
      inline const PointT& back () const { return (points.back ()); }
      inline PointT& back () { return (points.back ()); }

      /** \brief Insert a new point in the cloud, at the end of the container.
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] pt the point to insert
        */
      inline void 
      push_back (const PointT& pt)
      {
        points.push_back (pt);
        width = static_cast<uint32_t> (points.size ());
        height = 1;
      }

      /** \brief Insert a new point in the cloud, given an iterator.
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] position where to insert the point
        * \param[in] pt the point to insert
        * \return returns the new position iterator
        */
      inline iterator 
      insert (iterator position, const PointT& pt)
      {
        iterator it = points.insert (position, pt);
        width = static_cast<uint32_t> (points.size ());
        height = 1;
        return (it);
      }

      /** \brief Insert a new point in the cloud N times, given an iterator.
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] position where to insert the point
        * \param[in] n the number of times to insert the point
        * \param[in] pt the point to insert
        */
      inline void 
      insert (iterator position, size_t n, const PointT& pt)
      {
        points.insert (position, n, pt);
        width = static_cast<uint32_t> (points.size ());
        height = 1;
      }

      /** \brief Insert a new range of points in the cloud, at a certain position.
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] position where to insert the data
        * \param[in] first where to start inserting the points from
        * \param[in] last where to stop inserting the points from
        */
      template <class InputIterator> inline void 
      insert (iterator position, InputIterator first, InputIterator last)
      {
        points.insert (position, first, last);
        width = static_cast<uint32_t> (points.size ());
        height = 1;
      }

      /** \brief Erase a point in the cloud. 
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] position what data point to erase
        * \return returns the new position iterator
        */
      inline iterator 
      erase (iterator position)
      {
        iterator it = points.erase (position); 
        width = static_cast<uint32_t> (points.size ());
        height = 1;
        return (it);
      }

      /** \brief Erase a set of points given by a (first, last) iterator pair
        * \note This breaks the organized structure of the cloud by setting the height to 1!
        * \param[in] first where to start erasing points from
        * \param[in] last where to stop erasing points from
        * \return returns the new position iterator
        */
      inline iterator 
      erase (iterator first, iterator last)
      {
        iterator it = points.erase (first, last);
        width = static_cast<uint32_t> (points.size ());
        height = 1;
        return (it);
      }

      /** \brief Swap a point cloud with another cloud.
        * \param[in,out] rhs point cloud to swap this with
        */ 
      inline void 
      swap (PointCloud<PointT> &rhs)
      {
        this->points.swap (rhs.points);
        std::swap (width, rhs.width);
        std::swap (height, rhs.height);
        std::swap (is_dense, rhs.is_dense);
        std::swap (sensor_origin_, rhs.sensor_origin_);
        std::swap (sensor_orientation_, rhs.sensor_orientation_);
      }

      /** \brief Removes all points in a cloud and sets the width and height to 0. */
      inline void 
      clear ()
      {
        points.clear ();
        width = 0;
        height = 0;
      }

      /** \brief Copy the cloud to the heap and return a smart pointer
        * Note that deep copy is performed, so avoid using this function on non-empty clouds.
        * The changes of the returned cloud are not mirrored back to this one.
        * \return shared pointer to the copy of the cloud
        */
      inline Ptr 
      makeShared () const { return Ptr (new PointCloud<PointT> (*this)); }

    protected:
      // This is motivated by ROS integration. Users should not need to access mapping_.
      boost::shared_ptr<MsgFieldMap> mapping_;

      friend boost::shared_ptr<MsgFieldMap>& detail::getMapping<PointT>(pcl::PointCloud<PointT> &p);

    public:
      EIGEN_MAKE_ALIGNED_OPERATOR_NEW;
  };


using namespace pcl;
%template(insert_iterator) pcl::PointCloud::insert<iterator>; 
%template(PoinCloud_PointXYZ) pcl::PointCloud<pcl::PointXYZ>;
