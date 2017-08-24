package loops;

public class CountLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count=0;
	int min=1;
	int max=100;
	int sum=0;
	int number;

	for(number=min;number<=max;++number) {
	sum=sum+number;
		++count;
	}
	System.out.println("SUm is "+sum);
	System.out.println("Count is "+count);
}
}