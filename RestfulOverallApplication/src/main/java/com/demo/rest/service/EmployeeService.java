package com.demo.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.dao.EmployeeDAO;
import com.demo.rest.pojo.Employee;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;

	public List<Employee> getAllNames() {
		return employeeDao.findAll();
	}

	public Employee getName(int id) {
		return (Employee) employeeDao.getOne(id);
	}

	public void addName(Employee emp)

	{

		employeeDao.save(emp);

	}

	public void updateName(int id, Employee emp) {

		employeeDao.save(emp);
	}

	public void deleteName(int id) {
		employeeDao.deleteById(id);
	}
}
