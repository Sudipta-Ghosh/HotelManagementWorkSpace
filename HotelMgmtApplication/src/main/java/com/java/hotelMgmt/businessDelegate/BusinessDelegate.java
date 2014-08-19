package com.java.hotelMgmt.businessDelegate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.hotelMgmt.entity.common.GenericDTO;
import com.java.hotelMgmt.service.IGenericService;

public class BusinessDelegate {
	
	public void doProcessing(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IGenericService objUserGroupService = (IGenericService)context.getBean("UserGroupService");
		objUserGroupService.save(userGroupTo);
		
	}

}
