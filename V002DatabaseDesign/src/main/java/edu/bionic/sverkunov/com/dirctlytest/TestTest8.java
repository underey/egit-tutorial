package edu.bionic.sverkunov.com.dirctlytest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.DAO.RestaurantAdministratorDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.interfaces.RestaurantAdministratorDAOI;

public class TestTest8 {
	private static final String PERSISTENCE_UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;
	
	public static void main(String[] args){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		RestaurantAdministratorDAOI restAdm = new RestaurantAdministratorDAO();
//		restAdm.addDishToMenu("Caldeirada de peixe", "0.300", 5.00, "A fresh seafood soup.", true, 8);
//		restAdm.deactivateDish(1);
//		restAdm.activateDish(1);
//		System.out.println(restAdm.findMunusectionIdByDish(3));
//		List<Dish> dishes = restAdm.getAllDishesList();
//		for(Dish d: dishes){
//		 System.out.println(d);
//		}
	}
}
