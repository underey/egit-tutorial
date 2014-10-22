package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;

@Entity
public class Administrator extends Staff {

	private int administartor_id;
	private int staffrole_id;
	private int staff_id;
	public int getAdministartor_id() {
		return administartor_id;
	}
	public void setAdministartor_id(int administartor_id) {
		this.administartor_id = administartor_id;
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
