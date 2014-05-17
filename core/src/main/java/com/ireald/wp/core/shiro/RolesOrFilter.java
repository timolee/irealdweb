package com.ireald.wp.core.shiro;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.springframework.stereotype.Component;
//权限or判定器
@Component("roleOrFilter")
public class RolesOrFilter extends AuthorizationFilter  {

	/**
	 * 在进行角色检测时，只要有一个满足即通
	 */
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		Subject subject = getSubject(request,response);
        String[] rolesArray = (String[])mappedValue;
 
        if(rolesArray == null|| rolesArray.length== 0) {
            //no roles specified, so nothing to check - allow access.
            return true;
        }
        
        for(String role : rolesArray) {
         if(subject.hasRole(role)) {
             return true;
         }
        }
 
        return false;
        
	}

}
