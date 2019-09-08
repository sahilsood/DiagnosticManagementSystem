package com.org.TO;

public class HealthPlanTO {
	private int planId;
	private String planName,planDetails,planDays,price;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
	public String getPlanDays() {
		return planDays;
	}
	public void setPlanDays(String planDays) {
		this.planDays = planDays;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
