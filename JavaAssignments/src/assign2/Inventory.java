package assign2;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item("stapler", 2.25, 15);
		Item i1 = new Item("Paper", 32.99, 255);
		Item i2 = new Item("Binder", 4.75, 9);
		System.out.println("############### Inventory Of Items #############\n");
		System.out.println("Name\t price \t Quantity \t Value\t");
		System.out.println("=========================================");
		System.out.println(i.getName() + "\t  " + i.getPrice() + "\t " + i.getQuantity() + "\t\t" + i.getValue());
		System.out.println(i1.getName() + "\t  " + i1.getPrice() + "\t " + i1.getQuantity() + "\t\t" + i1.getValue());
		System.out.println(i2.getName() + "\t  " + i2.getPrice() + "\t " + i2.getQuantity() + "\t\t" + i2.getValue());

		double Total = i1.getValue() + i2.getValue() + i.getValue();
		System.out.println("Total Inventory is $" + Total);

	}

}
