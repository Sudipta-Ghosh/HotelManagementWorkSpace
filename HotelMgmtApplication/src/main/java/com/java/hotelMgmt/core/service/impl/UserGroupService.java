package com.java.hotelMgmt.core.service.impl;

import com.java.hotelMgmt.entity.common.GenericDTO;
import com.java.hotelMgmt.util.InvokeTransactionContoller;

import com.java.hotelMgmt.core.service.IGenericService;


public class UserGroupService<E extends GenericDTO> implements IGenericService {

	InvokeTransactionContoller invokeTransactionContoller;
	
	
	public void setInvokeTransactionContoller(
			InvokeTransactionContoller invokeTransactionContoller) {
		this.invokeTransactionContoller = invokeTransactionContoller;
	}

	
	
	//@Transactional
	public void save(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		invokeTransactionContoller.findObjectType(userGroupTo);
		//userGroupDao.save(userGroupTo);

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
