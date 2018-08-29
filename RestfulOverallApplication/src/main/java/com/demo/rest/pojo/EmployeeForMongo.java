package com.demo.rest.pojo;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class EmployeeForMongo {

	@Id
	private ObjectId _id;
	private int empId;
	private String empFirstName;
	private String empLastName;
	public EmployeeForMongo() {
		
	}
	
	public EmployeeForMongo(int empId, String empFirstName,String empLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}



	/**
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}

	/**
	 * @return the _id
	 */
	public ObjectId get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}

	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeForMongo [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ "]";
	}

	
	}

