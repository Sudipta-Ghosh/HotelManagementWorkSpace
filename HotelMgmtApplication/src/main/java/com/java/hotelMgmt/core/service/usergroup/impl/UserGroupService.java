package com.java.hotelMgmt.core.service.usergroup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.hotelMgmt.dao.impl.usergroup.UserGroupDao;
import com.java.hotelMgmt.dto.TUserGroup;
import com.java.hotelMgmt.dto.util.GenericDTO;
import com.java.hotelMgmt.valueObject.usergroup.UserGroupVO;
import com.java.hotelMgmt.valueObject.util.GenericVO;
import com.java.hotelMgmt.core.service.GenericService;

@Transactional
public class UserGroupService extends GenericService {

	private UserGroupDao userGroupDao ; 

	@Autowired
	public void setUserGroupDao(UserGroupDao userGroupDao) {
		this.userGroupDao = userGroupDao;
	}
	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		GenericVO genericVO=saveUserGroup(genericdto);
		return genericVO;
	}

	private UserGroupVO saveUserGroup(GenericDTO genericdto) {
		UserGroupVO userGroupVO =new UserGroupVO();
		// TODO Auto-generated method stub
		userGroupVO=userGroupDao.save((TUserGroup) genericdto);
		
		return userGroupVO;
	}

	
	
	
	
	

	
	
	

}
