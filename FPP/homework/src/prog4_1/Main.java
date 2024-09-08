package prog4_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Professor("A",10000,10,2000,10,10);
        department[1] = new Professor("B",12000,10,1998,10,10);
        department[2] = new Secretary("C",6000,200,1998,10,10);
        department[3] = new Secretary("D",6000,200,1998,10,10);
        department[4] = new Secretary("E",6000,200,1998,10,10);
        
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			double sum = 0;
			for (DeptEmployee d:department) {
				sum+=d.computeSalary();
			}
			System.out.println(sum);
		}
		else {
			//do nothing..the application ends here
		}
	}
}
