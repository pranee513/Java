package assign1;

import java.util.Scanner;

public class Pay {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hourseWorked;
		double hourlyPayRate;
		double grosspay = 0;
		double Tax = 0;
		double netPay = 0;
		double extraHours;
		double extrapay = 0;
		sc = new Scanner(System.in);

		System.out.println("How many hours did you work?");
		hourseWorked = sc.nextDouble();
		System.out.println("How much do you get paid per hour?");
		hourlyPayRate = sc.nextDouble();

		if (hourseWorked > 40) {
			extraHours = hourseWorked - 40;
			extrapay = extraHours * (1.5 * hourlyPayRate);
			grosspay = (hourlyPayRate * 40) + extrapay;
			Tax = grosspay * 0.33;
			netPay = grosspay - Tax;

			System.out.println("Extra Pay for OverTime " + extrapay);
			System.out.println("You earned " + grosspay);
			System.out.println("Taxes are " + Tax);
			System.out.println("Your net Pay is " + netPay);
		} else {
			grosspay = hourlyPayRate * hourseWorked;
			Tax = grosspay * 0.33;
			netPay = grosspay - Tax;
			System.out.println("You earned " + grosspay);
			System.out.println("Taxes are " + Tax);
			System.out.println("Your net Pay is " + netPay);

		}

	}

}
