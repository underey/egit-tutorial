package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Timestamp;

public class KitchenPendingScreen {

	private String dishName;
	private Timestamp orderTimestamp;
	private int orderrMenuItemId;
	
	public KitchenPendingScreen(String dishName, Timestamp orderTimestamp,
			int orderrMenuItemId) {
		this.dishName = dishName;
		this.orderTimestamp = orderTimestamp;
		this.orderrMenuItemId = orderrMenuItemId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Timestamp getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Timestamp orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public int getOrderrMenuItemId() {
		return orderrMenuItemId;
	}

	public void setOrderrMenuItemId(int orderrMenuItemId) {
		this.orderrMenuItemId = orderrMenuItemId;
	}

	@Override
	public String toString() {
		return "name: " + dishName + 
				"\ntime: " + orderTimestamp; 
	}
	
}
