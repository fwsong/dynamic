package com.dynamic.web.util;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class BeanFactoryUtil {
	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public static Object getBean(String beanName) {
		return context.getBean(beanName);
	}
	
	public static <T> T getBean(Class<T> clazz) {
		Map<?,T> beanMap = context.getBeansOfType(clazz);
		if(beanMap == null || beanMap.size() == 0) {
			return null;
		}
		return beanMap.values().iterator().next();
	}
	
	public static Session getHibernateSession(){
		SessionFactory sessionFactory = (SessionFactory)getBean("sessionFactory");
		return sessionFactory.getCurrentSession();
	}
}
