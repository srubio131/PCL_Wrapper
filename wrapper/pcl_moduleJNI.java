/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wrapper;

public class pcl_moduleJNI {
  public final static native void imaxdiv_t_quot_set(long jarg1, imaxdiv_t jarg1_, long jarg2);
  public final static native long imaxdiv_t_quot_get(long jarg1, imaxdiv_t jarg1_);
  public final static native void imaxdiv_t_rem_set(long jarg1, imaxdiv_t jarg1_, long jarg2);
  public final static native long imaxdiv_t_rem_get(long jarg1, imaxdiv_t jarg1_);
  public final static native long new_imaxdiv_t();
  public final static native void delete_imaxdiv_t(long jarg1);
  public final static native long imaxabs(long jarg1);
  public final static native long imaxdiv(long jarg1, long jarg2);
  public final static native long strtoimax(String jarg1, long jarg2, int jarg3);
  public final static native java.math.BigInteger strtoumax(String jarg1, long jarg2, int jarg3);
  public final static native long new_pcl_PointXYZ__SWIG_0();
  public final static native long new_pcl_PointXYZ__SWIG_1(float jarg1, float jarg2, float jarg3);
  public final static native void pcl_PointXYZ_x_set(long jarg1, wrapper.pcl.PointXYZ jarg1_, float jarg2);
  public final static native float pcl_PointXYZ_x_get(long jarg1, wrapper.pcl.PointXYZ jarg1_);
  public final static native void pcl_PointXYZ_y_set(long jarg1, wrapper.pcl.PointXYZ jarg1_, float jarg2);
  public final static native float pcl_PointXYZ_y_get(long jarg1, wrapper.pcl.PointXYZ jarg1_);
  public final static native void pcl_PointXYZ_z_set(long jarg1, wrapper.pcl.PointXYZ jarg1_, float jarg2);
  public final static native float pcl_PointXYZ_z_get(long jarg1, wrapper.pcl.PointXYZ jarg1_);
  public final static native void pcl_PointXYZ_data_set(long jarg1, wrapper.pcl.PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointXYZ_data_get(long jarg1, wrapper.pcl.PointXYZ jarg1_);
  public final static native void delete_pcl_PointXYZ(long jarg1);
  public final static native long new_pcl_Normal__SWIG_0();
  public final static native long new_pcl_Normal__SWIG_1(float jarg1, float jarg2, float jarg3);
  public final static native void pcl_Normal_normal_x_set(long jarg1, wrapper.pcl.Normal jarg1_, float jarg2);
  public final static native float pcl_Normal_normal_x_get(long jarg1, wrapper.pcl.Normal jarg1_);
  public final static native void pcl_Normal_normal_y_set(long jarg1, wrapper.pcl.Normal jarg1_, float jarg2);
  public final static native float pcl_Normal_normal_y_get(long jarg1, wrapper.pcl.Normal jarg1_);
  public final static native void pcl_Normal_normal_z_set(long jarg1, wrapper.pcl.Normal jarg1_, float jarg2);
  public final static native float pcl_Normal_normal_z_get(long jarg1, wrapper.pcl.Normal jarg1_);
  public final static native void pcl_Normal_curvature_set(long jarg1, wrapper.pcl.Normal jarg1_, float jarg2);
  public final static native float pcl_Normal_curvature_get(long jarg1, wrapper.pcl.Normal jarg1_);
  public final static native void pcl_Normal_data_n_set(long jarg1, wrapper.pcl.Normal jarg1_, long jarg2);
  public final static native long pcl_Normal_data_n_get(long jarg1, wrapper.pcl.Normal jarg1_);
  public final static native void delete_pcl_Normal(long jarg1);
  public final static native long new_pcl_PointCloud_PointXYZ__SWIG_0();
  public final static native long new_pcl_PointCloud_PointXYZ__SWIG_1(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long new_pcl_PointCloud_PointXYZ__SWIG_3(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, vector_int jarg2_);
  public final static native long new_pcl_PointCloud_PointXYZ__SWIG_4(long jarg1, long jarg2, long jarg3, wrapper.pcl.PointXYZ jarg3_);
  public final static native long new_pcl_PointCloud_PointXYZ__SWIG_5(long jarg1, long jarg2);
  public final static native void delete_pcl_PointCloud_PointXYZ(long jarg1);
  public final static native long pcl_PointCloud_PointXYZ_Add_To_Self(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_);
  public final static native long pcl_PointCloud_PointXYZ_Add(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_);
  public final static native long pcl_PointCloud_PointXYZ_at__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, int jarg2, int jarg3);
  public final static native long pcl_PointCloud_PointXYZ_at__SWIG_2(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, long jarg3);
  public final static native boolean pcl_PointCloud_PointXYZ_isOrganized(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long pcl_PointCloud_PointXYZ_begin__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long pcl_PointCloud_PointXYZ_end__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long pcl_PointCloud_PointXYZ_size(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_reserve(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native boolean pcl_PointCloud_PointXYZ_empty(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_resize(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_at__SWIG_4(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_front__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long pcl_PointCloud_PointXYZ_back__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_push_back(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_);
  public final static native long pcl_PointCloud_PointXYZ_insert__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, long jarg3, wrapper.pcl.PointXYZ jarg3_);
  public final static native void pcl_PointCloud_PointXYZ_insert__SWIG_1(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, long jarg3, long jarg4, wrapper.pcl.PointXYZ jarg4_);
  public final static native long pcl_PointCloud_PointXYZ_erase__SWIG_0(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_erase__SWIG_1(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, long jarg3);
  public final static native void pcl_PointCloud_PointXYZ_swap(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_);
  public final static native void pcl_PointCloud_PointXYZ_clear(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long pcl_PointCloud_PointXYZ_makeShared(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_header_set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_header_get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_points_set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_points_get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_width_set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_width_get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_height_set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_height_get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_is_dense_set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, boolean jarg2);
  public final static native boolean pcl_PointCloud_PointXYZ_is_dense_get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_sensor_origin__set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_sensor_origin__get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native void pcl_PointCloud_PointXYZ_sensor_orientation__set(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PointCloud_PointXYZ_sensor_orientation__get(long jarg1, wrapper.pcl.PointCloud_PointXYZ jarg1_);
  public final static native long new_pcl_PointCloud_Normal__SWIG_0();
  public final static native long new_pcl_PointCloud_Normal__SWIG_1(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long new_pcl_PointCloud_Normal__SWIG_3(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, vector_int jarg2_);
  public final static native long new_pcl_PointCloud_Normal__SWIG_4(long jarg1, long jarg2, long jarg3, wrapper.pcl.Normal jarg3_);
  public final static native long new_pcl_PointCloud_Normal__SWIG_5(long jarg1, long jarg2);
  public final static native void delete_pcl_PointCloud_Normal(long jarg1);
  public final static native long pcl_PointCloud_Normal_Add_To_Self(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_Normal jarg2_);
  public final static native long pcl_PointCloud_Normal_Add(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_Normal jarg2_);
  public final static native long pcl_PointCloud_Normal_at__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, int jarg2, int jarg3);
  public final static native long pcl_PointCloud_Normal_at__SWIG_2(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, long jarg3);
  public final static native boolean pcl_PointCloud_Normal_isOrganized(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long pcl_PointCloud_Normal_begin__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long pcl_PointCloud_Normal_end__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long pcl_PointCloud_Normal_size(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_reserve(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native boolean pcl_PointCloud_Normal_empty(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_resize(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_at__SWIG_4(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_front__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long pcl_PointCloud_Normal_back__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_push_back(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, wrapper.pcl.Normal jarg2_);
  public final static native long pcl_PointCloud_Normal_insert__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, long jarg3, wrapper.pcl.Normal jarg3_);
  public final static native void pcl_PointCloud_Normal_insert__SWIG_1(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, long jarg3, long jarg4, wrapper.pcl.Normal jarg4_);
  public final static native long pcl_PointCloud_Normal_erase__SWIG_0(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_erase__SWIG_1(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, long jarg3);
  public final static native void pcl_PointCloud_Normal_swap(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_Normal jarg2_);
  public final static native void pcl_PointCloud_Normal_clear(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long pcl_PointCloud_Normal_makeShared(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_header_set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_header_get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_points_set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_points_get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_width_set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_width_get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_height_set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_height_get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_is_dense_set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, boolean jarg2);
  public final static native boolean pcl_PointCloud_Normal_is_dense_get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_sensor_origin__set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_sensor_origin__get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native void pcl_PointCloud_Normal_sensor_orientation__set(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_, long jarg2);
  public final static native long pcl_PointCloud_Normal_sensor_orientation__get(long jarg1, wrapper.pcl.PointCloud_Normal jarg1_);
  public final static native long new_pcl_PCLBase_PointXYZ__SWIG_0();
  public final static native long new_pcl_PCLBase_PointXYZ__SWIG_1(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_);
  public final static native void delete_pcl_PCLBase_PointXYZ(long jarg1);
  public final static native void pcl_PCLBase_PointXYZ_setInputCloud(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_PCLBase_PointXYZ_getInputCloud(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_);
  public final static native void pcl_PCLBase_PointXYZ_setIndices__SWIG_0(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_, long jarg2, vector_int jarg2_);
  public final static native void pcl_PCLBase_PointXYZ_setIndices__SWIG_1(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_, long jarg2);
  public final static native void pcl_PCLBase_PointXYZ_setIndices__SWIG_2(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long pcl_PCLBase_PointXYZ_getIndices(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_);
  public final static native long pcl_PCLBase_PointXYZ_at(long jarg1, wrapper.pcl.PCLBase_PointXYZ jarg1_, long jarg2);
  public final static native long new_vector_int__SWIG_0();
  public final static native long new_vector_int__SWIG_1(long jarg1);
  public final static native long vector_int_size(long jarg1, vector_int jarg1_);
  public final static native long vector_int_capacity(long jarg1, vector_int jarg1_);
  public final static native void vector_int_reserve(long jarg1, vector_int jarg1_, long jarg2);
  public final static native boolean vector_int_isEmpty(long jarg1, vector_int jarg1_);
  public final static native void vector_int_clear(long jarg1, vector_int jarg1_);
  public final static native void vector_int_add(long jarg1, vector_int jarg1_, int jarg2);
  public final static native int vector_int_get(long jarg1, vector_int jarg1_, int jarg2);
  public final static native void vector_int_set(long jarg1, vector_int jarg1_, int jarg2, int jarg3);
  public final static native void delete_vector_int(long jarg1);
  public final static native void pcl_Feature_PointXYZ_Normal_indices__set(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, long jarg2, vector_int jarg2_);
  public final static native long pcl_Feature_PointXYZ_Normal_indices__get(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void pcl_Feature_PointXYZ_Normal_input__set(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, long jarg2);
  public final static native long pcl_Feature_PointXYZ_Normal_input__get(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void delete_pcl_Feature_PointXYZ_Normal(long jarg1);
  public final static native void pcl_Feature_PointXYZ_Normal_setSearchSurface(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, long jarg2);
  public final static native long pcl_Feature_PointXYZ_Normal_getSearchSurface(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void pcl_Feature_PointXYZ_Normal_setSearchMethod(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, long jarg2);
  public final static native long pcl_Feature_PointXYZ_Normal_getSearchMethod(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native double pcl_Feature_PointXYZ_Normal_getSearchParameter(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void pcl_Feature_PointXYZ_Normal_setKSearch(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, int jarg2);
  public final static native int pcl_Feature_PointXYZ_Normal_getKSearch(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void pcl_Feature_PointXYZ_Normal_setRadiusSearch(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, double jarg2);
  public final static native double pcl_Feature_PointXYZ_Normal_getRadiusSearch(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_);
  public final static native void pcl_Feature_PointXYZ_Normal_compute(long jarg1, wrapper.pcl.Feature_PointXYZ_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_Normal jarg2_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_feature_name__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, String jarg2);
  public final static native String pcl_NormalEstimation_PointXYZ_Normal_feature_name__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native String pcl_NormalEstimation_PointXYZ_Normal_getClassName(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_indices__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2, vector_int jarg2_);
  public final static native long pcl_NormalEstimation_PointXYZ_Normal_indices__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_input__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2);
  public final static native long pcl_NormalEstimation_PointXYZ_Normal_input__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_surface__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2);
  public final static native long pcl_NormalEstimation_PointXYZ_Normal_surface__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_k__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, int jarg2);
  public final static native int pcl_NormalEstimation_PointXYZ_Normal_k__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_search_radius__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, double jarg2);
  public final static native double pcl_NormalEstimation_PointXYZ_Normal_search_radius__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_search_parameter__set(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, double jarg2);
  public final static native double pcl_NormalEstimation_PointXYZ_Normal_search_parameter__get(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native long new_pcl_NormalEstimation_PointXYZ_Normal();
  public final static native void delete_pcl_NormalEstimation_PointXYZ_Normal(long jarg1);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_computePointNormal__SWIG_0(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, long jarg4, long jarg5);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_computePointNormal__SWIG_1(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_setInputCloud(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_setViewPoint(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, float jarg2, float jarg3, float jarg4);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_getViewPoint(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native void pcl_NormalEstimation_PointXYZ_Normal_useSensorOriginAsViewPoint(long jarg1, wrapper.pcl.NormalEstimation_PointXYZ_Normal jarg1_);
  public final static native void delete_pcl_search_Search_PointXYZ(long jarg1);
  public final static native String pcl_search_Search_PointXYZ_getName(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_);
  public final static native void pcl_search_Search_PointXYZ_setSortedResults(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, boolean jarg2);
  public final static native boolean pcl_search_Search_PointXYZ_getSortedResults(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_);
  public final static native void pcl_search_Search_PointXYZ_setInputCloud__SWIG_0(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, long jarg3, vector_int jarg3_);
  public final static native void pcl_search_Search_PointXYZ_setInputCloud__SWIG_1(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_search_Search_PointXYZ_getInputCloud(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_);
  public final static native long pcl_search_Search_PointXYZ_getIndices(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_);
  public final static native int pcl_search_Search_PointXYZ_nearestKSearch__SWIG_0(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, int jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native int pcl_search_Search_PointXYZ_nearestKSearch__SWIG_1(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, int jarg4, long jarg5, vector_int jarg5_, long jarg6);
  public final static native int pcl_search_Search_PointXYZ_nearestKSearch__SWIG_2(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, int jarg2, int jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native void pcl_search_Search_PointXYZ_nearestKSearch__SWIG_3(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, int jarg4, long jarg5, long jarg6);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_0(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, double jarg3, long jarg4, vector_int jarg4_, long jarg5, long jarg6);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_1(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, double jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_2(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, double jarg4, long jarg5, vector_int jarg5_, long jarg6, long jarg7);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_3(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, double jarg4, long jarg5, vector_int jarg5_, long jarg6);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_4(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, int jarg2, double jarg3, long jarg4, vector_int jarg4_, long jarg5, long jarg6);
  public final static native int pcl_search_Search_PointXYZ_radiusSearch__SWIG_5(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, int jarg2, double jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native void pcl_search_Search_PointXYZ_radiusSearch__SWIG_6(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, double jarg4, long jarg5, long jarg6, long jarg7);
  public final static native void pcl_search_Search_PointXYZ_radiusSearch__SWIG_7(long jarg1, wrapper.pcl.search.Search_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, double jarg4, long jarg5, long jarg6);
  public final static native void pcl_search_KdTree_PointXYZ_indices__set(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, vector_int jarg2_);
  public final static native long pcl_search_KdTree_PointXYZ_indices__get(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native void pcl_search_KdTree_PointXYZ_input__set(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_search_KdTree_PointXYZ_input__get(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native long pcl_search_KdTree_PointXYZ_getIndices(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native long pcl_search_KdTree_PointXYZ_getInputCloud(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native int pcl_search_KdTree_PointXYZ_nearestKSearch__SWIG_0_0(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, int jarg4, long jarg5, vector_int jarg5_, long jarg6);
  public final static native int pcl_search_KdTree_PointXYZ_nearestKSearch__SWIG_0_1(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, int jarg2, int jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native void pcl_search_KdTree_PointXYZ_nearestKSearch__SWIG_0_2(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, int jarg4, long jarg5, long jarg6);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_0(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, double jarg4, long jarg5, vector_int jarg5_, long jarg6, long jarg7);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_1(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, int jarg3, double jarg4, long jarg5, vector_int jarg5_, long jarg6);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_2(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, int jarg2, double jarg3, long jarg4, vector_int jarg4_, long jarg5, long jarg6);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_3(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, int jarg2, double jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native void pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_4(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, double jarg4, long jarg5, long jarg6, long jarg7);
  public final static native void pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_0_5(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointCloud_PointXYZ jarg2_, long jarg3, vector_int jarg3_, double jarg4, long jarg5, long jarg6);
  public final static native void pcl_search_KdTree_PointXYZ_sorted_results__set(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, boolean jarg2);
  public final static native boolean pcl_search_KdTree_PointXYZ_sorted_results__get(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native void delete_pcl_search_KdTree_PointXYZ(long jarg1);
  public final static native void pcl_search_KdTree_PointXYZ_setPointRepresentation(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2);
  public final static native long pcl_search_KdTree_PointXYZ_getPointRepresentation(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native void pcl_search_KdTree_PointXYZ_setSortedResults(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, boolean jarg2);
  public final static native void pcl_search_KdTree_PointXYZ_setEpsilon(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, float jarg2);
  public final static native float pcl_search_KdTree_PointXYZ_getEpsilon(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_);
  public final static native void pcl_search_KdTree_PointXYZ_setInputCloud__SWIG_0(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, long jarg3, vector_int jarg3_);
  public final static native void pcl_search_KdTree_PointXYZ_setInputCloud__SWIG_1(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2);
  public final static native int pcl_search_KdTree_PointXYZ_nearestKSearch__SWIG_1(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, int jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_1(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, double jarg3, long jarg4, vector_int jarg4_, long jarg5, long jarg6);
  public final static native int pcl_search_KdTree_PointXYZ_radiusSearch__SWIG_2(long jarg1, wrapper.pcl.search.KdTree_PointXYZ jarg1_, long jarg2, wrapper.pcl.PointXYZ jarg2_, double jarg3, long jarg4, vector_int jarg4_, long jarg5);
  public final static native long pcl_Feature_PointXYZ_Normal_SWIGUpcast(long jarg1);
  public final static native long pcl_NormalEstimation_PointXYZ_Normal_SWIGUpcast(long jarg1);
  public final static native long pcl_search_KdTree_PointXYZ_SWIGSmartPtrUpcast(long jarg1);
}
