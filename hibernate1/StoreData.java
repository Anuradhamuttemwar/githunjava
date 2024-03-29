package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setFirstName("Ram");
		e1.setLastName("Sita");

		session.persist(e1);

		t.commit();
		session.close();

		System.out.println("successfully saved");

	}
}
