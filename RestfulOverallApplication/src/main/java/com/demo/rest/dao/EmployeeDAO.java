package com.demo.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.rest.pojo.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository <Employee, Integer> {

//	List<Employee> getAllNames();
//
//	Employee getName(int id);
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#addName(com.employee.pojo.Employee)
//	 */
//
//	void addName(Employee emp);
//
//	void updateName(int id, Employee emp);
//
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#deleteName(int)
//	 */
//	void deleteName(int id);

}