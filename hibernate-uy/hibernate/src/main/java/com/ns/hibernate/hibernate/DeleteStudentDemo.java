package com.ns.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ns.hibernate.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create a session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			//int studentId = 1;

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student based on the id: primary key
			//System.out.println("\nGetting student with id: " + studentId);

			//Student myStudent = session.get(Student.class, studentId);

			// delete the students
			//System.out.println("Deleting the Student: " + myStudent);
			//session.delete(myStudent);

			// delete student = 2;
			System.out.println("deleting student with id = 2");
			session.createQuery("delete from Student s where id = 2").executeUpdate();
			
			
			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}
	}

}
