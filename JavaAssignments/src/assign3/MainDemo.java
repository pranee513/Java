package assign3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = null;
		String read = null;
		br = new BufferedReader(new FileReader("C:\\Users\\dev\\Desktop\\input.txt"));

		while ((read = br.readLine()) != null) {
			String[] var = read.split(",");

			Employee emp = null;

			String typeOfEmp = var[0];

			if ("C".equals(typeOfEmp)) {

				String empName = var[1];
				int empId = Integer.parseInt(var[2]);
				boolean isWorking = Boolean.parseBoolean(var[3]);
				double weekSalary = Integer.parseInt(var[4]);
				String divi = var[5];
				emp = new ClassifiedStaff(empName, empId, isWorking, weekSalary, divi);

				System.out.println(emp);
				System.out.println(emp.isWorking());
				System.out.println(emp.getPay());

			} else if ("SE".equals(typeOfEmp)) {
				String empName = var[1];
				int empId = Integer.parseInt(var[2]);
				boolean isWorking = Boolean.parseBoolean(var[3]);
				int hourWork = Integer.parseInt(var[4]);
				boolean workStudy = Boolean.parseBoolean(var[5]);
				double payRt = Double.parseDouble(var[6]);
				emp = new StudentEmployee(empName, empId, isWorking, hourWork, workStudy, payRt);

				System.out.println(emp);
				System.out.println(emp.isWorking());
				System.out.println(emp.getPay());
			} else if ("F".equals(typeOfEmp)) {
				String empName = var[1];
				int empId = Integer.parseInt(var[2]);
				boolean isWorking = Boolean.parseBoolean(var[3]);
				double annualSalry = Double.parseDouble(var[4]);
				int weekPerYear = Integer.parseInt(var[5]);
				String depart = var[6];

				emp = new Faculty(empName, empId, isWorking, annualSalry, weekPerYear, depart);
				System.out.println(emp);
				System.out.println(emp.getPay());
				System.out.println(emp.isWorking());

			}

		}
		br.close();
	}
}
