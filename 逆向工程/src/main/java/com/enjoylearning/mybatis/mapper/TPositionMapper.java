package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TPosition;

public interface TPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    int insert(TPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    int insertSelective(TPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    TPosition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_position
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TPosition record);
}