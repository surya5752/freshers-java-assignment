
package prod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Productlist {
	private int riceqty = 100;
	private int wheatqty = 100;
	private int brinjalqty = 100;
	private int tomatoqty = 100;
	private int potatoqty = 100;
	private int onionqty = 100;
	private int appleqty = 100;
	private int grapesqty = 100;
	private int watermelonqty = 100;
	private int mangoqty = 100;

	public int getRiceqty() {
		return riceqty;
	}

	public void setRiceqty(int riceqty) {
		this.riceqty = riceqty;
	}

	public int getWheatqty() {
		return wheatqty;
	}

	public void setWheatqty(int wheatqty) {
		this.wheatqty = wheatqty;
	}

	public int getBrinjalqty() {
		return brinjalqty;
	}

	public void setBrinjalqty(int brinjalqty) {
		this.brinjalqty = brinjalqty;
	}

	public int getTomatoqty() {
		return tomatoqty;
	}

	public void setTomatoqty(int tomatoqty) {
		this.tomatoqty = tomatoqty;
	}

	public int getPotatoqty() {
		return potatoqty;
	}

	public void setPotatoqty(int potatoqty) {
		this.potatoqty = potatoqty;
	}

	public int getOnionqty() {
		return onionqty;
	}

	public void setOnionqty(int onionqty) {
		this.onionqty = onionqty;
	}

	public int getAppleqty() {
		return appleqty;
	}

	public void setAppleqty(int appleqty) {
		this.appleqty = appleqty;
	}

	public int getGrapesqty() {
		return grapesqty;
	}

	public void setGrapesqty(int grapesqty) {
		this.grapesqty = grapesqty;
	}

	public int getWatermelonqty() {
		return watermelonqty;
	}

	public void setWatermelonqty(int watermelonqty) {
		this.watermelonqty = watermelonqty;
	}

	public int getMangoqty() {
		return mangoqty;
	}

	public void setMangoqty(int mangoqty) {
		this.mangoqty = mangoqty;
	}

	int wp = 36;
	int rp = 41;
	int bp = 18;
	int tp = 16;
	int pp = 12;
	int op = 15;
	int ap = 15;
	int gp = 33;
	int wmp = 25;
	int mp = 63;



	void run() throws IOException {
		try {

			@SuppressWarnings("unused")
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			
					System.out.println("          AVAILABLE STOCK       ");
					System.out.println("--------------------------------");
					System.out.println("Remaining Rice-Quantity in supermarket: " + getRiceqty());
					System.out.println("Remaining Wheat-Quantity in supermarket: "+ getWheatqty());
					System.out.println("Remaining Brinjal-Quantity in supermarket: "+ getBrinjalqty());
					System.out.println("Remaining Tomato-Quantity in supermarket: "+ getTomatoqty());
					System.out.println("Remaining Potato-Quantity in supermarket: "+ getPotatoqty());
					System.out.println("Remaining Onion-Quantity in supermarket: "+ getOnionqty());
					System.out.println("Remaining Apple-Quantity in supermarket: "+ getAppleqty());
					System.out.println("Remaining Grape-Quantity in supermarket: "+ getGrapesqty());
					System.out.println("Remaining Watermelon-Quantit in supermarket: "+ getWatermelonq());
					System.out.println("Remaining Mangoes-Quantity in supermarket: "+ getMangoqty());
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private String getWatermelonq() {
		return null;
	}
}
