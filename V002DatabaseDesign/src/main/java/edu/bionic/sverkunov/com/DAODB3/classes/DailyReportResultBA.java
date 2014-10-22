package edu.bionic.sverkunov.com.DAODB3.classes;

public class DailyReportResultBA {

	private int orderCounts;
	private double orderTotalSum;
	
	public DailyReportResultBA(int orderCounts, double orderTotalSum) {
		super();
		this.orderCounts = orderCounts;
		this.orderTotalSum = orderTotalSum;
	}

	@Override
	public String toString() {
		return "Number of order(s): " + orderCounts + "\nTotal price: " + orderTotalSum +"\n";
	}
	
	
}
