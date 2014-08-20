package com.java.hotelMgmt.tdd.UserGroup;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.hotelMgmt.core.businessdelegate.BusinessDelegate;
import com.java.hotelMgmt.dto.TUserGroup;
import com.java.hotelMgmt.valueObject.usergroup.UserGroupVO;
import com.java.hotelMgmt.valueObject.util.GenericVO;

public class UserGroupCreateTest {
	
	BusinessDelegate objBusinessDelegate=new BusinessDelegate();

	TUserGroup userGroupTo =new TUserGroup();
	 @Test(groups = { "UserGroupCreateTest" })
	 public void testEvaluateRPNPositive() {
		 userGroupTo.setUserGroupName("UserGroup");
		 userGroupTo.setUserGroupDescription("UserGroupDescription");
		 userGroupTo.setUserGroupStatus("UserGroupStatus");
		 userGroupTo.setCreatedBy("SUDIPTA");
		 userGroupTo.setLastUpdatedBy("SUDIPTA");
		 userGroupTo.setCreationDate(new Date());
		 userGroupTo.setLastUpdatedDate(new Date());
		 userGroupTo.setAction("saveuserGroup");
		 userGroupTo.setEvent("Save");
		 userGroupTo.setUserGroupAccess("userGroupAccess");
		 UserGroupVO userGroupVO = (UserGroupVO) objBusinessDelegate.doProcess(userGroupTo);
		Assert.assertEquals(userGroupVO.getMessage(), "1 UserGroup Save Successfully");
	 }

}
