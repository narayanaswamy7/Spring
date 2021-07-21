package com.ns.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ns.cruddemo.bean.Employee;

//@RepositoryRestResource(path="members") // used for custom path instead of default entityname + s;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it .. no need to write any code

}
