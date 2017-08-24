package assign3;

public class Faculty extends Employee {

	double annualSalry;
	int weeksPerYear;
	String department;

	public Faculty(String Name, int Number, boolean employeed, double asalry, int Weeks, String dept) {
		super(Name, Number, employeed);
		this.annualSalry = asalry;
		this.weeksPerYear = Weeks;
		this.department = dept;
	}

	@Override
	public String toString() {
		return "Faculty [annualSalry=" + annualSalry + ", weeksPerYear=" + weeksPerYear + ", department=" + department
				+ ", employeeName=" + employeeName + ", employeeId=" + employeeId + ", isWorking=" + isWorking + "]";
	}

	@Override
	public double getPay() {
		double facultyPay = (annualSalry * 2) / weeksPerYear;
		return facultyPay;
	}

}
