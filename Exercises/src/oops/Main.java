package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HamBurger h = new HamBurger("BAsic", "susage", 3.56, "white");
		h.addHamBurgeraddition1("Tomato", 0.30);
		h.addHamBurgeraddition2("lattece", 0.78);
		h.addHamBurgeraddition3("ranch", 0.23);
		h.addHamBurgeraddition4("rasa", 0.22);
		System.out.println("Total Burger price is"+h.itemizedHamBurger());
		
		HealthyBurger h1 = new HealthyBurger("Bacon", 5.67);
		h1.addHamBurgeraddition1("egg", 5.43);
	System.out.println("Total Healthy Burger Price is "+h1.itemizedHamBurger());
		
	DeluxeBurger d = new DeluxeBurger();
	d.addHamBurgeraddition1("shoiuld not do this", 50.33);

	d.itemizedHamBurger();
		
		
		
	}

}
