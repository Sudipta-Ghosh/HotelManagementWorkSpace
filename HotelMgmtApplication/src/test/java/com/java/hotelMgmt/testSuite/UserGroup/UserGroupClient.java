package com.java.hotelMgmt.testSuite.UserGroup;

import java.util.Date;

import com.java.hotelMgmt.core.businessdelegate.BusinessDelegate;
import com.java.hotelMgmt.dao.impl.usergroup.UserGroupDao;
import com.java.hotelMgmt.entity.TUserGroup;

public class UserGroupClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String userGroupName;
		 String userGroupDescription;
		 String userGroupStatus;
		 String createdBy;
		 String lastUpdatedBy;
		 Date   creationDate;
		 Date   lastUpdatedDate;
		 TUserGroup userGroupTo =new TUserGroup();
	
		 userGroupName="UserGroup";
		 userGroupDescription="UserGroupDescription";
		 userGroupStatus="UserGroupStatus";
		 createdBy="SUDIPTA";
		 lastUpdatedBy="SUDIPTA";
		 UserGroupDao userGroupDao=new UserGroupDao();
		 userGroupTo.setUserGroupName(userGroupName);
		 userGroupTo.setUserGroupDescription(userGroupDescription);
		 userGroupTo.setUserGroupStatus(userGroupStatus);
		 userGroupTo.setCreatedBy(createdBy);
		 userGroupTo.setLastUpdatedBy(lastUpdatedBy);
		 userGroupTo.setCreationDate(new Date());
		 userGroupTo.setLastUpdatedDate(new Date());
		 BusinessDelegate objBusinessDelegate=new BusinessDelegate();
		 objBusinessDelegate.doProcessing(userGroupTo);
		
	}

}
