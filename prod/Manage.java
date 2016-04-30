

package prod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Manage {
	public void menu() throws IOException {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Shopping s = new Shopping();
			//System.out.println("----------------");
			//System.out.println("WELCOME TO SUPERMARKET");
			//System.out.println("----------------\n");
			boolean choice = true;
			while (choice) {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("----------------");
				System.out.println("   Items present in the shelfs   ");
				System.out.println("----------------");
				System.out.println(" 1.cereals     ");
				System.out.println(" 2.vegetables ");
				System.out.println(" 3.fruits     ");
				System.out.println("----------------");
				System.out.println("Select what u want : ");
				int i = sc.nextInt();
				switch (i) {
				case 1:
					s.selectCerals();
					break;
				case 2:
					s.selectVegetables();
					break;
				case 3:
					s.selectFruits();
					break;
				default:
					System.out.println("invalid");
					break;
				}
		System.out.println("Do u want to selct more from main menu(true or false): ");
				choice = Boolean.parseBoolean(br.readLine());
			System.out.println("if you want the product which is not available in the shelfs then go and book your product");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



