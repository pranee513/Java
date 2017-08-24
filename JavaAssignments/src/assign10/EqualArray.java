package assign10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualArray {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		in = new Scanner(System.in);

		int size = in.nextInt();
		int[] array, split1, split2;
		array = new int[size];
		int total = 0, splitArraySize1 = 0, splitArraySize2 = 0, x = 0;
		int sum1 = 0;
		int sum2=0;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element" + (i + 1) + " of the array");
			array[i] = in.nextInt();
			total = total + array[i];
		}
		System.out.println(total);
		if (total % 2 == 0) {
			for (int i = 0; i < size; i++) {
				sum1 = sum1 + array[i];
				splitArraySize1++;
				sum2 = 0;
				for (int j = i + 1; j < size; j++) {
					sum2 = sum2 + array[j];
				}
				if (sum1 == sum2) {
					break;
				}

			}
			splitArraySize2 = size - splitArraySize1;
			split1 = new int[splitArraySize1];
			split2 = new int[splitArraySize2];
			System.out.println("This is array 1");
			for (int i = 0; i < splitArraySize1; i++) {
				split1[i] = array[i];
				x++;
				System.out.println(split1[i]);
			}
			System.out.println("This is array 2");
			for (int j = 0; j < splitArraySize2; j++) {
				split2[j] = array[x];
				x++;
				System.out.println(split2[j]);
			}

		} else
			System.out.println("We cannot perform split operation on this array");
	}

}
