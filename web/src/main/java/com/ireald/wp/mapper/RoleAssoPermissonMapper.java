package com.ireald.wp.mapper;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.RoleAssoPermisson;

public interface RoleAssoPermissonMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(String role_permisson_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(RoleAssoPermisson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(RoleAssoPermisson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    RoleAssoPermisson selectByPrimaryKey(String role_permisson_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeySelective(RoleAssoPermisson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permisson
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKey(RoleAssoPermisson record);
}