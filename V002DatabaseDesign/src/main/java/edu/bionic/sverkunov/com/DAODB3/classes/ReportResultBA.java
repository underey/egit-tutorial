package edu.bionic.sverkunov.com.DAODB3.classes;


public class ReportResultBA {

	private long orderCountsOrderr;
	private double orderSumOrderrMenuItems;

	public ReportResultBA(long orderCountsOrderr, double orderSumOrderrMenuItems) {
		this.orderCountsOrderr = orderCountsOrderr;
		this.orderSumOrderrMenuItems = orderSumOrderrMenuItems;
	}

	public long getOrderCountsOrderr() {
		return orderCountsOrderr;
	}

	public void setOrderCountsOrderr(long orderCountsOrderr) {
		this.orderCountsOrderr = orderCountsOrderr;
	}

	public double getOrderSumOrderrMenuItems() {
		return orderSumOrderrMenuItems;
	}

	public void setOrderSumOrderrMenuItems(double orderSumOrderrMenuItems) {
		this.orderSumOrderrMenuItems = orderSumOrderrMenuItems;
	}

	
	
	
}
