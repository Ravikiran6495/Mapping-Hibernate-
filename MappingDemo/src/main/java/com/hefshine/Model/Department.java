package com.hefshine.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	
	@Id
	private int did;
	
	private String dept_Name;
	
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}



	public Department(int did, String dept_Name) {
		super();
		this.did = did;
		this.dept_Name = dept_Name;
	}



	public int getDid() {
		return did;
	}



	public void setDid(int did) {
		this.did = did;
	}



	public String getDept_Name() {
		return dept_Name;
	}



	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}



	@Override
	public String toString() {
		return "Department [did=" + did + ", dept_Name=" + dept_Name + "]";
	}

	
	
	
	
	
}
