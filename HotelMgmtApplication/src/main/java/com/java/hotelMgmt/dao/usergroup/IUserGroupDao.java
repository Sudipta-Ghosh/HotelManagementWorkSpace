package com.java.hotelMgmt.dao.usergroup;

import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;


public interface IUserGroupDao<E extends GenericDTO> {
	
	void save(GenericDTO userGroupTo);
	void update(TUserGroup userGroupTo);
	void delete(TUserGroup userGroupTo);
	TUserGroup findByUserGroupCode(String userGroupTo);

}
