package hackerRank;

import java.util.Scanner;

abstract class Book {
	static String title;

	abstract void setTitle(String s);

	String getTitile() {
		return title;
	}

	class MyBook extends Book {

		@Override
		void setTitle(String s) {
			this.title = s;

		}

	}

	public static class Abstract {

		public static void main(String args[]) {
			// MyBook mb = new MyBook();

			Scanner sc = new Scanner(System.in);
			title = sc.nextLine();
			// System.out.println("The title is"+mb.getTitile());
		}
	}
}
