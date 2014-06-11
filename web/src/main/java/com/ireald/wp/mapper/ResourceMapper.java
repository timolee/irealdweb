package com.ireald.wp.mapper;

import java.util.List;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.Resource;

public interface ResourceMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(String resource_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    Resource selectByPrimaryKey(String resource_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKey(Resource record);
    
    List<Resource> selectByRoleId(String role_id);
    
    Resource selectWithPremissionByPrimaryKey(String resource_id);
}