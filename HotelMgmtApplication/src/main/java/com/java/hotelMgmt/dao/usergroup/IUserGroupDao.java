package com.java.hotelMgmt.dao.usergroup;

import com.java.hotelMgmt.dto.TUserGroup;
import com.java.hotelMgmt.dto.util.GenericDTO;
import com.java.hotelMgmt.valueObject.usergroup.UserGroupVO;


public interface IUserGroupDao {
	
	UserGroupVO save(TUserGroup userGroupTo);
	void update(TUserGroup userGroupTo);
	void delete(TUserGroup userGroupTo);
	TUserGroup findByUserGroupCode(String userGroupTo);

}
