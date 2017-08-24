package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StringComparator{


	public static void main(String args[]) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.addAll(Arrays.asList("A", "Mahesh", "abc", "123", "4serv", "Abcd"));

		 Collections.sort(a1);
		System.out.println(a1);

	}

	

}


