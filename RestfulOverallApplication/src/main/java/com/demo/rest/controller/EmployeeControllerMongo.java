package com.demo.rest.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.App;
import com.demo.rest.pojo.EmployeeForMongo;
import com.demo.rest.service.EmployeeMongoService;
@RestController
public class EmployeeControllerMongo {
	private static Logger Logger= LoggerFactory.getLogger(App.class);
	@Autowired
	private EmployeeMongoService employeeMongoService;

	@RequestMapping("/employeeMongo")
	public List<EmployeeForMongo> getAllNames() {
		Logger.info("This is INFO");
		return employeeMongoService.getAllNames();
	}

	@RequestMapping("/employeeMongo/{id}")
	public Resource getName(@PathVariable("id") int id) {
		Link nxtLink = linkTo(methodOn(this.getClass()).getAllNames()).withRel("View All");
		
		Resource resource = new Resource(employeeMongoService.getName(id), nxtLink);
		return resource;
	}
	
	@RequestMapping("/employeeMongo/{start}/{count}")
	public Resources getAllEmployeeByPage(@PathVariable() int start, @PathVariable() int count){
		
		List<EmployeeForMongo> tempEmp= (List<EmployeeForMongo>) getAllNames();
		List<EmployeeForMongo> employeeMongo = new ArrayList<>();
		
		for(int i=start; i<(start+count); i++)
			employeeMongo.add(tempEmp.get(i-1));
		
		Link nxtLink = linkTo(methodOn(this.getClass()).getAllEmployeeByPage(start+count, count)).withRel("Next Link");
		Link prevLink = linkTo(methodOn(this.getClass()).getAllEmployeeByPage(start-count>=0?start-count:1, count)).withRel("Previous Link");
		
		Resources resources = new Resources(employeeMongo, nxtLink, prevLink);
		
		return resources;
	
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employeeMongo")
	public void addName(@RequestBody EmployeeForMongo emp) {
		employeeMongoService.addName(emp);
		
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/employeeMongo/{id}")
	public void updateName(@RequestBody EmployeeForMongo emp,@PathVariable("id") int id) {
    employeeMongoService.updateName(emp,id);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/employeeMongo/{id}")
	public void deleteName(@PathVariable("id") int id) {
		employeeMongoService.deleteName(id);
	}
	
}
