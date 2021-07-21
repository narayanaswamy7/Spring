package com.ns.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ns.cruddemo.bean.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// define feilds for entity manager
	private EntityManager manager;

	// set up constructor injection
	@Autowired
	public EmployeeDAOImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public List<Employee> findAll() {

		// get the curent hibernate session
		Session currentSession = manager.unwrap(Session.class);

		// create a query
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

		// execute query and get result list
		List<Employee> employees = query.getResultList();

		// return the results
		return employees;
	}

	@Override
	public Employee findById(int id) {

		// get the current session
		Session currentSession = manager.unwrap(Session.class);

		// get the employee
		Employee employee = currentSession.get(Employee.class, id);

		// return the employee
		return employee;
	}

	@Override
	public void save(Employee employee) {

		// get the current session
		Session currentSession = manager.unwrap(Session.class);

		// save employee
		currentSession.saveOrUpdate(employee);

	}

	@Override
	public void deleteById(int id) {

		// get the current session
		Session currentSession = manager.unwrap(Session.class);

		// delete object with primary key
		Query<Employee> query = currentSession.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId", id);

		query.executeUpdate();

	}

}
