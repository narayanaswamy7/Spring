package com.ns.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ns.hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		// create a session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// use the session object to save the data;
			// create 3 student object
			System.out.println("Creating 3 Student object: ");
			Student tempStudent1 = new Student("Hari", "Das", "hari@test.com");
			Student tempStudent2 = new Student("sri", "hari", "sri@test.com");
			Student tempStudent3 = new Student("dev", "kumar", "dev@test.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}
	}

}
