package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.EmployeeInfo;

public class EmployeeDAO {

	public static void main(String[] args) {
		
		//step 1: Load configuration/database connection
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		//step 2: get sessionFactory
		
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		//step 3:create a session
		Session session = sessionfactory.openSession();
		
		//step 4:create transaction
		Transaction transaction = session.beginTransaction();
		
		//step 5:get object
		EmployeeInfo emp = new EmployeeInfo("1","ABC", 10000.0f);
		
		//step 6:save object
		session.save(emp);
		
		//step 7:commit transaction
		transaction.commit();
		
		System.out.println("data saved succesfully..!");
		
		//step 8: close connection
		session.close();
		sessionfactory.close();		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
