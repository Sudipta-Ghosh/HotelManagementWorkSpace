package com.java.hotelMgmt.transactioncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.java.hotelMgmt.dao.impl.usergroup.UserGroupDao;
import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;

public class UserGroupTransactionController {
	
	UserGroupDao userGroupDao;
	@Transactional
	public String save(TUserGroup userGroupTo) {
		// TODO Auto-generated method stub
		String outputMessage=userGroupDao.save(userGroupTo);
		return outputMessage;

	}
	@Autowired
	public void setUserGroupDao(UserGroupDao userGroupDao) {
		this.userGroupDao = userGroupDao;
	}

}
