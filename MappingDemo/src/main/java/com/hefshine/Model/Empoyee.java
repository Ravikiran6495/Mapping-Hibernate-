package com.hefshine.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Empoyee {
	
	
	@Id
	private int id;
	
	private String name;
	
	@OneToOne
	private Department dept;
	
	
	public Empoyee() {
		// TODO Auto-generated constructor stub
	}


	public Empoyee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Empoyee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	

}
