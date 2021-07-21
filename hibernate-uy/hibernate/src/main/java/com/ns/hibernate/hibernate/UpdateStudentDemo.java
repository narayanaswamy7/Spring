package com.ns.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ns.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create a session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			int studentId = 1;
	
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve the student based on the id: primary key
			System.out.println("\nGetting student with id: "+studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating Student");
			myStudent.setFirstName("Rocky");
			
			//commit the transaction
			session.getTransaction().commit();

			// new code to do bulk update
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Update email for all students");
			session.createQuery("update Student s set s.email = 'foo@bar.com' ").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");

		} finally {
			factory.close();
		}
	}

}
