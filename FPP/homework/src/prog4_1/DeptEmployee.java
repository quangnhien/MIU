package prog4_1;
import java.time.LocalDate;

public class DeptEmployee {
	String name;
	int salary;
	LocalDate hireDate;
	DeptEmployee(String name,int salary, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHire_date() {
		return hireDate;
	}
	public void setHire_date(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double computeSalary() {
		return salary;
	}
	
	
	

}
