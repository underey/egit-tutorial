package edu.bionic.sverkunov.com.dirctlytest;

import java.util.HashMap;
import java.util.Map;

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

			Map<Dish, Integer> order = new HashMap<Dish, Integer>();
			Dish di = em.find(Dish.class, 2);
			Dish di2 = em.find(Dish.class, 1);
			order.put(di, 12);
			order.put(di2, 2);

			CustomerDAOI cust = new CustomerDAO();
//			cust.submitOrder(order, customer);
		} finally {
			em.close();
		}
	}
}
