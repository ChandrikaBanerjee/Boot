package com.demo.rest.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.rest.pojo.EmployeeForMongo;

public interface EmployeeDAOMongo extends MongoRepository<EmployeeForMongo, ObjectId>{
	public  void deleteByEmpId(int id);

	public EmployeeForMongo findByEmpId(int id);
}
