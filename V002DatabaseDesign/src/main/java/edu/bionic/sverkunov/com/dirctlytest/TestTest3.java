package edu.bionic.sverkunov.com.dirctlytest;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderr;



public class TestTest3 {

	private static final String UNIT_NAME = "restDB3";
  	private static EntityManagerFactory factory;
  	
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Orderr orderr = null;
		try{ 
			orderr = em.find(Orderr.class, 1);
		}
		finally{ em.close(); }
		if (orderr != null){

			Collection<Dish> d = orderr.getDishes();
			for (Dish dish : d){
				System.out.println(dish.toString());
			}
		}
	}
}
