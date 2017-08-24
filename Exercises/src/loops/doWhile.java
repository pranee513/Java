package loops;

public class doWhile {
 public static void main(String[] args) {
	
	 int lowerbound=1;
	 int upperbound=100;
	 int sum=0;
	 double avg;
	 int number=lowerbound;
	 
	 do {
		 
		 sum = sum+number;
		 ++number;
		 
	 } while(number<=upperbound);
	 
	 
	 
	 avg = (double)sum/100;
	 System.out.println("Sum is "+sum);
     System.out.println("Avg is "+avg);	 
}
}
