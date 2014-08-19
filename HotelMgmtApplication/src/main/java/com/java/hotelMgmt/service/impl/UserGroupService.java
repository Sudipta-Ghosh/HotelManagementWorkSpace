package com.java.hotelMgmt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.hotelMgmt.entity.common.GenericDTO;
import com.java.hotelMgmt.service.IGenericService;
import com.java.hotelMgmt.dao.impl.usergroup.UserGroupDao;

@Service("UserGroupBO")
public class UserGroupService<E extends GenericDTO> implements IGenericService {

	UserGroupDao userGroupDao;
    
	
	public void setUserGroupDao(UserGroupDao userGroupDao) {
		this.userGroupDao = userGroupDao;
	}
	
	@Transactional
	public void save(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		userGroupDao.save(userGroupTo);

	}

	public void update(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub

	}
	@Override
	public void delete(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub

	}
	@Override
	public GenericDTO findByUserGroupCode(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		return userGroupTo;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
