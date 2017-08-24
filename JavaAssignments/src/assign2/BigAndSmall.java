package assign2;

import java.util.Scanner;

public class BigAndSmall {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double largest = 0, smallest = 0, sum = 0;
		int i = 0;
		double temp;
		input = new Scanner(System.in);

		do {
			System.out.print("Enter a number or 0 to quit ");
			temp = input.nextDouble();

			if (temp == 0 && i == 0) {
				System.out.println("you did not enter any numbers");
				break;
			} else if (temp == 0) {
				break;

			}

			if (temp >= largest) {
				largest = temp;
			}
			if (temp < smallest || smallest == 0) {
				smallest = temp;
			}
			sum += temp;
			i++;

		} while (temp != 0);

		if (i != 0) {
			System.out.println("Largest " + largest);
			System.out.println("Smallest " + smallest);
			System.out.println("Mean " + sum / i);
		}
	}
}
