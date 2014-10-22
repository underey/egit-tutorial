package edu.bionic.sverkunov.com.DAODB3.classes;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Staffrole {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String role_name;
	
	@OneToMany(mappedBy="staffrole")
	private Collection<Staff> staffs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Collection<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Collection<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public String toString() {
		return role_name;
	}
		
}
