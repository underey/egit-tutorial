package edu.bionic.sverkunov.com.dirctlytest;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.bionic.sverkunov.com.DAODB3.DAO.BusinessAnalystDAO;
import edu.bionic.sverkunov.com.DAODB3.interfaces.BusinessAnalystDAOI;

public class TestTest9 {
	private static final String PERSISTENCE_UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;
	
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		BusinessAnalystDAOI analyst = new BusinessAnalystDAO();
		
		Timestamp from = Timestamp.valueOf("2014-10-14 21:30:00.0");
		Timestamp until = Timestamp.valueOf("2014-10-14 21:40:00.0");
//		analyst.getMainReport(1, from, until);
	}

}
