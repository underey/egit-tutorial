package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.KitchenPendingScreen;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderrmenuitem;
import edu.bionic.sverkunov.com.DAODB3.interfaces.KitchenMemberStaffDAOI;

public class KitchenMemberStaffDAO implements KitchenMemberStaffDAOI {

	@Override
	public List<KitchenPendingScreen> getAutoListOfDishes(EntityManager em) {
		TypedQuery<KitchenPendingScreen> query = 
				em.createQuery("select new edu.bionic.sverkunov.com.DAODB3.classes.KitchenPendingScreen(d.name, omi.date_time, omi.id) "
						+ "from Dish d, Orderrmenuitem omi where omi.dish_id = d.id AND omi.status = 'undone' AND "
						+ "d.is_kitchen_made = 1 order by omi.date_time", KitchenPendingScreen.class);
		
		List<KitchenPendingScreen> result = null;
		result = query.getResultList();
		return result;
	}

	@Override
	public void markOrderAsDone(EntityManager em, int orderId) {
		Orderrmenuitem omi = em.find(Orderrmenuitem.class, orderId);
		
		em.getTransaction().begin();
		omi.setStatus("kitchen done");
		em.getTransaction().commit();
	}

}
