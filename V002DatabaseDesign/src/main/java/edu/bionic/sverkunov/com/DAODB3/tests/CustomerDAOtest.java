package edu.bionic.sverkunov.com.DAODB3.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import edu.bionic.sverkunov.com.DAODB3.DAO.CustomerDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Accesslevel;
import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderr;

public class CustomerDAOtest {
	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	@Test
	public void test() {
		
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Customer customer = new Customer();
		Accesslevel accesslevel = em.find(Accesslevel.class, 2);

		customer.setName("Igor");
		customer.setSurname("Ivanov");
		customer.setBirthday(java.sql.Date.valueOf("1961-08-25"));
		customer.setCity("Kiev");
		customer.setStreet("Honchara");
		customer.setBuilding("6");
		customer.setApp("83");
		customer.setEmail("garik1961@gmail.com");
		customer.setPhone("0637177999");
		customer.setLogin("garik1961");
		customer.setPassword("123456");
		customer.setIsactivated(true);
		customer.setAccesslevel(accesslevel);
		

		CustomerDAO cdao = new CustomerDAO();
		cdao.signUp(em, customer);
		
		
		int number1 = customer.getId();
		Customer c = em.find(Customer.class, number1);
		int number2 = c.getId();
		assertEquals(number1, number2);
		System.out.println(customer.getId());
		System.out.println(c.getId());
		em.close();
		
		
	}
	@Test
	public void test1(){
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		CustomerDAO dao = new CustomerDAO();
		String menusection = dao.selectMenusection(em, 3);
		assertEquals(menusection, "BBQ");
		
	}
	@Test
	public void test2(){
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		CustomerDAO dao = new CustomerDAO();
		double price1 = dao.getPrice(em, 10);
		Dish dish = em.find(Dish.class, 10);
		double price2 = dish.getPrice();
		assertEquals(price1, price2, 0.00001);
	}
	
	@Test
	public void test3(){
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		Customer customer = em.find(Customer.class, 1);
		Dish dish = em.find(Dish.class, 3);
		Dish dish2 = em.find(Dish.class, 3);
		Dish dish3 = em.find(Dish.class, 5);
		List<Dish> dishes = new ArrayList<>();
		dishes.add(dish); dishes.add(dish2); dishes.add(dish3);
		
		CustomerDAO dao = new CustomerDAO();
		int orderNumber1 =  dao.submitOrder(em, dishes, customer);
		Orderr orderr = em.find(Orderr.class, orderNumber1);
		int customerId1 = customer.getId();
		int customerId2 = orderr.getCustomer().getId();
		assertEquals(customerId1, customerId2);
	}

}
