package oops;

public class HamBurger {

	private String Name;
	private String meat;
	private double price;
	private String breadRollType;
	
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public HamBurger(String name, String meat, double price, String breadRollType) {
		super();
		Name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	
	public void addHamBurgeraddition1(String name,double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	
	public void addHamBurgeraddition2(String name,double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addHamBurgeraddition3(String name,double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addHamBurgeraddition4(String name,double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	
	public double itemizedHamBurger() {
		double hamBurgerPrie = this.price;
		System.out.println(this.Name+" hamburger "+" on a " +
		    this.breadRollType+" roll with  "+this.meat+" price is "+this.price);
		if(this.addition1Name!=null) {
			hamBurgerPrie+=this.addition1Price;
			System.out.println("Added "+this.addition1Name+" for extra "+this.addition1Price);
		}
		if(this.addition2Name!=null) {
			hamBurgerPrie+=this.addition1Price;
			System.out.println("Added "+this.addition2Name+" for extra "+this.addition2Price);
		}
		if(this.addition3Name!=null) {
			hamBurgerPrie+=this.addition3Price;
			System.out.println("Added "+this.addition3Name+" for extra "+this.addition3Price);
		}
		if(this.addition4Name!=null) {
			hamBurgerPrie+=this.addition1Price;
			System.out.println("Added "+this.addition4Name+" for extra "+this.addition4Price);
		}
		return hamBurgerPrie;
		
	}
	
	
	
	
	
}
