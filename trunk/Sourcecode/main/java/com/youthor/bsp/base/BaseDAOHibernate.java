package com.youthor.bsp.base;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class BaseDAOHibernate<T extends Serializable> {
	
	private HibernateTemplate hibernateTemplate;
	
     public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
    
    @Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void doCreateObject(T entity){
        this.getHibernateTemplate().save(entity);
      }

    public void doUpdateObject(T entity){
        this.getHibernateTemplate().update(entity);
    }
        

    public void doDeleteObject(T entity){
        this.getHibernateTemplate().delete(entity);
    }
}
