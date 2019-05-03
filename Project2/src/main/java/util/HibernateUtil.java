package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	public static Session getSession() {
		return sf.openSession();
	}
}
