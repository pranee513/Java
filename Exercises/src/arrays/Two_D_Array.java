package arrays;

import java.util.Scanner;

public class Two_D_Array {

public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int TwoD[][] = new int[a][b];
	
	
	for(int i=0;i<a;i++) {
		for(int j=0;j<i;j++) {
			TwoD[i][j]=sc.nextInt();
			System.out.println("\n"+TwoD[i][j]);
		}
	}
	
	
	
	
}
	
	
	
}
