package assign2;

import java.util.Scanner;

public class CheckMarker {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		double amountPaid, amountOwned;
		double change;
		int dollars, quarters = 0, dimes = 0, nickels = 0, pennies = 0, Echange = 0;
		System.out.println("Enter the amount the customer paid");
		amountPaid = sc.nextDouble();

		System.out.println("Enter the amount the customer owed");
		amountOwned = sc.nextDouble();

		change = amountPaid - amountOwned;

		if ((amountOwned < 0) || (amountPaid < 0)) {
			System.out.println("YOu enterd wrong information,please check to proceed");
			System.exit(0);
		}

		if (amountPaid < amountOwned) {
			System.out.println("YOu entered wrong information");
			System.exit(0);
		}
		System.out.println("TOtal Change is " + change);

		dollars = (int) (change / 100);
		Echange = (int) (change % 100);

		quarters = Echange / 25;
		Echange = Echange % 25;

		dimes = Echange / 10;
		Echange = Echange % 10;

		nickels = Echange / 5;
		Echange = Echange % 5;

		pennies = Echange;

		System.out.println(dollars + " dollar(s) " + quarters + " quarter(s) " + dimes + " dime(s) " + nickels
				+ " nickel(s) and " + pennies + " pennies ");

	}

}
