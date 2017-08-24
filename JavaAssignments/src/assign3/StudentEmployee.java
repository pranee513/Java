package assign3;

public class StudentEmployee extends Employee {

	int hourseWorked;
	boolean isWorkStudy;
	double payRate;

	public StudentEmployee(String Name, int Number, boolean working, int hours, boolean workstudy, double rate) {
		super(Name, Number, working);
		this.hourseWorked = hours;
		this.isWorkStudy = workstudy;
		this.payRate = rate;
	}

	@Override
	public String toString() {
		return "StudentEmployee [hourseWorked=" + hourseWorked + ", isWorkStudy=" + isWorkStudy + ", payRate=" + payRate
				+ ", employeeName=" + employeeName + ", employeeId=" + employeeId + ", isWorking=" + isWorking + "]";
	}

	@Override
	public double getPay() {
		double pay = hourseWorked * payRate;
		return pay;
	}

}
