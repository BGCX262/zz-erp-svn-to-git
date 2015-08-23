package com.youthor.bsp.user.dao.impl;


import org.springframework.stereotype.Repository;

import com.youthor.bsp.base.BaseDAOHibernate;
import com.youthor.bsp.user.dao.IUserDao;
import com.youthor.bsp.user.model.User;



@Repository("userDao")
public class UserDao extends BaseDAOHibernate<User>  implements IUserDao {

	public void addUser(User user) {
		 this.doCreateObject(user);
	}

}
