package assign2;

import java.util.Scanner;

public class Die {

	private int dieValue;
	private static Scanner sc;

	public int dieRoll() {
		return (int) ((Math.random() * 6) + 1);
	}

	public static void main(String[] args) {
		Die d = new Die();
		sc = new Scanner(System.in);
		int betAmount;
		int amount = 10;
		while (amount > 0) {
			System.out.println("you have $" + amount);
			System.out.println("How much would you like to bet?");
			betAmount = sc.nextInt();
			if (betAmount > amount) {
				System.out.println("YOU ENTERD INVALID AMOUNT");
				System.exit(0);
			}
			int die1Value = d.dieRoll();
			int die2Value = d.dieRoll();
			System.out.println("YOU ROLLED " + die1Value + " and " + die2Value);
			if (die1Value == die2Value) {
				System.out.println("you win $ " + (betAmount) + "\n");
				amount = amount + betAmount;
			} else {
				System.out.println("you lose $ " + (betAmount) + "\n");
				amount = amount - betAmount;
			}

		}

		if (amount == 0) {
			System.out.println("Better Luck Next Time");
		}

	}

	@Override
	public String toString() {
		return "Die [dieValue=" + dieValue + "]";
	}

}
