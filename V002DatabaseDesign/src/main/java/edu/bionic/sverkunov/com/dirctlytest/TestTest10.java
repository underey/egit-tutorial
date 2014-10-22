package edu.bionic.sverkunov.com.dirctlytest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.classes.Staff;

public class TestTest10 {
	private static final String PERSISTENCE_UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;
	
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		Staff staff =em.find(Staff.class, 2);
		em.getTransaction().begin();
		em.remove(staff);
		em.getTransaction().commit();
	
	
	}
}
