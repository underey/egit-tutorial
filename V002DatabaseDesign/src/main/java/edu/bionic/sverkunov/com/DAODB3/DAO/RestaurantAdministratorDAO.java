package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.interfaces.RestaurantAdministratorDAOI;

public class RestaurantAdministratorDAO implements RestaurantAdministratorDAOI {

	@Override
	public void activateDish(EntityManager em, int dishId) {
		Dish dish = null;

		dish = em.find(Dish.class, dishId);
		em.getTransaction().begin();
		dish.setIsactivated(true);
		em.getTransaction().commit();
	}

	@Override
	public void deactivateDish(EntityManager em, int dishId) {
		Dish dish = null;

		dish = em.find(Dish.class, dishId);
		em.getTransaction().begin();
		dish.setIsactivated(false);
		em.getTransaction().commit();
	}

	@Override
	public void changePrice(EntityManager em, int dishId, double newPrice) {
		Dish dish = null;

		dish = em.find(Dish.class, dishId);
		em.getTransaction().begin();
		dish.setPrice(newPrice);
		em.getTransaction().commit();
	}

	@Override
	public int findMunusectionIdByDish(EntityManager em, int dishId) {
		Dish dish = null;
		int msId = 0;

		dish = em.find(Dish.class, dishId);
		msId = dish.getMenusection().getId();
		return msId;
	}

	@Override
	public List<Dish> getDishesListBySection(EntityManager em, int sectionId) {
		TypedQuery<Dish> query = em.createQuery("select d from Dish d where menusection_id = :par",Dish.class);
		
		List<Dish> dishes = null;
		query.setParameter("par", sectionId);
		dishes = query.getResultList();
		return dishes;
	}

	@Override
	public void addDishToMenu(EntityManager em, Dish dish) {
		em.getTransaction().begin();
		em.persist(dish);
		em.getTransaction().commit();
	}

	@Override
	public Dish getDishById(EntityManager em, int dishId) {
		Dish dish = null;
		
		dish = em.find(Dish.class, dishId);
		return dish;
	}

	@Override
	public void editDish(EntityManager em, Dish dish) {
		int dishId = dish.getId();
		Dish d = em.find(Dish.class, dishId);
		
		em.getTransaction().begin();
		d.setName(dish.getName());
		d.setWeight(dish.getWeight());
		d.setPrice(dish.getPrice());
		d.setDescription(dish.getDescription());
		d.setIs_kitchen_made(dish.isIs_kitchen_made());
		d.setMenusection(dish.getMenusection());
		d.setIsactivated(dish.isIsactivated());
		em.getTransaction().commit();
	}

}
