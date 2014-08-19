package com.java.hotelMgmt.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;
import com.java.hotelMgmt.transactioncontroller.UserGroupTransactionController;

public class InvokeTransactionContoller <E extends GenericDTO> {
	
	UserGroupTransactionController userGroupTransactionController;
	
	public String save(GenericDTO objDto){
		String outputMessage="";
		if(objDto instanceof TUserGroup ){
			
			outputMessage =userGroupTransactionController.save((TUserGroup) objDto);
		}
		return outputMessage;
		
	}
	@Autowired
	public void setUserGroupTransactionController(
			UserGroupTransactionController userGroupTransactionController) {
		this.userGroupTransactionController = userGroupTransactionController;
	}

}
