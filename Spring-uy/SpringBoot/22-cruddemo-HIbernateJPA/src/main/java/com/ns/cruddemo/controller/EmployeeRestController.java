package com.ns.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.cruddemo.bean.Employee;
import com.ns.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// expose "?employees" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId);

		if (employee == null) {
			throw new RuntimeException("Employee id not found for " + employeeId);
		}
		return employee;
	}

	// add mapping for POST /employees = add new employee
	@PostMapping("/employees/{employeeId}")
	public Employee addEmployee(@RequestBody Employee employee) {

		// also just in case they pass an id in json ... set the id to 0
		// this is to force a save of new item ... instead of update
		employee.setId(0);
		employeeService.save(employee);

		return employee;
	}

	// add mapping for PUT /employees - update existing employee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);

		return employee;
	}

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee tempEmployee = employeeService.findById(employeeId);
		// throw exception if null

		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found for " + employeeId);
		}
		employeeService.deleteById(employeeId);

		return "Deleted employee with id: " + employeeId;
	}
}
