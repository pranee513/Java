package loops;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int min =1;
   int max=100;
   int count=0;
   int sum=0;
   int number;
   for(number=min;number<=max;number++) {
	   if(number%2==1) {
		   sum=sum+number;
		   ++count;
	   }
   }
   System.out.println("Sum of Odd Numbers is "+sum);
   System.out.println("COunt is "+count);
		int count1=0;
		int sum1=0;
		for(number=min;number<=max;++number) {
			if(number%7==0) {
			sum1=sum+number;
			count1++;
		}
		}
		System.out.println("Sum of numbers divded by 7 is "+sum1);
		System.out.println("Count is "+count1);
	}

}
