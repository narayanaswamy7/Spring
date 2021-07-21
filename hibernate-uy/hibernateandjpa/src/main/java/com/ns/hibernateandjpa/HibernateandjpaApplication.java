package com.ns.hibernateandjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateandjpaApplication {

	public static void main(String[] args) {

		Student student = new Student();

		student.setFirstName("Captain");
		student.setLastName("America");
		student.setEmail("ca@ca.com");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		manager.persist(student);

		manager.getTransaction().commit();

		// Student student = manager.find(Student.class, 4);

		System.out.println(student);

	}

}
