package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.DeliveryPendingScreen;

public interface DeliveryMemberStaffDAOI {

	public List<DeliveryPendingScreen> getListOfOrders(EntityManager em);
	
	public void setDeliveringStatus(EntityManager em, int orderrId);
	
	public void setDeliveredStatus(EntityManager em, int orderrId);
}
