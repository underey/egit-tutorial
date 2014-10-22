package edu.bionic.sverkunov.com.DAODB3.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.ResultCustomerForAdmin;
import edu.bionic.sverkunov.com.DAODB3.classes.ResultStaffForAdmin;
import edu.bionic.sverkunov.com.DAODB3.classes.Staff;
import edu.bionic.sverkunov.com.DAODB3.interfaces.WebSequrityGuardDAOI;

public class WebSecurityGuardDAO implements WebSequrityGuardDAOI {

	// @Override
	// public void setRights(EntityManager em, int custId, int access) {
	// Customer cus = em.find(Customer.class, custId);
	// Accesslevel accesslevel = em.find(Accesslevel.class, access);
	//
	// em.getTransaction().begin();
	// cus.setAccesslevel(accesslevel);
	// em.getTransaction().commit();
	// }

	@Override
	public void setBlockCustomer(EntityManager em, int custId) {
		Customer c = em.find(Customer.class, custId);

		em.getTransaction().begin();
		c.setIsactivated(false);
		em.getTransaction().commit();
	}

	@Override
	public void setUnlocCustomer(EntityManager em, int custId) {
		Customer c = em.find(Customer.class, custId);

		em.getTransaction().begin();
		c.setIsactivated(true);
		em.getTransaction().commit();
	}

	@Override
	public ResultCustomerForAdmin getCustomerInfoById(EntityManager em,
			int custId) {
		Customer c = em.find(Customer.class, custId);
		ResultCustomerForAdmin resultCustomer = new ResultCustomerForAdmin(
				c.getId(), c.getName(), c.getSurname(), c.getLogin(),
				c.getBirthday(), c.getCity(), c.getStreet(), c.getBuilding(),
				c.getApp(), c.getEmail(), c.getPayment_info(), c.getPhone(),
				c.isIsactivated());
		return resultCustomer;
	}

	@Override
	public List<Customer> getAllCustomers(EntityManager em) {
		TypedQuery<Customer> query = em.createQuery("select c from Customer c",
				Customer.class);

		List<Customer> result = null;
		result = query.getResultList();
		return result;
	}

	@Override
	public List<Staff> getAllStaff(EntityManager em) {
		TypedQuery<Staff> query = em.createQuery("select s from Staff s",
				Staff.class);

		List<Staff> result = null;
		result = query.getResultList();
		return result;
	}

	@Override
	public ResultStaffForAdmin getStaffInfoById(EntityManager em, int staffId) {
		Staff s = em.find(Staff.class, staffId);
		ResultStaffForAdmin resultStaff = new ResultStaffForAdmin(s.getId(),
				s.getName(), s.getSurname(), s.getLogin(), s.getEmail(),
				s.isIsactivated(), s.getAccesslevel(), s.getStaffrole());
		return resultStaff;
	}

	@Override
	public void setBlockStaff(EntityManager em, int staffId) {
		Staff s = em.find(Staff.class, staffId);

		em.getTransaction().begin();
		s.setIsactivated(false);
		em.getTransaction().commit();
	}

	@Override
	public void setUnlocStaff(EntityManager em, int staffId) {
		Staff s = em.find(Staff.class, staffId);

		em.getTransaction().begin();
		s.setIsactivated(true);
		em.getTransaction().commit();
	}

	@Override
	public void signUpStaffPerson(EntityManager em, Staff staff) {
		em.getTransaction().begin();
		em.persist(staff);
		em.getTransaction().commit();
	}

}
