package com;
import java.util.ArrayList;
public class Customer {
	private int customerID;
	private String customerName;
	private long customerNo;

	ArrayList<Product> bookedProductList=new ArrayList<Product>();
	
	public void addBookedProduct(Product obj){
		obj.setProductStatus("unavailable");
		bookedProductList.add(obj);
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public Customer(int customerID, String customerName, long number) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerNo = number;
	}
	
	


}



