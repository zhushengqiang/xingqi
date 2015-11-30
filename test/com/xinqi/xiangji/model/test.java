package com.xinqi.xiangji.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	private SessionFactory sf;
	private Session session;

	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@After
	public void destory() {
	}

	@Test
	public void testSaveStudents() {
		
		//
	}
}
