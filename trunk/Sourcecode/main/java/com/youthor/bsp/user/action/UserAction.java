package com.youthor.bsp.user.action;


import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;
import com.youthor.bsp.user.model.User;
import com.youthor.bsp.user.service.IUserService;


@ParentPackage("struts-default")
@Namespace("/user")
@Scope("prototype")
public class UserAction extends ActionSupport {
    
	private static final long serialVersionUID = -6149443399479331307L;
	private User user;
	private IUserService userService;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Action(value = "regForm", results = { @Result(name = "input", location = "/WEB-INF/bsp/user/input.jsp"),})
	public String regForm() {
		System.out.println(this);
		return INPUT;
	}
	
	@Action(value = "saveForm", results = { @Result(name = "success", location = "/WEB-INF/bsp/user/sucess.jsp")})
	public String saveForm() {
		userService.regUser(user);
		
		return SUCCESS;
	}
	
	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
