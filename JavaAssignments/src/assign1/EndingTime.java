package assign1;

import java.util.Scanner;

public class EndingTime {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int hours, minutes, totalminutes, endingtime, endinghour, endingminutes;

		System.out.println("enter the starting time in hours and minutes");
		hours = sc.nextInt();
		minutes = sc.nextInt();
		if ((hours > 23) || (minutes > 60)) {
			System.out.println("YOur enterd ivalid Time Please Chexk the TIME");
		}

		else {
			hours = hours * 60;
			totalminutes = hours + minutes;
			System.out.println("enter the duration in minutes ");
			endingtime = sc.nextInt();
			endingtime = endingtime + totalminutes;
			endinghour = endingtime / 60;
			System.out.println("ending hour is " + endinghour);
			endingminutes = endingtime % 60;
			System.out.println("ending minutes is " + endingminutes);
		}

	}

}
