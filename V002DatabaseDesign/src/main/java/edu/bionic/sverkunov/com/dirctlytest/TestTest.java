package edu.bionic.sverkunov.com.dirctlytest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;


public class TestTest {

	
	private static final String UNIT_NAME = "restDB3";
  	private static EntityManagerFactory factory;
	public static void main(String[] args) {
	    factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Customer customer = null;
        try{customer = em.find(Customer.class,1);}
        finally{em.close();}
        if(customer != null){
//        	System.out.println(customer.getString());
        }

	  }
	}
