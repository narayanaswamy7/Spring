package com.ns.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ns.cruddemo.bean.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	private EntityManager manager;

	@Autowired
	public EmployeeDAOJPAImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public List<Employee> findAll() {
		// create a query
		Query query = manager.createQuery("from Employee");

		// execute query and get result list
		List<Employee> employees = query.getResultList();

		// return the result
		return employees;
	}

	@Override
	public Employee findById(int id) {
		// get employee
		Employee employee = manager.find(Employee.class, id);

		return employee;
	}

	@Override
	public void save(Employee employee) {
		Employee employee1 = manager.merge(employee);
		
		// update with id from db ... so we can get generated id from save/insert
		employee.setId(employee1.getId());
	}

	@Override
	public void deleteById(int id) {
		// delete object with primary key
		Query query = manager.createQuery("delete from Employee where id=:empId");
		query.setParameter("empId", id);
		query.executeUpdate();
	}

}
