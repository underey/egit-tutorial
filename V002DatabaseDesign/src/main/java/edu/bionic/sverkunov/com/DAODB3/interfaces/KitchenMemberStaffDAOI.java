package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.KitchenPendingScreen;

public interface KitchenMemberStaffDAOI {

	public List<KitchenPendingScreen> getAutoListOfDishes(EntityManager em);
	
	public void markOrderAsDone(EntityManager em, int orderId);
	
}
