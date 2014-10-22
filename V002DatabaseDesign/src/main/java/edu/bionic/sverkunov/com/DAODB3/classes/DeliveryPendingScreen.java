package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Timestamp;

public class DeliveryPendingScreen {

	private int orderrId;
	private String status;
	private Timestamp timestamp;

	public DeliveryPendingScreen(int orderrId, String status,
			Timestamp timestamp) {
		this.orderrId = orderrId;
		this.status = status;
		this.timestamp = timestamp;
	}

	public int getOrderrId() {
		return orderrId;
	}

	public void setOrderrId(int orderrId) {
		this.orderrId = orderrId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return orderrId + " " + status;
	}

}
