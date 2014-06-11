package com.ireald.wp.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.core.mybaits.service.BaseService;
import com.ireald.wp.core.utils.Identities;
import com.ireald.wp.domain.PermissonAssoResoucre;
import com.ireald.wp.domain.Resource;
import com.ireald.wp.mapper.PermissonAssoResoucreMapper;
import com.ireald.wp.mapper.ResourceMapper;
@Service
@Transactional
public class ResourceService extends BaseService<Resource,String>{
   
	@Autowired private ResourceMapper resourceMapper;
	@Autowired private PermissonAssoResoucreMapper permissonAssoResoucreMapper;
	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return resourceMapper;
	}

	@Override
	public int update(Resource entity) {
		// TODO Auto-generated method stub
		return resourceMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int add(Resource entity) {
		// TODO Auto-generated method stub
		return resourceMapper.insert(entity);
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return resourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Resource findById(String id) {
		// TODO Auto-generated method stub
		return resourceMapper.selectByPrimaryKey(id);
	}
	
	public Resource findWtihPermissionById(String id) {
		// TODO Auto-generated method stub
		return resourceMapper.selectWithPremissionByPrimaryKey(id);
	}
	
	
	public List<Resource> findByRoleId(String roleId){
		return resourceMapper.selectByRoleId(roleId);
	}

	@Override
	public Page<Resource> findByPage(Page<Resource> page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int assoPremissionToResource(String permission_id,String resource_id){
		if(StringUtils.isNotBlank(permission_id)&&StringUtils.isNotBlank(resource_id)){
			PermissonAssoResoucre permissonAssoResoucre=new PermissonAssoResoucre();
			permissonAssoResoucre.setPermisson_resoucre_id(Identities.uuid2());
			permissonAssoResoucre.setPermisson_id(permission_id);
			permissonAssoResoucre.setResource_id(resource_id);
			return permissonAssoResoucreMapper.insert(permissonAssoResoucre);
		}else{
			return 0;
		}
	}

}
