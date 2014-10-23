package edu.bionic.sverkunov.com.dirctlytest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.DAO.CustomerDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.interfaces.CustomerDAOI;

public class TestTest {

	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		Customer customer = em.find(Customer.class, 2);
		CustomerDAOI c = new CustomerDAO();
	
	}

}
