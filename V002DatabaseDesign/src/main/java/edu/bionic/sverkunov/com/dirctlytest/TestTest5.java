package edu.bionic.sverkunov.com.dirctlytest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.classes.Menusection;

public class TestTest5 {

	private static final String UNIT_NAME = "restDB3";
  	private static EntityManagerFactory factory;
  	
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		try{
			Menusection m = em.find(Menusection.class, 1);
			if (m != null){
				em.getTransaction().begin();
				em.remove(m);
				em.getTransaction().commit();
			}
		}
		finally{ em.close(); }
	}
}
