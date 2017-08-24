package oops;

public class DeluxeBurger extends HamBurger {

	public DeluxeBurger() {
		super("Deluxe","sausage and Bacon",14.54,"white");
		super.addHamBurgeraddition1("chips", 2.2);
		super.addHamBurgeraddition2("Drink", 1.3);
	}

	@Override
	public void addHamBurgeraddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to the Deluxe Burger");
	}

	@Override
	public void addHamBurgeraddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to the Deluxe Burger");
	}

	@Override
	public void addHamBurgeraddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to the Deluxe Burger");
	}

	@Override
	public void addHamBurgeraddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional items to the Deluxe Burger");
	}
}
