package loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerbound=1;
		int upperbound=100;
int number= lowerbound;
int sum =0;
double avg;
while(number<=upperbound) {
	sum = sum+number;
	++number;
}

avg=(double)sum/100;
	System.out.println("sum is "+sum);
	System.out.println("Avg is"+avg);
		
	
	
	
	
	}

}
