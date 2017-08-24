package example.hashmaps;

import java.io.*;
import java.text.*;
import java.util.*;

public class Hash {

	private static Scanner sc;
	private static Scanner s;

	public static void main(String[] args) throws ParseException, FileNotFoundException {
		s = new Scanner(System.in);
		
		
	
		sc = new Scanner(new FileReader("C:\\Users\\dev\\Desktop\\demo.txt"));

				Date d;
		String Name, Email, DOB;
		String[] com;
		TreeMap<Date, List<person>> H = new TreeMap<Date, List<person>>();
		SimpleDateFormat D = new SimpleDateFormat("dd-mm-yyyy");
		String line = "";
		String cvsSplitBy = ",";
		while (sc.hasNext()) {
			line = sc.nextLine();
			com = line.split(cvsSplitBy);
			d = D.parse(com[1]);
			if (H.containsKey(d)) {
				List<person> perList = H.get(d);
				person newPerson = new person(com[0], com[2]);
				perList.add(newPerson);
				H.put(d, perList);
			} else {
				List<person> perList = new ArrayList<person>();
				person newPerson = new person(com[0], com[2]);
				perList.add(newPerson);
				H.put(d, perList);
			}
		}
		

		do {
			System.out.println("Choose an operation from Below list:");
			System.out.println("1. To enter user details");
			System.out.println("2. To view all user details:");
			System.out.println("3. To Delete a User");
			System.out.println("4. To retirve Users born on a specific Date");
			System.out.println("5. To find users before and after specific date:");
			int opt = s.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter the user DOB in dd-MM-yyyy format:");
				DOB = s.next();
				System.out.println("Enter the user  Name:");
				Name = s.next();
				System.out.println("Enter the user Email:");
				Email = s.next();
				d = D.parse(DOB);
				if (H.containsKey(d)) {
					List<person> perList = H.get(d);
					person newPerson = new person(Name, Email);
					perList.add(newPerson);
					H.put(d, perList);
				} else {
					List<person> perList = new ArrayList<person>();
					person newPerson = new person(Name, Email);
					perList.add(newPerson);
					H.put(d, perList);
				}
				break;
			case 2:
				for (Map.Entry<Date, List<person>> m : H.entrySet()) {
					System.out.println("Date of Birth:" + m.getKey());

					List<person> perList = m.getValue();
					Collections.sort(perList, new personSort());
					for (person m1 : perList) {
						System.out.println(m1.getName());
					}
					System.out.println("\n");
				}
				break;
			case 3:
				System.out.println("Enter the name of user to be deleted");
				String remPer = s.next();
				System.out.println("Enter the Date of birth of user in dd-MM-yyyy format:");
				String remDate = s.next();
				Date remD = D.parse(remDate);
				if (H.containsKey(remD)) {
					List<person> perList = H.get(remD);

					for (person p : perList) {
						if (remPer.equals(p.getName())) {
							perList.remove(p);
						}

						else {
							System.out.println("No user found with the given date");
						}
					}
				}
				break;

			case 4:
				System.out.println("Enter the Date of birth of user in dd-MM-yyyy format:");
				String retDate = s.next();
				Date retD = D.parse(retDate);
				if (H.containsKey(retD)) {
					List<person> perList = H.get(retD);

					for (person p : perList) {
						System.out.println(p.getName());
					}

				} else {
					System.out.println("No user found with the given date");
				}
				break;
			case 5:
				System.out.println("Enter the Date of birth of user in dd-MM-yyyy format:");
				String reDate = s.next();
				Date reD = D.parse(reDate);
				if (H.containsKey(reD)) {

					for (Map.Entry<Date, List<person>> e : H.entrySet()) {
						if (!(reD.toString().equals(e.getKey().toString()))) {
							System.out.println(e.getValue());
						}
					}

				} else {
					System.out.println("No user found with the given date");
				}
				break;
			}

		} while (true);

	}

}

class personSort implements Comparator<person> {

	@Override
	public int compare(person s1, person s2) {
		return s1.getName().compareToIgnoreCase(s2.getName());
	}
}