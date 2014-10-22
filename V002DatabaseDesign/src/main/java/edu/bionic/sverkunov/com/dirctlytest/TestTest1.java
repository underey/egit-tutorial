package edu.bionic.sverkunov.com.dirctlytest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;

public class TestTest1 {

	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		String sql = "select c from Customer c where c.id > 0";
		TypedQuery<Customer> query = em.createQuery(sql, Customer.class);
		
		List<Customer> result = null;
		try{result = query.getResultList();}
		finally{em.close();}
		
		for(Customer c : result){
			System.out.println(c.getName() + " " + c.getPhone());
		}

	}
}
