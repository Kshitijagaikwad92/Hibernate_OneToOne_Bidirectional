package com.hibernatepractical.Cust1_Prod1_Bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	 public static void main( String[] args )   //main line
	 {

		 System.out.println( "Project Started" );
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        // creating the session factory
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        //creating the object of Customer 
	        Customers c1=new Customers(); 
	        c1.setCust_id(101);
	        c1.setCname("Rahul");
	        c1.setCcity("Mumbai");
	        c1.setCphone("8754693201");
	        
	        //creating the object of Product
	        Products p1=new Products();
	        p1.setPid(201);
	        p1.setPname("Cloths");
	        p1.setPcolor("Black");
	        p1.setPprice(1200);
	        p1.setCust(c1);
	        
	        //passing the object of Product in Customer  
	        c1.setProd(p1);
	      //passing the object of Customer in Product  
	        p1.setCust(c1);
	        
	        
	        //opening the session
	        Session session=factory.openSession();
	        
	        //starting the transaction
	        Transaction tx=session.beginTransaction();
	        session.save(c1); //saving the Customer object
	        session.save(p1); //saving the Product object
	        tx.commit();
	        
	        session.close();
	        factory.close();      
	    }
}



