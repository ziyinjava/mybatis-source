package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TRolePermission;

public interface TRolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    int insert(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    int insertSelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    TRolePermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TRolePermission record);
}