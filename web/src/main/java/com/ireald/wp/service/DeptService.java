package com.ireald.wp.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.core.mybaits.service.BaseService;
import com.ireald.wp.core.utils.Identities;
import com.ireald.wp.domain.Dept;
import com.ireald.wp.domain.DeptAssoRole;
import com.ireald.wp.domain.UserAssoDept;
import com.ireald.wp.mapper.DeptAssoRoleMapper;
import com.ireald.wp.mapper.DeptMapper;
import com.ireald.wp.mapper.UserAssoDeptMapper;
@Service
@Transactional
public class DeptService extends BaseService<Dept,String>{

	@Autowired private DeptMapper deptMapper;
	
	@Autowired private UserAssoDeptMapper userAssoDeptMapper;
	
	@Autowired private DeptAssoRoleMapper deptAssoRoleMapper;
	
	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return deptMapper;
	}

	@Override
	public int update(Dept entity) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int add(Dept entity) {
		// TODO Auto-generated method stub
		return deptMapper.insert(entity);
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return deptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Dept findById(String id) {
		// TODO Auto-generated method stub
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<Dept> findByPage(Page<Dept> page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int assoUserToDept(String user_id,String dept_id){
		if(StringUtils.isNotBlank(user_id)&&StringUtils.isNotBlank(dept_id)){
			UserAssoDept  userAssoDept=new UserAssoDept();
			userAssoDept.setUser_dept_id(Identities.uuid2());
			userAssoDept.setDept_id(dept_id);
			userAssoDept.setUser_id(user_id);
			return userAssoDeptMapper.insert(userAssoDept);
		}else{
			return 0;
		}
	}
	
	public int assoRoleToDept(String role_id,String dept_id){
		if(StringUtils.isNoneBlank(role_id)&&StringUtils.isNotBlank(dept_id)){
			DeptAssoRole deptAssoRole=new DeptAssoRole();
			deptAssoRole.setRole_dept_id(Identities.uuid2());
			deptAssoRole.setDept_id(dept_id);
			deptAssoRole.setRole_id(role_id);
			return deptAssoRoleMapper.insert(deptAssoRole);
		}else{
			return 0;
		}
	}
	
	public Dept findDeptWithRoleById(String dept_id){
		return deptMapper.selectWithRoleByPrimaryKey(dept_id);
	}

}
