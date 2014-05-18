package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.domain.Resource;
import com.ireald.wp.service.ResourceService;
@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ResourceServiceTest {
     @Autowired private ResourceService resourceService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdateResource() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddResource() {
		/*Resource resource=new Resource();
		resource.setResource_id(java.util.UUID.randomUUID().toString().replace("-", ""));
		resource.setName("upload");
		resource.setSerailno(1);
		resource.setPath("upload");
		resource.setUrl("/showcase/upload");
		resourceService.add(resource);*/
	}

	@Test
	public void testDeleteByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPagePageOfResource() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAssoPremissionToResource(){
		/*String premissionId="43679ca6a35041a9a0c4e0b4be6fc9a4";
		String resourceId="1f2875053ad249d9ad77f3588a562f3c";
		int i=resourceService.assoPremissionToResource(premissionId, resourceId);
		assertEquals(1, i);*/
	}

}
