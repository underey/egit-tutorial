package edu.bionic.sverkunov.com.dirctlytest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.DAO.CustomerDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.interfaces.CustomerDAOI;

public class TestTest6 {

	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Customer customer = null;
		try {
			customer = em.find(Customer.class, 1);

			List<Dish> order = new ArrayList<Dish>();
			Dish dish1 = em.find(Dish.class, 3);
			Dish dish2 = em.find(Dish.class, 7);
			Dish dish3 = em.find(Dish.class, 1);
			order.add(dish1);
			order.add(dish2);
			order.add(dish3);

			CustomerDAOI cust = new CustomerDAO();
			cust.submitOrder(em, order, customer);
		} finally {
			em.close();
		}
	}
}
