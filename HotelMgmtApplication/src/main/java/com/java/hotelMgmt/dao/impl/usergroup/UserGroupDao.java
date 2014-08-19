package com.java.hotelMgmt.dao.impl.usergroup;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.java.hotelMgmt.dao.usergroup.IUserGroupDao;
import com.java.hotelMgmt.entity.TUserGroup;
import com.java.hotelMgmt.entity.common.GenericDTO;


@Repository("UserGroupDao")
public class UserGroupDao<E extends GenericDTO>   implements IUserGroupDao {

	 private SessionFactory sessionFactory;
	
	public void save(GenericDTO userGroupTo) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(userGroupTo);
		
	}


	public void update(TUserGroup userGroupTo) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(TUserGroup userGroupTo) {
		// TODO Auto-generated method stub
		
	}

	
	public TUserGroup findByUserGroupCode(String userGroupTo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	

}
