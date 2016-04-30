package com;

import java.util.ArrayList;
public class SuperMarket {
		String storeName;
		ArrayList<Customer> custList=new ArrayList<Customer>();
		ArrayList<Product> productList=new ArrayList<Product>();
		
		public int generateCustomerID()
		{
			int count=0;
			int custId=0;
			if(custList.size()==0)
				custId=1;
			else
			{
				for(Customer cust:custList)
				{
					count++;
					if(count==custList.size())
					{	
						custId=cust.getCustomerID()+1;
						break;
					}
				}
			}
			return custId;
		}
		public int generateProductID()
		{
			int count=0;
			int prodId=0;
			if(productList.size()==0)
				prodId=1;
			else
			{
				for(Product prod:productList)
				{
					count++;
					if(count==productList.size())
					{
						prodId=prod.getProductID()+1;
						break;
					}
				}
			}
			return prodId;
		}
		
	public void addCustomer(String name,long number)
	{	
		int custId=generateCustomerID();
		Customer c=new Customer(custId,name,number);
			custList.add(c);
			
	}
		
		public void addProduct(String name,String status,double price)
			{
				int pid=generateProductID();
				
				Product p=new Product(pid, name,price);
				p.getProductStatus(status);
				productList.add(p);
				
						}
	
		
	//private int generateProductID() {
			// TODO Auto-generated method stub
			//return 0;
		//}

	public int checkProductAvailability(String ProductName)
	{
		int count=0;
		for(Product prod:productList)
			if((prod.getProductName().equals(ProductName)) && (prod.getProductStatus(null).equals("Available"))){
				count++;}
		if(count>0)
		{System.out.println("available");}
		
		return count;
	}
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public SuperMarket(String storeName) {
		super();
		this.storeName = storeName;
	}
	public void display() {
			
			for(Customer cust:custList){
				System.out.println("Name: " +cust.getCustomerName()+" Number :  "+cust.getCustomerNo()+" ID: "+cust.getCustomerID());
			}
			for(Product pd:productList){
				System.out.println("Pd Name  : "+pd.getProductName()+"Price  : "+pd.getProductPrice()+ " P ID   : "+pd.getProductID()+"    status   :"+pd.getProductStatus( null ));
				
			}
		
		}
	
		
		public long bookProduct(int CustomerID,String ProductName, long number) 
		{
			long availProduct=-1;
			int count1=0;
			int count2=0;
			//availProduct=checkProductAvailability(ProductName);
			long count3=availProduct;
			long count4=number;
			
			loop:	for(Customer cust:custList)
				{
					count1++;
					if(cust.getCustomerID()==CustomerID)
					{
						for(Product prod:productList)
						{
							count2++;
							if(prod.getProductName().equals(ProductName))
							{	
								
								if(availProduct<=number)
									{cust.addBookedProduct(prod);
									count3--;
								if(count3==0)
  									break loop;
								}
								if(availProduct>number)

								{availProduct=number;
								cust.addBookedProduct(prod);
									count4--;
								if(count4==0)
  									break loop;}
								
							}
							else if(count2==productList.size())
							{availProduct=0;break loop;}
						}
						
					}
					else if(count1==custList.size())
						{availProduct=-1;break loop;}
				}
		return availProduct;
		}
		
		public double calculateNetAmount(int customerID, double discount)
		{
				double cost=0;
				for(Customer cust:custList)
					if(cust.getCustomerID()==customerID)
						{
							ArrayList<Product> prodList1=cust.bookedProductList;
							for(Product p:prodList1)
								{cost+=p.getProductPrice();
								
								}
							
							break;
						}
						
				cost= cost - ((cost/100)*discount);
				//total=cost*products qty;
				System.out.println("the amount after disount "+ cost);
				return cost;
		}
		
		public void addProduct(String ss_name, double price) {
			
		}
}