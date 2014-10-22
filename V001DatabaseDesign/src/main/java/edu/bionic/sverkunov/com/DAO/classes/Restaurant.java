package edu.bionic.sverkunov.com.DAO.classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int restaurant_id;
	private String restaurant_name;
	private String restaurant_phone_number;
	private String restaurant_email;
	private String restaurant_delivery_time;
	private String restaurant_price_range;
	@OneToMany(mappedBy="restaurant_id")
	private List<Customer> customers;
	
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getRestaurant_phone_number() {
		return restaurant_phone_number;
	}
	public void setRestaurant_phone_number(String restaurant_phone_number) {
		this.restaurant_phone_number = restaurant_phone_number;
	}
	public String getRestaurant_email() {
		return restaurant_email;
	}
	public void setRestaurant_email(String restaurant_email) {
		this.restaurant_email = restaurant_email;
	}
	public String getRestaurant_delivery_time() {
		return restaurant_delivery_time;
	}
	public void setRestaurant_delivery_time(String restaurant_delivery_time) {
		this.restaurant_delivery_time = restaurant_delivery_time;
	}
	public String getRestaurant_price_range() {
		return restaurant_price_range;
	}
	public void setRestaurant_price_range(String restaurant_price_range) {
		this.restaurant_price_range = restaurant_price_range;
	}
	
	
}
