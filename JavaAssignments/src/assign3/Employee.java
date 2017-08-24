package assign3;

public abstract class Employee {

	String employeeName;
	int employeeId;
	boolean isWorking;

	public abstract double getPay();

	public Employee(String Name, int Number, boolean Working) {
		this.employeeName = Name;
		this.employeeId = Number;
		this.isWorking = Working;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", isWorking=" + isWorking
				+ "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

}