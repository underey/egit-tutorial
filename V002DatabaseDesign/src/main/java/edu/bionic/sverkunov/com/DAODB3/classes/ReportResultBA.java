package edu.bionic.sverkunov.com.DAODB3.classes;


public class ReportResultBA {

	private int orderCountsOrderr;
	private double orderSumOrderrMenuItems;

	public ReportResultBA(int orderCountsOrderr, double orderSumOrderrMenuItems) {
		this.orderCountsOrderr = orderCountsOrderr;
		this.orderSumOrderrMenuItems = orderSumOrderrMenuItems;
	}

	public int getOrderCountsOrderr() {
		return orderCountsOrderr;
	}
	public void setOrderCountsOrderr(int orderCountsOrderr) {
		this.orderCountsOrderr = orderCountsOrderr;
	}
	public double getOrderSumOrderrMenuItems() {
		return orderSumOrderrMenuItems;
	}
	public void setOrderSumOrderrMenuItems(double orderSumOrderrMenuItems) {
		this.orderSumOrderrMenuItems = orderSumOrderrMenuItems;
	}
	
	
}
