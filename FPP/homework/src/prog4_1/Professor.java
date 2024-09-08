package prog4_1;

public class Professor extends DeptEmployee{
	int numberOfPublications;
	Professor(String name, int salary,int numberOfPublications, int yearOfHire, int monthOfHire, int dayOfHire) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.numberOfPublications = numberOfPublications;
		
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	

}
