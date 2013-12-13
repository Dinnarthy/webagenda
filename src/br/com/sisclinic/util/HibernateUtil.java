package br.com.sisclinic.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sF = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
			
		} catch (Throwable e) {
			System.out.print("Erro ao criar a SessionFactory \n Erro:"+ e);
			throw new ExceptionInInitializerError(e);
			
		}
		
	}

	public static SessionFactory getSf() {
		return sF;
	}

}
