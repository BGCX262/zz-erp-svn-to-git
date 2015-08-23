package com.youthor.bsp.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.youthor.bsp.user.dao.IUserDao;
import com.youthor.bsp.user.model.User;
import com.youthor.bsp.user.service.IUserService;



@Service("userService")
public class UserService implements IUserService {
    private IUserDao userDao ;
    
    
    @Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor={Exception.class})
    public void regUser(User user){
        userDao.addUser(user);

    }
    
    @Resource(name="userDao")
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
    

    
}
