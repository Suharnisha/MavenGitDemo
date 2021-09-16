package com.lti.demo;

public class Product {
	private int prdId;
	private String prdName;
	private double prdCost;	
	private String companyName="DMART";
	
	public Product(int prdId, String prdName, double prdCost, String companyName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		this.companyName = companyName;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + ", companyName="
				+ companyName + "]";
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public double getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
