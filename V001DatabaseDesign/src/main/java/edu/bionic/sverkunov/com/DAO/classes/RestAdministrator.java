package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;

@Entity
public class RestAdministrator extends Staff{

	private int restadministrator_id;
	private int staffrole_id;
	private int staff_id;
	public int getRestadministrator_id() {
		return restadministrator_id;
	}
	public void setRestadministrator_id(int restadministrator_id) {
		this.restadministrator_id = restadministrator_id;
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
