package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.Dish;

public interface RestaurantAdministratorDAOI {

	public void addDishToMenu(EntityManager em, Dish dish);
	
	public void activateDish(EntityManager em, int dishId);
	
	public void deactivateDish(EntityManager em, int dishId);
	
	public void changePrice(EntityManager em, int dishId, double newPrice);
	
	public void editDish(EntityManager em, Dish dish);
	
	public int findMunusectionIdByDish(EntityManager em, int dishId);
	
	public List<Dish> getDishesListBySection(EntityManager em, int sectionId);
	
	public Dish getDishById(EntityManager em, int dishId);
}
