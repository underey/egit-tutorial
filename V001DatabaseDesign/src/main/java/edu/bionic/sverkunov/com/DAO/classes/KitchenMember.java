package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;

@Entity
public class KitchenMember extends Staff{

	private int kitchenmember_id;
	private int staffrole_id;
	private int staff_id;
	public int getKitchenmember_id() {
		return kitchenmember_id;
	}
	public void setKitchenmember_id(int kitchenmember_id) {
		this.kitchenmember_id = kitchenmember_id;
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
