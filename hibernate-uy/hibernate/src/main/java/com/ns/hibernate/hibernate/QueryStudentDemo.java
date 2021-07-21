package com.ns.hibernate.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ns.hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// start a transaction
			session.beginTransaction();
			
			// query the students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query the students : lastName = "Das"
			theStudents = session.createQuery("from Student s where s.lastName = 'Das' ").getResultList();
			
			// display the students
			System.out.println("\n\nStudents whose lastName is Das");
			displayStudents(theStudents);

			
			// query students: lastname = 'Das' or firstName = 'hari'
			theStudents = session.createQuery("from Student s where s.lastName = 'Das' OR s.firstName = 'hari' ").getResultList();
			System.out.println("\n\nstudents whose last name is das and firsname is hari");
			displayStudents(theStudents);
			
			
			// query students : email contains duck
			theStudents = session.createQuery("from Student s where s.email like '%duck%' ").getResultList();
			System.out.println("\n\nstudents whose email contains duck are: ");
			displayStudents(theStudents);
			
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		theStudents.forEach(System.out::println);
	}

}
