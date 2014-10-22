package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.Menusection;
import edu.bionic.sverkunov.com.DAODB3.classes.ReportResultBA;

public interface BusinessAnalystDAOI {

	public ReportResultBA getDailyRepor(EntityManager em, Timestamp from,
			Timestamp until);
	
	public ReportResultBA getDailyReport(EntityManager em, Timestamp from,
			Timestamp until, int menuId);
	
	public List<Menusection> getMenusection(EntityManager em);
}
