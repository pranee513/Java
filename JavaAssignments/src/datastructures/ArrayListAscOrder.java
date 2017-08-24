package datastructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAscOrder {

	public static void main(String[] args) {
 
    ArrayList<Integer> a1 =new ArrayList<Integer>();
	a1.addAll(Arrays.asList(1,2,2,3,6,8,8,9));
	System.out.println("before Sorting");
	System.out.println(a1);
	Collections.sort(a1,Collections.reverseOrder());
	System.out.println("\nAfter sorting");
	System.out.println(a1);
	
		
	}

}
