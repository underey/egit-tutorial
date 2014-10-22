package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dish {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dish_id;
	private String dish_name;
	private String dish_weight;
	private double dish_price;
	private String dish_description;
	private boolean is_kitchen_made;
	private int menusection_id;
	public int getDish_id() {
		return dish_id;
	}
	public void setDish_id(int dish_id) {
		this.dish_id = dish_id;
	}
	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public String getDish_weight() {
		return dish_weight;
	}
	public void setDish_weight(String dish_weight) {
		this.dish_weight = dish_weight;
	}
	public double getDish_price() {
		return dish_price;
	}
	public void setDish_price(double dish_price) {
		this.dish_price = dish_price;
	}
	public String getDish_description() {
		return dish_description;
	}
	public void setDish_description(String dish_description) {
		this.dish_description = dish_description;
	}
	public boolean isIs_kitchen_made() {
		return is_kitchen_made;
	}
	public void setIs_kitchen_made(boolean is_kitchen_made) {
		this.is_kitchen_made = is_kitchen_made;
	}
	public int getMenusection_id() {
		return menusection_id;
	}
	public void setMenusection_id(int menusection_id) {
		this.menusection_id = menusection_id;
	}
	
	
}
