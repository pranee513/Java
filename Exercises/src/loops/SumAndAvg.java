package loops;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
double avg;
int lowerbound=1;
int upperbound=100;

for(int number=lowerbound; number<=upperbound; ++number) {
	sum = sum+number;
}

 avg =(double)sum/upperbound;
 System.out.println("Sum is "+sum);
 System.out.println("Avg is "+avg);

}
}
