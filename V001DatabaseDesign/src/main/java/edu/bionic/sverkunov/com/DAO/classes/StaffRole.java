package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffRole {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int staffrole_id;
	private String staffrole_name;
	private String staffrole_description;
	public int getStaffrole_id() {
		return staffrole_id;
	}
	public void setStaffrole_id(int staffrole_id) {
		this.staffrole_id = staffrole_id;
	}
	public String getStaffrole_name() {
		return staffrole_name;
	}
	public void setStaffrole_name(String staffrole_name) {
		this.staffrole_name = staffrole_name;
	}
	public String getStaffrole_description() {
		return staffrole_description;
	}
	public void setStaffrole_description(String staffrole_description) {
		this.staffrole_description = staffrole_description;
	}
	
	
}
