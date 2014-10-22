package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.DeliveryPendingScreen;
import edu.bionic.sverkunov.com.DAODB3.classes.Orderr;
import edu.bionic.sverkunov.com.DAODB3.interfaces.DeliveryMemberStaffDAOI;

public class DeliveryMemberStaffDAO implements DeliveryMemberStaffDAOI {

	@Override
	public List<DeliveryPendingScreen> getListOfOrders(EntityManager em) {
		TypedQuery<DeliveryPendingScreen> query = em
				.createQuery(
						"select new edu.bionic.sverkunov.com.DAODB3.classes.DeliveryPendingScreen(o.id, o.status, o.date_time) "
								+ "from Orderr o where o.status = 'ready for shipment'",
						DeliveryPendingScreen.class);

		List<DeliveryPendingScreen> result = null;
		result = query.getResultList();
		return result;
	}

	@Override
	public void setDeliveringStatus(EntityManager em, int orderrId) {
		Orderr orderr = em.find(Orderr.class, orderrId);
		em.getTransaction().begin();
		orderr.setStatus("delivering");
		em.getTransaction().commit();
	}

	@Override
	public void setDeliveredStatus(EntityManager em, int orderrId) {
		Orderr orderr = em.find(Orderr.class, orderrId);
		em.getTransaction().begin();
		orderr.setStatus("delivered");
		em.getTransaction().commit();
	}

}
