package com.java.hotelMgmt.tdd.UserGroup;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.hotelMgmt.core.businessdelegate.BusinessDelegate;
import com.java.hotelMgmt.entity.TUserGroup;

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
		String outputmessage= objBusinessDelegate.doSave(userGroupTo);
		Assert.assertEquals(outputmessage, "1 UserGroup Save Successfully");
	 }

}
