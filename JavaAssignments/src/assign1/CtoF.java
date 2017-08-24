package assign1;

public class CtoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double CELS = 37;
		double FAHR;
		// Celsius to Fahrenheit
		FAHR = (CELS * 9 / 5) + 32;
		System.out.println(CELS + "c equal to " + FAHR + "f");
		// Fahrenheit to Celsius
		double CELS1;
		double FAHR1 = 98.3;
		CELS1 = (FAHR1 - 32) * 5 / 9;
		System.out.println(FAHR1 + "f equal to " + CELS1 + "c");
	}

}
