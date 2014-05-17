package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
		Role role=new Role();
		role.setRole_id("1");
		role.setIs_show(true);
		role.setName("test");
		role.setRole("test");
		role.setDescription("test");
		int i=roleService.add(role);
		assertEquals(1, i);
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
		String userId="6b3b2349800743c38491457c38e6b8a2";
		String roleId="df4bc9a6e78c4c18bf346a9954b79c1d";
		int i=roleService.assoUserToRole(userId, roleId);
		assertEquals(1, i);
	}

}