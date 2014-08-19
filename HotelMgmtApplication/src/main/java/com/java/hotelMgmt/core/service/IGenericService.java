package com.java.hotelMgmt.core.service;

import java.io.Serializable;

import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;

public interface IGenericService  < E extends GenericDTO>  {

	public String getName();
	void save(E userGroupTo);
	void update(E userGroupTo);
	void delete(E userGroupTo);
	E findByUserGroupCode(E userGroupTo);
}
