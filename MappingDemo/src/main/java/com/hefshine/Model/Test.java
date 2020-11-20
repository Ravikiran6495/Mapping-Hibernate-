package com.hefshine.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
		Empoyee emp1=new Empoyee();
		emp1.setId(1);
		emp1.setName("A");
		
		
		Department dept1=new Department();
		dept1.setDid(1);
		dept1.setDept_Name("CSE");
		
		
		emp1.setDept(dept1);
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(emp1);
		session.save(dept1);
		
		tx.commit();
		
		session.close();
		
		System.out.println("Done all");

		
		
	}

}
