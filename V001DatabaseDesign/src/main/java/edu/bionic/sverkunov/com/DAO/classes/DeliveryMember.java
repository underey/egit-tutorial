package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;

@Entity
public class DeliveryMember extends Staff{

	private int deliverymember_id;
	private int staffrole_id;
	private int staff_id;
	public int getDeliverymember_id() {
		return deliverymember_id;
	}
	public void setDeliverymember_id(int deliverymember_id) {
		this.deliverymember_id = deliverymember_id;
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
