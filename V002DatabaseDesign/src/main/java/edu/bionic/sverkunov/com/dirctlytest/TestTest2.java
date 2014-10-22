package edu.bionic.sverkunov.com.dirctlytest;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.Restaurant;



public class TestTest2 {

  	private static final String PERSISTENCE_UNIT_NAME = "restDB3";
  	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Customer customer = new Customer();
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Alfam Patio");
		restaurant.setEmail("ap@gmail.com");
		restaurant.setDelivery_time("09.00 - 24.00");
		restaurant.setPhone_number("0937177999");
		restaurant.setPrice_range("50 - 100 $");
		
		customer.setName("Irina");
		customer.setSurname("Sverkunova");
		GregorianCalendar c = new GregorianCalendar(1994, 9, 2);
		java.util.Date dt = c.getTime();
		customer.setBirthday(new java.sql.Date(dt.getTime()));
		customer.setCity("Kiev");
		customer.setStreet("Hmelnickogo");
		customer.setBuilding("14");
		customer.setApp("187");
		customer.setEmail("ira.sverkunova@gmail.com");
		customer.setLogin("irina1");
		customer.setPassword("56789");
		customer.setPayment_info("8888999900008888");
		customer.setPhone("0999092918");
//		customer.setRestaurant(restaurant);
//		customer.setSecurity_question("what is your mothers name?");
//		customer.setSecurity_answer("Natasha");
		
		
		try{
			System.out.println(customer.getId());
			em.getTransaction().begin();
			em.persist(customer);
			em.persist(restaurant);
			em.getTransaction().commit();
			System.out.println(customer.getId());
		}
		finally{ em.close(); }
	}
	
}
