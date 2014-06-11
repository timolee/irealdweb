package com.ireald.wp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.ireald.wp.domain.Dept;
import com.ireald.wp.domain.Premission;
import com.ireald.wp.domain.Resource;
import com.ireald.wp.domain.Role;
import com.ireald.wp.domain.User;

@Service
public class AuthService {
   
   private @Autowired DeptService deptService;
   private @Autowired UserService userService;
   private @Autowired RoleService roleService;
   private @Autowired PremissionService premissionService;
   private @Autowired ResourceService resourceService;
   
   /**
    * 根据loginId查找角色标识
    * @param loginId 登陆ID
    * */
   public Set<String> findStringRolesByLoginId(String loginId){
	   Set<String> roles = Sets.newHashSet();
	   if(StringUtils.isNotBlank(loginId)){
	   User user = userService.findUserWithRolesByLoginId(loginId);
	   if (user.getRoles() != null && user.getRoles().size() > 0) {
			for (Role r : user.getRoles()) {
				roles.add(r.getRole());
			}
		}
	    User userWithDepts = userService.findUserWithDeptsByLoginId(loginId);
	    if(userWithDepts!=null&&CollectionUtils.isNotEmpty(userWithDepts.getDepts())){
	    	for(Dept d:userWithDepts.getDepts()){
	    		Dept deptWithRole=deptService.findDeptWithRoleById(d.getDept_id());
	    		if(deptWithRole!=null&&CollectionUtils.isNotEmpty(deptWithRole.getRoles())){
	    			for(Role r:deptWithRole.getRoles()){
	    				roles.add(r.getRole());
	    			}
	    		}
	    	}
	    }
	   }
	   return roles;
   }
   
    /**
     * 根据loginId查找权限标识  presource:resource:permisson1:permisson2
     * @param loginId 登陆ID
     * */
   public Set<String> findStringPremissionByLoginId(String loginId){
	   Set<String> permissions = Sets.newHashSet();
	   if(StringUtils.isNotBlank(loginId)){
		  //获取roleIds
		  Set<String> roleIds=findStringRoleIdsByLoginId(loginId);
		  Set<String> resourceIds=Sets.newHashSet();
		  //获取ResourceIds
		  for(String roleId:roleIds){
			 List<Resource> ress=resourceService.findByRoleId(roleId);
			 for(Resource res:ress){
				 resourceIds.add(res.getResource_id());
			 }
		  }
		  //获取Permission
		  for(String resourceId:resourceIds){
			  Resource res=resourceService.findWtihPermissionById(resourceId);
			  StringBuffer premissionStringBuffer=new StringBuffer(res.getPath());
			  if(CollectionUtils.isNotEmpty(res.getPremissions())){
				  int len=res.getPremissions().size();
				  for(int i=0;i<len;i++){
					  premissionStringBuffer.append(":");
					  premissionStringBuffer.append(res.getPremissions().get(i).getPermisson());
				  }
			  }
			  permissions.add(premissionStringBuffer.toString());
		  }
	   }
	   return permissions;
   }
   
   /**
    * 根据loginId查找角色ID
    * @param loginId 登陆ID
    * */
   private Set<String> findStringRoleIdsByLoginId(String loginId){
	   Set<String> roleIds = Sets.newHashSet();
	   if(StringUtils.isNotBlank(loginId)){
	   User user = userService.findUserWithRolesByLoginId(loginId);
	   if (user.getRoles() != null && user.getRoles().size() > 0) {
			for (Role r : user.getRoles()) {
				roleIds.add(r.getRole_id());
			}
		}
	    User userWithDepts = userService.findUserWithDeptsByLoginId(loginId);
	    if(userWithDepts!=null&&CollectionUtils.isNotEmpty(userWithDepts.getDepts())){
	    	for(Dept d:userWithDepts.getDepts()){
	    		Dept deptWithRole=deptService.findDeptWithRoleById(d.getDept_id());
	    		if(deptWithRole!=null&&CollectionUtils.isNotEmpty(deptWithRole.getRoles())){
	    			for(Role r:deptWithRole.getRoles()){
	    				roleIds.add(r.getRole_id());
	    			}
	    		}
	    	}
	    }
	   }
	   return roleIds;
   }
   
}
