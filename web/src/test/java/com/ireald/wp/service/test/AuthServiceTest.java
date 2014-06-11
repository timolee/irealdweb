package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.service.AuthService;
@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class AuthServiceTest {
    @Autowired private AuthService authService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindStringRolesByLoginId() {
		String loginId="timolee";
		Set <String> roles=authService.findStringRolesByLoginId(loginId);
		for(String role:roles){
			System.out.println(loginId+"'s role string:"+role);
		}
	}

	@Test
	public void testFindStringPremissionByLoginId() {
		String loginId="timolee";
		Set<String> premissions=authService.findStringPremissionByLoginId(loginId);
		for(String p:premissions){
			System.out.println(loginId+"'s shiro premission string:"+p);
		}
	}

}
