package prod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Use {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean choice = true;
		while (choice) {
			
			System.out.println("1.The available products present in supermarket-list:");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			//Customer c=new Customer(1, sur,, null);
			//Productlist p = new Productlist();
			@SuppressWarnings("unused")
			Shopping a = new Shopping();
			Manage man = new Manage();
			
			switch (k) {
			case 1:
			
				man.menu();
				break;
		
			default:
				System.out.println("Invalid Option and no products available");
				break;
			}
			System.out.println("Do you want to go Home Enter your choice true or false:");
			choice = Boolean.parseBoolean(br.readLine());
		}
	}
}


