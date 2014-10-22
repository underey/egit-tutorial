package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Orderr {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String status;
	private Timestamp date_time;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToMany
	@JoinTable(name="Orderrmenuitem", joinColumns=@JoinColumn(name="orderr_id"),
	inverseJoinColumns=@JoinColumn(name="dish_id"))
	private Collection<Dish> dishes;

	public Collection<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(Collection<Dish> dishes) {
		this.dishes = dishes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getDate_time() {
		return date_time;
	}

	public void setDate_time(Timestamp timestamp) {
		this.date_time = timestamp;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
