package com.demo.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.dao.EmployeeDAO;
import com.demo.rest.dao.EmployeeDAOMongo;
import com.demo.rest.pojo.Employee;
import com.demo.rest.pojo.EmployeeForMongo;

@Service
public class EmployeeMongoService {
	@Autowired
	private EmployeeDAOMongo employeeDao;

	public List<EmployeeForMongo> getAllNames() {
		return employeeDao.findAll();
	}

	public EmployeeForMongo getName(int id) {
		return   employeeDao.findByEmpId(id);
	}

	public void addName(EmployeeForMongo emp)

	{

		employeeDao.save(emp);
	}

	public void updateName(EmployeeForMongo emp,int id) 
	{

		employeeDao.save(emp);
	}

	public void deleteName(int id) {
		employeeDao.deleteByEmpId(id);
	}
}
