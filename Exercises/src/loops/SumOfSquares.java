package loops;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int count=0;
int min=1;
int max=100;
int number;
for (number=min;number<=max;++number) {
	sum=sum+(number*number);
	++count;
}
		System.out.println("The sum of Squares is "+sum);
		
		System.out.println("count is " +count);
	}

}
