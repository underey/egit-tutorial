package edu.bionic.sverkunov.com.DAODB3.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import edu.bionic.sverkunov.com.DAODB3.classes.Customer;
import edu.bionic.sverkunov.com.DAODB3.classes.ResultCustomerForAdmin;
import edu.bionic.sverkunov.com.DAODB3.classes.ResultStaffForAdmin;
import edu.bionic.sverkunov.com.DAODB3.classes.Staff;

public interface WebSequrityGuardDAOI {

	// public void setRights(EntityManager em, int custId, int right); 
	// aks about transfer staff member from customers table

	public void setBlockCustomer(EntityManager em, int custId);

	public void setUnlocCustomer(EntityManager em, int custId);

	public void setBlockStaff(EntityManager em, int staffId);

	public void setUnlocStaff(EntityManager em, int staffId);

	public List<Customer> getAllCustomers(EntityManager em);

	public List<Staff> getAllStaff(EntityManager em);
	
	public ResultCustomerForAdmin getCustomerInfoById(EntityManager em, int custId);

	public ResultStaffForAdmin getStaffInfoById(EntityManager em, int staffId);
	
	public void signUpStaffPerson(EntityManager em, Staff staff);

}
