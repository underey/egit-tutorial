package edu.bionic.sverkunov.com.V001DatabaseDesignMain;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAO.classes.Customer;
import edu.bionic.sverkunov.com.DAO.classes.Restaurant;


public class TestTest {

	
	private static final String UNIT_NAME = "eRestaurant";
  	private static EntityManagerFactory factory;
	public static void main(String[] args) {
	    factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        TypedQuery<Customer> typedQueryCustomer = em.createQuery("select c from Customer c where c.customer_id > 6", Customer.class);
        List<Customer> list = null;
        try{list = typedQueryCustomer.getResultList();
        for(Customer c: list){
        	c.getCustomer_name();
        }
        }finally{em.close();}
        
//        Customer customer = null;
//      	Restaurant res = new Restaurant();
//    		customer = new Customer();
//    		customer.setCustomer_birthday(Date.valueOf("2011-12-25"));
//    		customer.setCustomer_email("bla@gmail.com");
//    		customer.setCustomer_login("bla");
//    		customer.setCustomer_name("Victor");
//    		customer.setCustomer_password("12345");
//    		customer.setCustomer_surname("Mic");
//    		customer.setCustomer_phone("0981232331");
//    		customer.setRestaurant(res);
//        
//	    try{ 
////	    	restaurant = new Restaurant();
////	    	restaurant.setRestaurant_name("Alfam patio");
////	    	restaurant.setRestaurant_delivery_time("09.00 to 24.00");
////	    	restaurant.setRestaurant_email("ap@gmail.com");
////	    	restaurant.setRestaurant_phone_number("0871233422");
////	    	restaurant.setRestaurant_price_range("50 - 120$");
////	    	
////	    	em.getTransaction().begin();
////			em.persist(restaurant);
////			em.getTransaction().commit();
//			
//	  
//		
//		customer.getCustomer_id();
//		em.getTransaction().begin();
//		em.persist(customer);
//		em.getTransaction().commit();
////		
////		customer = new Customer();
////		customer.setCustomer_birthday(Date.valueOf("2001-01-29"));
////		customer.setCustomer_email("orion@gmail.com");
////		customer.setCustomer_login("momo");
////		customer.setCustomer_name("Vlad");
////		customer.setCustomer_password("0987");
////		customer.setCustomer_surname("Microphone");
////		customer.setCustomer_phone("0981872321");
//////		customer.setRestaurant(res);
////		
////		em.getTransaction().begin();
////		em.persist(customer);
////		em.getTransaction().commit();
//	    }
//		finally{ em.close(); }
////		if (customer != null){
////			System.out.println(customer);
////		}
	  }
	}


