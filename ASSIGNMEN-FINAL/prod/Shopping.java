//package com;

//public class Shopping {

//}
package prod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Shopping extends Productlist {
	static int ftotal = 0;
	Productlist p1  = new Productlist();
	Scanner sc = new Scanner(System.in);

	void selectCerals() throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			boolean choice = true;
			while (choice) {
				System.out.println("-------------------------");
				System.out.println("CEREALS-MENU");
				System.out.println("-------------------------");
				System.out.println("1.Rice");
				System.out.println("2.Wheat");
				System.out.println("-------------------------");

				System.out.println("Select your choice from Cereals-Menu: ");
				int j = sc.nextInt();
				switch (j) {

				case 1:
					int quantity;
					int price = rp;
					System.out.println("Rice: " + price + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs): ");
					quantity = sc.nextInt();
					int tot = quantity * price;

					p1.setRiceqty((p1.getRiceqty() - quantity));
					System.out.println("Cost of rice: " + tot);
					ftotal = ftotal + tot;
					System.out.println("Remaining Rice-Quantity in the shelfs  : " + p1.getRiceqty());

					break;

				case 2:
					int wheatquantity;
					int wheatprice = wp;
					System.out.println("Wheat: " + wheatprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs): : ");
					wheatquantity = sc.nextInt();
					int total = wheatquantity * wheatprice;
					p1.setWheatqty((p1.getWheatqty() - wheatquantity));
					System.out.println("Cost of wheat: " + total);
					ftotal = ftotal + total;
					System.out.println("Remaining Wheat-Quantity in the shelfs    :" + p1.getWheatqty());

					break;
				default:
					System.out.println("Invalid");
					break;
				}
		System.out.println("Do you want to selct more from Cereals-Menu?\n Enter your choice (true or false): ");
				choice = Boolean.parseBoolean(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void selectVegetables() throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			boolean choice = true;
			while (choice) {
				System.out.println("-------------------");
				System.out.println("VEGETABLES-MENU");
				System.out.println("-------------------");
				System.out.println("1.Brinjal");
				System.out.println("2.Tomato");
				System.out.println("3.Potato");
				System.out.println("4.Onion");
				System.out.println("--------------------");
				System.out.println("Select your choice from Vegetable-Menu: ");
				int j = sc.nextInt();
				switch (j) {
				case 1:
					int brinjalquantity;
					int brinjalprice = bp;
					System.out.println("Brinjal: " + brinjalprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					brinjalquantity = sc.nextInt();
					int tot = brinjalquantity * brinjalprice;
					p1.setBrinjalqty((p1.getBrinjalqty() - brinjalquantity));
					System.out.println("Cost of brinjal: " + tot);
					ftotal = ftotal + tot;
					System.out.println("Remaining Brinjal-Quantity in the shelfs  : " + p1.getBrinjalqty());

					break;
				case 2:
					int tomatoquantity;
					int tomatoprice = tp;
					System.out.println("Tomato: " + tomatoprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					tomatoquantity = sc.nextInt();
					int total = tomatoquantity * tomatoprice;
					p1.setTomatoqty((p1.getTomatoqty() - tomatoquantity));
					System.out.println("Cost of tamato: " + total);
					ftotal = ftotal + total;
					System.out.println("Remaining Tomato-Quantity in the shelfs  : "+ p1.getTomatoqty());

					break;

				case 3:
					int potatoquantity;
					int potatoprice = pp;
					System.out.println("Potato: " + potatoprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					potatoquantity = sc.nextInt();
					int total1 = potatoquantity * potatoprice;
					p1.setPotatoqty((p1.getPotatoqty() - potatoquantity));
					System.out.println("Cost of potato: " + total1);
					ftotal = ftotal + total1;
					System.out.println("Remaining Potato-Quantity in the shelfs   : " + p1.getPotatoqty());

					break;
				case 4:
					int onionquantity;
					int onionprice = op;
					System.out.println("Onion: " + onionprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					onionquantity = sc.nextInt();
					int total2 = onionquantity * onionprice;
					p1.setOnionqty((p1.getOnionqty() - onionquantity));
					System.out.println("Cost of Onions: " + total2);
					ftotal = ftotal + total2;
					System.out.println("Remaining Onion-Quantity in the shelfs    : " + p1.getOnionqty());

					break;
				default:
					System.out.println("Invalid");
					break;
				}
	System.out.println("Do you want to select more from Vegetables-Menu?\n Enter your choice (true or false): ");
				choice = Boolean.parseBoolean(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void selectFruits() throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			boolean choice = true;
			while (choice) {
				System.out.println("----------------------");
				System.out.println("FRUITS-MENU");
				System.out.println("----------------------");
				System.out.println("1.Apple");
				System.out.println("2.Grapes");
				System.out.println("3.Watermelon");
				System.out.println("4.Mangos");
				System.out.println("----------------------");
				System.out.println("Select your choice from Fruits-Menu: ");
				int j = sc.nextInt();
				switch (j) {

				case 1:
					int applequantity;
					int appleprice = ap;
					System.out.println("Apple: " + appleprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs): ");
					applequantity = sc.nextInt();
					int tot = applequantity * appleprice;
					p1.setAppleqty((p1.getAppleqty() - applequantity));
					System.out.println("Cost of apple: " + tot);
					ftotal = ftotal + tot;
					System.out.println("Remaining Apple-Quantity in the shelfs    : " + p1.getAppleqty());

					break;
				case 2:
					int grapesquantity;
					int grapesprice = gp;
					System.out.println("grapes: " + grapesprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs): ");
					grapesquantity = sc.nextInt();
					int total = grapesquantity * grapesprice;
					p1.setGrapesqty((p1.getGrapesqty() - grapesquantity));
					System.out.println("Cost of grapes: " + total);
					ftotal = ftotal + total;
					System.out.println("Remaining Grape-Quantity in the shelfs    : " + p1.getGrapesqty());
					break;
				case 3:
					int wmquantity;
					int wmprice = wp;
					System.out.println("water melon: " + wmprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					wmquantity = sc.nextInt();
					int total1 = wmquantity * wmprice;
					p1.setWatermelonqty((p1.getWatermelonqty() - wmquantity));
					System.out.println("Cost of watermelon: " + total1);
					ftotal = ftotal + total1;
					System.out.println("Remaining Watermelon-Quantity in the shelfs : " + p1.getWatermelonqty());
					break;
				case 4:
					int mquantity;
					int mprice = mp;
					System.out.println("mangos: " + mprice + " Rs(per kg)");
					System.out.println("How much Quantity you want(in kgs):  ");
					mquantity = sc.nextInt();
					int total2 = mquantity * mprice;
					p1.setMangoqty((p1.getMangoqty() - mquantity));
					System.out.println("Cost of mangoes: " + total2);
					ftotal = ftotal + total2;
					System.out.println("Remaining Mangoes-Quantity in the shelfs  : " + p1.getMangoqty());
					break;
				default:
					System.out.println("invalid");
					break;
				}
				System.out
						.println("Do you want to selct more fruits-menu(true or false): ");
				choice = Boolean.parseBoolean(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

