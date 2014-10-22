package edu.bionic.sverkunov.com.DAODB3.classes;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Accesslevel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int level_of_access;
	
	public int getLevel_of_access() {
		return level_of_access;
	}

	public void setLevel_of_access(int level_of_access) {
		this.level_of_access = level_of_access;
	}

	@OneToMany(mappedBy="accesslevel")
	Collection<Customer> customers;
	
	@OneToMany(mappedBy="accesslevel")
	Collection<Staff> staffs;
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return " " + level_of_access;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}

	public Collection<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Collection<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + level_of_access;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accesslevel other = (Accesslevel) obj;
		if (id != other.id)
			return false;
		if (level_of_access != other.level_of_access)
			return false;
		return true;
	}

}
