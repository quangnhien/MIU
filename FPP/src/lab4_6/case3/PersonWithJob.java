package  lab4_6.case3;

import java.util.GregorianCalendar;



public class PersonWithJob {
	private double salary;
	private Person emp;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		emp = new Person(name,dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob.getClass() != this.getClass())) return false;
		PersonWithJob p = (PersonWithJob)ob;
		
		return (emp.equals(p.emp) && salary==p.salary);
	}
}
