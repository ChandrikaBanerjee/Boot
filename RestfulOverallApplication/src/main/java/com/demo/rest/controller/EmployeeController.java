package com.demo.rest.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.demo.rest.pojo.Employee;
import com.demo.rest.service.EmployeeService;


@RestController
public class EmployeeController {

		@Autowired
		private EmployeeService employeeService;

		@RequestMapping("/employee")
		public List<Employee> getAllNames() {
			return employeeService.getAllNames();
		}

		@RequestMapping("/employee/{id}")
		public Resource getName(@PathVariable("id") int id) {
			Link nxtLink = linkTo(methodOn(this.getClass()).getAllNames()).withRel("View All");
			
			Resource resource = new Resource(employeeService.getName(id), nxtLink);
			return resource;
		}
		
		@RequestMapping("/employee/{start}/{count}")
		public Resources getAllEmployeeByPage(@PathVariable() int start, @PathVariable() int count){
			
			List<Employee> tempEmp= (List<Employee>) getAllNames();
			List<Employee> Employee = new ArrayList<>();
			
			for(int i=start; i<(start+count); i++)
				Employee.add(tempEmp.get(i-1));
			
			Link nxtLink = linkTo(methodOn(this.getClass()).getAllEmployeeByPage(start+count, count)).withRel("Next Link");
			Link prevLink = linkTo(methodOn(this.getClass()).getAllEmployeeByPage(start-count>=0?start-count:1, count)).withRel("Previous Link");
			
			Resources resources = new Resources(Employee, nxtLink, prevLink);
			
			return resources;
		
		}

		@RequestMapping(method = RequestMethod.POST, value = "/employee")
		public void addName(@RequestBody Employee emp) {
			employeeService.addName(emp);
			
			
			
			
		}
		@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
		public void updateName(@RequestBody Employee emp,@PathVariable("id") int id) {
        employeeService.updateName(id,emp);
		}
		@RequestMapping(method = RequestMethod.DELETE,value="/employee/{id}")
		public void deleteName(@PathVariable("id") int id) {
			employeeService.deleteName(id);
		}
	}

	

