package com.ireald.wp.mapper;

import com.ireald.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.Dept;

public interface DeptMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(String dept_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    Dept selectByPrimaryKey(String dept_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeyWithBLOBs(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKey(Dept record);
}