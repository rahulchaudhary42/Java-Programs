package com.bridgelabz.oopsprograms.commercialdataprocessing;
 

public class CommercialUserPojo {

	private String userName;
	private String noOfShares;
	private String price;
	
	public CommercialUserPojo(){		
	}	
	public CommercialUserPojo(String userName, String noOfShares, String price) {
		super();
		this.userName = userName;
		this.noOfShares = noOfShares;
		this.price = price;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(String noOfShares) {
		this.noOfShares = noOfShares;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}	
}