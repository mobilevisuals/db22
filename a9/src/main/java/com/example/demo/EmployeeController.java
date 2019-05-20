/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController
public class EmployeeController {
    
    @Autowired
	private EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
    
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Optional<Employee> getEmployee(@PathVariable("id") long id) {
		return employeeService.getEmployee(id);
	}


    
}
