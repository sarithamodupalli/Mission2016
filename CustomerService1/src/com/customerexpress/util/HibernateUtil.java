package com.customerexpress.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	
	public static Session getHibenateSession(){
		
		Configuration cfg = new Configuration().configure("/conf/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();
		SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		
		return session;
	}

}
