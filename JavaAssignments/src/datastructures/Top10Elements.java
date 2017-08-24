package datastructures;

public class Top10Elements {

	public static void main(String args[]) {
		int i;
		int large[] = new int[10];
		int array[] = { 1,2,3,4,5,6,7,8,9,10,11 };
		int max = 0, index;
		for (int j = 0; j < 10; j++) {
			max = array[0];
			index = 0;
			for (i = 1; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
					index = i;
				}
			}
			large[j] = max;
			array[index] = -1; // the max computed element set to -1

			System.out.println("Top " + (1 + j) + " th element in given array  " + large[j]);

		}
	}
}
