package com.java.hotelMgmt.core.businessdelegate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.hotelMgmt.core.service.IGenericService;
import com.java.hotelMgmt.entity.common.GenericDTO;

public class BusinessDelegate {
	
	public void doProcessing(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IGenericService objUserGroupService = (IGenericService)context.getBean("UserGroupService");
		objUserGroupService.save(userGroupTo);
		
	}

}
