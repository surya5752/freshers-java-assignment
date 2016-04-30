package com;
import prod.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Billing_Main {
       private static final String Supermarket = null;

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		SuperMarket ob=new SuperMarket(Supermarket);
		CartsInfo obj = new CartsInfo();
		Manage man = new Manage();
	
		int ss_id=0;
		String ss_name="";
		String ss=" ";
		//int n=1;
		long number = 0;
		
		int ch;
		System.out.println("\t\t\tSUPERMARKET SIMULATION PROCESS:");
		System.out.println("\n\t0.supermarket entering process\n\t1.customer registration\t2.carts/baskets info\n\t3.product list in the shelfs\n\t4.add product with customer choice\t5.check product availability\n\t6.display the details\n\t7.add product to the cart\n\t8.calculate net amount\n\t9.Exit/Exittime");			

		do{
			
		     ch=Integer.parseInt(br.readLine());
			switch(ch){
			    case 0:     System.out.println("----------------");
				        System.out.println("WELCOME TO SUPERMARKET");
				        System.out.println("----------------\n");
				   
				        System.out.println("Outside things not allowed please Deposite your bags and luggages in the counter");
				        System.out.println("checking process done one by one ");
				        System.out.println("please go for registration");
				        break;
			    case 1:
						System.out.println("------customer registration-------");
						System.out.println("Enter the name of customer:");
						ss_name=br.readLine();
						System.out.println("enter the contact number");
						number=Long.parseLong(br.readLine());
						System.out.println("customer entering time");
						Date d=new Date();
						System.out.println(d);
						
						ob.addCustomer(ss_name,number);
						System.out.println("customer details added");
						 
		                break;
						
				case 2:        System.out.println("-------provide cart for customer");
		                  Thread t1 = new Thread(obj);
		                t1.setName("customer");     
		                t1.start();
		                  break;
				case 3:      System.out.println("prodcts avalable in the shelfs");
				          man.menu();
				         
				          break;
				
				case 4:		System.out.println("------add product details for customer choice-------");
						System.out.println("Enter product name:");
						ss_name=br.readLine();
						//System.out.println("Enter product id:");
						//ss_id=br.read();
						System.out.println("enter the status");
						ss=br.readLine();
						System.out.println("Enter the price of product:");
						@SuppressWarnings("unused")
						Double price=Double.parseDouble(br.readLine());
						
						ob.addProduct(ss_name,ss,price);
					System.out.println("product details added");
						break;
						
				case 5:		System.out.println("------check Availability-------");
						System.out.println("Enter the product name:");
						ss_name=br.readLine();
					
						int number1=ob.checkProductAvailability(ss_name);
						System.out.println("available product="+number1);
						break;
				case 6:		System.out.println("------Display-------");
				        System.out.println("Available shoppers in the supermarket");
				
						ob.display();
						break;
				case 7:		System.out.println("------add to cart Product-------");
						System.out.println("Enter the customer id:");
						ss_id=Integer.parseInt(br.readLine());
						System.out.println("enter the product name");
						ss_name=br.readLine();
						System.out.println("Enter the number of products:");
						number=Integer.parseInt(br.readLine());
						ob.bookProduct(ss_id, ss_name, number);
						System.out.println("product added to cart");
						break;
				case 8:		System.out.println("------calculate cost-------");
						System.out.println("Enter the customer id:");
						ss_id=Integer.parseInt(br.readLine());
						System.out.println("Enter the discount:");
						double discount=Double.parseDouble(br.readLine());
						
						double cost=ob.calculateNetAmount(ss_id, discount);
						cost=cost*number;
						System.out.println("Total cost="+cost);
						break;
			
				case 9:		System.out.println("exit");
				            Date d1= new Date();
				            System.out.println("customer exit time:"+d1);
				
						break;
						
			default:System.out.println("Invalid option!!");	
							
	}

	}
	while(ch!=9);
		}
	}
