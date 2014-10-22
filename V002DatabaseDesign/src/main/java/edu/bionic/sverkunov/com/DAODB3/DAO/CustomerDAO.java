package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.Dish;
import edu.bionic.sverkunov.com.DAODB3.classes.Menusection;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderr;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderrmenuitem;
import edu.bionic.sverkunov.com.DAODB3.interfaces.CustomerDAOI;

public class CustomerDAO implements CustomerDAOI {

	@Override
	public String selectMenusection(EntityManager em, int id) {
		TypedQuery<Menusection> query = em.createQuery(
				"SELECT m FROM Menusection m where m.id = :par",
				Menusection.class);
		String res = null;

		List<Menusection> result = null;
		query.setParameter("par", id);
		result = query.getResultList();

		for (Menusection m : result) {
			res = m.getName();
		}
		return res;

	}

	@Override
	public double getPrice(EntityManager em, int id) {

		Dish dish = em.find(Dish.class, id);
		double result = dish.getPrice();
		return result;
	}

	@Override
	public Dish addDishToCart(EntityManager em, int id) {
		Dish dish = null;
		dish = em.find(Dish.class, id);
		return dish;
	}

	@Override
	public int submitOrder(EntityManager em, List<Dish> order,
			Customer customer) {
		int orderrId = addToOrderr(em, customer);
		addToOrderrmenuitem(em, order, orderrId);
		return orderrId;
	}

	private void addToOrderrmenuitem(EntityManager em, List<Dish> order,
			int orderrId) {

		Orderrmenuitem ord = null;
		for (Dish d : order) {
			ord = new Orderrmenuitem();

			double price = d.getPrice();
			int dishId = d.getId();
			long time = System.currentTimeMillis();
			Timestamp timestamp = new java.sql.Timestamp(time);

			ord.setStatus("undone");
			ord.setDate_time(timestamp);
			ord.setPrice(price);
			ord.setOrderr_id(orderrId);
			ord.setDish_id(dishId);

			em.getTransaction().begin();
			em.persist(ord);
			em.getTransaction().commit();
		}

	}

	private int addToOrderr(EntityManager em, Customer customer) {
		Orderr orderr = new Orderr();
		long time = System.currentTimeMillis();
		Timestamp timestamp = new java.sql.Timestamp(time);

		orderr.setStatus("undone");
		orderr.setCustomer(customer);
		orderr.setDate_time(timestamp);

		em.getTransaction().begin();
		em.persist(orderr);
		em.getTransaction().commit();
		return orderr.getId();
	}

	@Override
	public String getDishDescription(EntityManager em, int dishId) {
		String description = null;
		Dish dish = em.find(Dish.class, dishId);
		description = dish.getDescription();
		return description;
	}

	@Override
	public void signUp(EntityManager em, Customer customer) {
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
	}

}
