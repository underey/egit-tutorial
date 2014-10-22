package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffOrd {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stafford_id;
	private int staff_id;
	private int ord_id;
	public int getStafford_id() {
		return stafford_id;
	}
	public void setStafford_id(int stafford_id) {
		this.stafford_id = stafford_id;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	
	
	
}
