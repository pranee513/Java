package loops2;

public class ComputePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double sum =0;
	int maxDenominator=10000000;
	for(int denominator =1;denominator<=maxDenominator;denominator+=2) {
		if(denominator % 4==1) {
			sum+=denominator;
			
		} else if(denominator % 4==3) {
			sum-=denominator;
		} else {
			System.out.println("The computer has gone crazy");
		}
		
	}

	}

}
