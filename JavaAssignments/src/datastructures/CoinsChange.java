package datastructures;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoinsChange {
	private static Scanner sc;

	public static void main(String[] args){

	  double price = 0;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enetr your amount in dollars");
	  price = sc.nextDouble();
	  double quarters,reminder,
            dimes,cents,nickels;
	 
	  quarters = (price*100)/25;
	  reminder = (price*100) % 25;
	  
	  dimes  = (reminder)/10;
	  reminder = reminder%10;
	  
	  nickels = (reminder)/5;
	  reminder = reminder%5;
	  cents =reminder;
	  double sum = Math.floor(quarters)+Math.floor(dimes)+Math.floor(nickels)+
			       Math.floor(cents);
	  
	 System.out.println("your change is ");
	  System.out.println("quarters "+ Math.floor(quarters)+"\t dimes "
	                   +Math.floor(dimes)+
			  "\t nickels "+Math.floor(nickels)+"\t cents "+Math.floor(cents));
	  System.out.println("your sum is "+sum);

	}
}
