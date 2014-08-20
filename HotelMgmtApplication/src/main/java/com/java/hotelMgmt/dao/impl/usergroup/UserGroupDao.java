package com.java.hotelMgmt.dao.impl.usergroup;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.hotelMgmt.dao.usergroup.IUserGroupDao;
import com.java.hotelMgmt.dto.TUserGroup;
import com.java.hotelMgmt.dto.util.GenericDTO;
import com.java.hotelMgmt.valueObject.usergroup.UserGroupVO;


@Repository("UserGroupDao")
public class UserGroupDao   implements IUserGroupDao {

	 private SessionFactory sessionFactory;
	 private UserGroupVO userGroupVO =new UserGroupVO();
	
	public UserGroupVO save(TUserGroup userGroupTo) {
		// TODO Auto-generated method stub
		UserGroupVO userGroupVO =new UserGroupVO();
		this.sessionFactory.getCurrentSession().save(userGroupTo);
		userGroupVO.setMessage("1 UserGroup Save Successfully");
		return userGroupVO;
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
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	

}
