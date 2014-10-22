package edu.bionic.sverkunov.com.dirctlytest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.DAO.WebSecurityGuardDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.interfaces.WebSequrityGuardDAOI;

public class TestTest7 {
	private static final String PERSISTENCE_UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		try {
			Customer customer = em.find(Customer.class, 3);
			int custId = customer.getId();
			WebSequrityGuardDAOI adm = new WebSecurityGuardDAO();
//			adm.setRights(custId, 3);
//			adm.setBlock(custId);
//			adm.getCustomerInfoById(2);
//			adm.getCustomerInfoById(3);
//					adm.getAllCustomers();
		} finally {
			em.close();
		}

	}

}
