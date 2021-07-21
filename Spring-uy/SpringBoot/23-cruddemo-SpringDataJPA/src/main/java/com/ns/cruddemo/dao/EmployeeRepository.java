package com.ns.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.cruddemo.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it .. no need to write any code

}
