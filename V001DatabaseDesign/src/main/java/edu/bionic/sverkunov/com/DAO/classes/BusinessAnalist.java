package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;

@Entity
public class BusinessAnalist extends Staff {

	private int businessanalyst_id;
	private int staffrole_id;
	private int staff_id;
	public int getBusinessanalyst_id() {
		return businessanalyst_id;
	}
	public void setBusinessanalyst_id(int businessanalyst_id) {
		this.businessanalyst_id = businessanalyst_id;
	}
	public int getStaffrole_id() {
		return staffrole_id;
	}
	public void setStaffrole_id(int staffrole_id) {
		this.staffrole_id = staffrole_id;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	
	
}
