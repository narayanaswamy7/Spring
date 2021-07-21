package com.ns.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ns.cruddemo.bean.Employee;
import com.ns.cruddemo.dao.EmployeeDAO;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJPAImpl") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);

	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDAO.deleteById(id);
	}

}
