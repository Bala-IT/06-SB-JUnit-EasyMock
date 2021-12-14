 package com.bala.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.bala.dao.ContactDao;

public class ContactServiceTest  {

	@Test
	public void TestGetNameById_01() {
		
		//creating proxy
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		
		//setting behavior for proxy
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("Bala");
		
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Bala-IT");
		
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service=new ContactServiceImpl();
		service.setContactDao(daoProxy);
		
		String name = service.getNameById(101);
		assertNotNull(name);
	}
	
}
