package arrays;

import java.util.Scanner;

public class Basic {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myInt = getInteger(5);
		for (int i = 0; i < myInt.length; i++) {
			System.out.println("Elemet " + i + " typed values was " + myInt[i]);
		}
		System.out.println("The avg is " + getAvg(myInt));
	}

	public static int[] getInteger(int number) {

		System.out.println("Enter " + number + " integer values\r");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextInt();

		}
		return values;

	}

	public static double getAvg(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		return (double) sum / (double) array.length;
	}

}
