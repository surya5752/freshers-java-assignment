package prod;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;



public class Cartadd{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Use> Shoppingcart=new ArrayList<Use>();
		ArrayList<Integer> intList=new ArrayList<Integer>();
		boolean keepGoing=true;
		int choice=0;
		int input=0;
		int index=0;
		int total=0;
		Integer item;
		while(keepGoing){
			System.out.println("/nMenu");
			System.out.println("1 Add an item to your cart");
			System.out.println("2 Remove an item to your cart");
			System.out.println("3 View the items in  your cart");
			System.out.println("4 exit and add up the total");
			System.out.println("5 Empty  your cart");
			System.out.println("6 exit");
			System.out.println("select a menu option");
			choice=scan.nextInt();
			if(choice<1 || choice>6){
				System.out.println("enter a value between 1 and 6:");
			}else{
				switch(choice){
				case 1:
					//add an integer
					System.out.println("enter an item:");
					
					input=scan.nextInt();
					item=new Integer(input);
					intList.add(item);
					//intlist.add(input);
					break;
				case 2:
					//remove from the list
					System.out.println("enter an item to remove:");
					input=scan.nextInt();
					item =new Integer(input);
					if(intList.contains(item)){
						intList.remove(item);
						System.out.println(item+"has been removed:");
					}else{
					System.out.println(item+"was not found in your  cart");
					}
					break;
				case 3:
					//view items in your cart
					System.out.println("intList");
					break;
				case 4:
					//exit and add up the total
					for(int i=0;i<intList.size();i++){
						item=intList.get(i);
						total=total+item.intValue();
					}
					System.out.println("Total is+total");
					keepGoing=false;
					break;
				case 5:
					intList.clear();
					break;
				case 6:
					
					keepGoing=false;
					System.out.println("end ");
					break;
					
					
					
					}
					}
					}
	}
}
