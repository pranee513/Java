package hackerRank;


class Animal {
	void walk() {
		System.out.println("I am Wlaking");
	}
}
 class Bird extends Animal {
	 void fly() {
		 System.out.println("Iam flying");
	 }
	 void sing() {
		 System.out.println("iam singing");
	 }
 }



public class Inh {

  public static void main(String args[]) {
	 Bird b = new Bird();
	  b.walk();
	  b.fly();
	  b.sing();
	  
  }
	
}
