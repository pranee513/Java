package hackerRank;

import java.util.Scanner;

interface AdvancedArthimetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArthimetic {
	
	@Override
	public int divisor_sum(int n) {
		 int s=1;
	     int temp=0,sum=0;
	     while(s<=n)
	         {
	         if(n%s==0)
	             {
	             temp=s;
	             sum+=temp;
	         }
	         s++;

	     }
	     return sum;
   
	}

	}		



class Interface {
	    public static void main(String []args){
	        MyCalculator my_calculator = new MyCalculator();
	        System.out.print("I implemented: ");
	        ImplementedInterfaceNames(my_calculator);
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.print(my_calculator.divisor_sum(n) + "\n");
	      	sc.close();
	    }
	    /*
	     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
	     */
	    static void ImplementedInterfaceNames(Object o){
	        Class[] theInterfaces = o.getClass().getInterfaces();
	        for (int i = 0; i < theInterfaces.length; i++){
	            String interfaceName = theInterfaces[i].getName();
	            System.out.println(interfaceName);
	        }
	    }
	}
	
	
	
	

