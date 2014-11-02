package edu.bionic.sverkunov.com.DAODB3.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import edu.bionic.sverkunov.com.DAODB3.DAO.WebSecurityGuardDAO;
import edu.bionic.sverkunov.com.DAODB3.classes.Accesslevel;
import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.ResultCustomerForAdmin;
import edu.bionic.sverkunov.com.DAODB3.classes.Staff;
import edu.bionic.sverkunov.com.DAODB3.classes.Staffrole;

public class WebSecurityGuardDAOtest {
	private static final String UNIT_NAME = "restDB3";
	private static EntityManagerFactory factory;

	@Test
	public void test1() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		WebSecurityGuardDAO guardDAO = new WebSecurityGuardDAO();
		try {
			guardDAO.setBlockCustomer(em, 1);

			Customer customer = em.find(Customer.class, 1);
			boolean ans = customer.isIsactivated();
			assertEquals(false, ans);
		} finally {
			em.close();
		}

	}
	
	@Test
	public void test2() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		WebSecurityGuardDAO guardDAO = new WebSecurityGuardDAO();
		try {
			guardDAO.setUnlocCustomer(em, 1);

			Customer customer = em.find(Customer.class, 1);
			boolean ans = customer.isIsactivated();
			assertEquals(true, ans);
		} finally {
			em.close();
		}

	}
	
	@Test
	public void test3() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		WebSecurityGuardDAO guardDAO = new WebSecurityGuardDAO();
		try {
			ResultCustomerForAdmin admin = guardDAO.getCustomerInfoById(em, 1);
			
			int ans = admin.getId();
			assertEquals(1, ans);
		} finally {
			em.close();
		}

	}
	
	@Test
	public void test4() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		WebSecurityGuardDAO guardDAO = new WebSecurityGuardDAO();
		try {
			List<Customer> df = guardDAO.getAllCustomers(em);

			int ans = df.size();
			assertEquals(3, ans);
		} finally {
			em.close();
		}

	}
	
	@Test
	public void test5() {
		factory = Persistence.createEntityManagerFactory(UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		WebSecurityGuardDAO guardDAO = new WebSecurityGuardDAO();
		try {
			Staff staff = new Staff();
			Accesslevel accesslevel = em.find(Accesslevel.class, 3);
			Staffrole staffrole = em.find(Staffrole.class, 1);
			staff.setAccesslevel(accesslevel);
			staff.setEmail("madmax@gmail.com");
			staff.setIsactivated(true);
			staff.setLogin("madmax3000");
			staff.setName("Max");
			staff.setPassword("1234567");
			staff.setStaffrole(staffrole);
			staff.setSurname("Mad");
			guardDAO.signUpStaffPerson(em, staff);
			
			int staffId1 = staff.getId();
			String name1 = staff.getName();
			Staff sta = em.find(Staff.class, staffId1);
//			System.out.println(sta);
			String name2 = sta.getName();
			assertEquals(name1, name2);
			
//			boolean act1  = sta.isIsactivated();
//			guardDAO.setBlockCustomer(em, staffId1);
//			assertEquals(false, act1);
		} finally {
			em.close();
		}

	}
	
	
}
