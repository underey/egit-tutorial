package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.Dish;

public interface CustomerDAOI {

	public String selectMenusection(EntityManager em, int id); //what should be returned?
	
	public double getPrice(EntityManager em, int id);
	
	public Dish addDishToCart(EntityManager em, int id);
	
	public int submitOrder(EntityManager em, List<Dish> order, Customer customer);
	
	public String getDishDescription(EntityManager em, int dishId);
	
	public void signUp(EntityManager em, Customer customer);
}

