package edu.bionic.sverkunov.com.DAODB3.tests;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import edu.bionic.sverkunov.com.DAODB3.DAO.BusinessAnalystDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.ReportResultBA;
import edu.bionic.sverkunov.com.DAODB3.interfaces.BusinessAnalystDAOI;

public class BusinessAnalystDAOtest {
	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	@Test
	public void test() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		BusinessAnalystDAOI b = new BusinessAnalystDAO();
		Timestamp from = Timestamp.valueOf("2014-10-23 10:10:10.0");
		Timestamp until = Timestamp.valueOf("2014-10-23 14:10:10.0");
		ReportResultBA rrba = b.getDailyRepor(em, from, until);
		long orderNumbers = rrba.getOrderCountsOrderr();
		assertEquals(6, orderNumbers);
		
	}
}
