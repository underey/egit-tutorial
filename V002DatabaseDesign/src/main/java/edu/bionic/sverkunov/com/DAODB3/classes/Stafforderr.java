package edu.bionic.sverkunov.com.DAODB3.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stafforderr {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int staff_id;
	private int orderr_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public int getOrderr_id() {
		return orderr_id;
	}
	public void setOrderr_id(int orderr_id) {
		this.orderr_id = orderr_id;
	}
	
	
	
}
