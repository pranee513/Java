package assign10;

import java.util.Arrays;
import java.util.Scanner;

public class arrayProduct {
	private static Scanner in;

	public static void main(String[] args) {
	/*	int x;
		System.out.println("Enter the Size of the Array");
		in = new Scanner(System.in);
		x = in.nextInt();

		int[] ar = new int[x];
		System.out.println("Enter the elements into the array");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
*/       
		 int ar[] = {1,2,3,4,5};
		 int[] result = new int[5];

		 for (int i = 0; i < ar.length; i++) {
			int product = 1;
			for (int j = 0; j < ar.length; j++) {
				if (i != j)
					product = product * ar[j];
			}
			result[i] = product;
		}
		 
		 System.out.println("Product of arrays is ");
		 for (int n: result) {
			 System.out.print(" "+n+",");
		 }
        //in another way
		 System.out.println("\nProduct of given array is");
		System.out.println(Arrays.toString(ar));
		System.out.println("product of the array: " + Arrays.toString(result));
		
		
	}

}
