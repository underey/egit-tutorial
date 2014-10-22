package edu.bionic.sverkunov.com.DAO.classes;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ord {
	
	@Id
	@GeneratedValue
	private int order_id;
	private Date order_date_time;
	private String order_status;
	private int order_menu_item_id;
	private int customer_id;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_date_time() {
		return order_date_time;
	}
	public void setOrder_date_time(Date order_date_time) {
		this.order_date_time = order_date_time;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public int getOrder_menu_item_id() {
		return order_menu_item_id;
	}
	public void setOrder_menu_item_id(int order_menu_item_id) {
		this.order_menu_item_id = order_menu_item_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	

}
