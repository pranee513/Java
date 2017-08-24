package datastructures;

import java.util.*;

public class StringComapring {
	public static void main( String [] args  ) {

    	ArrayList<String> list = new ArrayList<String>();

		list.addAll(Arrays.asList("A", "Mahesh", "abc", "123", "4serv", "Abcd"));

        Collections.sort( list , new Comparator<String>(){
            public int compare( String a, String b ){
                
                if( a.matches("\\d+") && b.matches("\\d+")) {
                    return new Integer( a ) - new Integer( b );
                }
                
                return a.compareTo( b );
            }
        });
        System.out.println( list );
    }
}