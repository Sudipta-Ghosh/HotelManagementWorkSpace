package com.java.hotelMgmt.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;
import com.java.hotelMgmt.transactioncontroller.UserGroupTransactionController;

public class InvokeTransactionContoller <E extends GenericDTO> {
	
	UserGroupTransactionController userGroupTransactionController;
	
	public E findObjectType(GenericDTO objDto){
		if(objDto instanceof TUserGroup ){
			
			userGroupTransactionController.save((TUserGroup) objDto);
		}
		return null;
		
	}
	@Autowired
	public void setUserGroupTransactionController(
			UserGroupTransactionController userGroupTransactionController) {
		this.userGroupTransactionController = userGroupTransactionController;
	}

}
