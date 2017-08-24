package assign3;

public class ClassifiedStaff extends Employee {

	double WeklySalary;
	String divison;

	public ClassifiedStaff(String Name, int Number, boolean working, double salary, String div) {
		super(Name, Number, working);
		this.WeklySalary = salary;
		this.divison = div;
	}

	@Override
	public double getPay() {
		double ClassifiedPay = WeklySalary * 2;
		return ClassifiedPay;
	}

	@Override
	public String toString() {
		return "ClassifiedStaff [WeklySalary=" + WeklySalary + ", divison=" + divison + ", employeeName=" + employeeName
				+ ", employeeId=" + employeeId + ", isWorking=" + isWorking + "]";
	}

}
