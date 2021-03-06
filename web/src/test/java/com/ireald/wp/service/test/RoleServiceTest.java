package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.domain.Premission;
import com.ireald.wp.domain.Role;
import com.ireald.wp.service.RoleService;

@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class RoleServiceTest {
@Resource private  RoleService  roleService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdateRole() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddRole() {
		/*Role role=new Role();
		role.setRole_id("1");
		role.setIs_show(true);
		role.setName("test");
		role.setRole("test");
		role.setDescription("test");
		int i=roleService.add(role);
		assertEquals(1, i);*/
	}

	@Test
	public void testDeleteByIdString() {
		roleService.deleteById("2");
	}

	@Test
	public void testFindByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPagePageOfRole() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAssoUserToRole(){
		/*String userId="6b3b2349800743c38491457c38e6b8a2";
		String roleId="df4bc9a6e78c4c18bf346a9954b79c1d";
		int i=roleService.assoUserToRole(userId, roleId);
		assertEquals(1, i);*/
	}
	@Test
	public void testFindWithPremissionById(){
		String roleId="13e2ceae9a794796b681e0c804033ae3";
		Role role=roleService.findWithPremissionById(roleId);
		assertNotNull(role);
		for(Premission p:role.getPremissions()){
			System.out.println(ReflectionToStringBuilder.toString(p));
		}
	}
	@Test
	public void testFindWithResourceById(){
		String roleId="13e2ceae9a794796b681e0c804033ae3";
		Role role=roleService.findWithResourceById(roleId);
		assertNotNull(role);
		for(com.ireald.wp.domain.Resource r:role.getResources()){
			System.out.println("res:"+ReflectionToStringBuilder.toString(r));
		}
	}

}
