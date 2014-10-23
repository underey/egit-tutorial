package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.Menusection;
import edu.bionic.sverkunov.com.DAODB3.classes.ReportResultBA;
import edu.bionic.sverkunov.com.DAODB3.interfaces.BusinessAnalystDAOI;

public class BusinessAnalystDAO implements BusinessAnalystDAOI {

	@Override
	public ReportResultBA getDailyRepor(EntityManager em, Timestamp from,
			Timestamp until) {
		TypedQuery<ReportResultBA> query = em.createQuery(
						"select new edu.bionic.sverkunov.com.DAODB3.classes.ReportResultBA(count(o.id), sum(omi.price))"
						+ " from Orderr o, Orderrmenuitem omi, Dish d where omi.orderr_id = o.id AND omi.dish_id = d.id "
								+ "AND omi.date_time between ?1 AND ?2",
						ReportResultBA.class);
		ReportResultBA result = null;

		query.setParameter(1, from);
		query.setParameter(2, until);
		result = query.getSingleResult();
		return result;
	}

	@Override
	public ReportResultBA getDailyReport(EntityManager em, Timestamp from,
			Timestamp until, int menuId) {
		TypedQuery<ReportResultBA> query = em
				.createQuery(
						"select new edu.bionic.sverkunov.com.DAODB3.classes.ReportResultBA(count(o.id), sum(omi.price))"
						+ " from Orderr o, Orderrmenuitem omi, Dish d where d.menusection_id = ?1 AND omi.orderr_id = o.id AND omi.dish_id = d.id "
								+ "AND omi.date_time between ?2 AND ?3",
						ReportResultBA.class);
		ReportResultBA result = null;

		query.setParameter(1, menuId);
		query.setParameter(2, from);
		query.setParameter(3, until);
		result = query.getSingleResult();
		return result;
	}

	@Override
	public List<Menusection> getMenusection(EntityManager em) {
		TypedQuery<Menusection> query = em.createQuery("select m from Menusection m",Menusection.class);
		List<Menusection> result = null;
		
		result = query.getResultList();
		return result;
	}

}
