package prog4_1;

public class Secretary extends DeptEmployee{
	double overtimeHours;
	Secretary(String name, int salary, double overtimeHours, int yearOfHire, int monthOfHire, int dayOfHire) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.overtimeHours = overtimeHours;
	}
	public double computeSalary() {
		return salary + 12*overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

}
