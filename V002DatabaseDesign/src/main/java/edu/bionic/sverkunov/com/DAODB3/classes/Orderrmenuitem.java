	package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderrmenuitem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String status;
	private Timestamp date_time;
	private double price;
	private int orderr_id;
	private int dish_id;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getDate_time() {
		return date_time;
	}

	public void setDate_time(Timestamp date_time) {
		this.date_time = date_time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderr_id() {
		return orderr_id;
	}

	public void setOrderr_id(int orderr_id) {
		this.orderr_id = orderr_id;
	}

	public int getDish_id() {
		return dish_id;
	}

	public void setDish_id(int dish_id) {
		this.dish_id = dish_id;
	}

}
