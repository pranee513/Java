package hackerRank;



class Arithmetic {
	public int add(int a,int b) {
		return a+b;
		
	}
}

class Adder extends Arithmetic {
	
}

public class Inh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder a =new Adder();
		
	System.out.println("My super class is "+a.getClass().getSuperclass().getName());	
	System.out.println(a.add(10, 20));
		
		
	}

}
