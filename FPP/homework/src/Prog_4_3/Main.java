package Prog_4_3;

import java.util.Scanner;
import Prog_4_3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String first = "A. See a report of all accounts.\nB. Make a deposit.\nC. Make a withdrawal.\nMake a selection (A/B/C): ";
			System.out.println(first);
			String answer = sc.next();
			
			if(answer.equalsIgnoreCase("A")){
				String info = getFormattedAccountInfo();
				System.out.println(info);
			}
			else if (answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C")) {
				StringBuilder s = new StringBuilder();
				for (int i=0;i<emps.length;i++) {
					s.append(i+". "+emps[i].getName()+"\n");
				}
				s.append("Select an employee: (type a number)");
				System.out.println(s);
				int name_id = Integer.valueOf(sc.next());
				
				Employee e = emps[name_id];
				System.out.println(e.getName());
				MyStringList name_of_accounts = e.getNamesOfAccounts();
				s = new StringBuilder();
				for (int i=0;i<name_of_accounts.size();i++) {
					s.append(i+". "+name_of_accounts.arr[i]+"\n");
				}
				s.append("Select an account: (type a number)");
				System.out.println(s);
				
				String account_str = name_of_accounts.arr[Integer.valueOf(sc.next())];
				int account_id = 0;
				switch(account_str) {
				case "CHECKING":
					account_id = 0;
					break;
				case "SAVINGS":
					account_id = 1;
					break;
				case "RETIREMENT":
					account_id = 2;
					break;
					
				}
				String amount="";
				if (answer.equalsIgnoreCase("B")) {
					System.out.println("Deposit amount");
					amount = sc.next();
					e.deposit(account_id, Integer.valueOf(amount));
					String x = String.format(amount + " has been deposited in the %s account of %s", account_str,emps[name_id].getName());
					System.out.println(x);
				}else {
					System.out.println("Withdrawal amount");
					amount = sc.next();
					e.withdraw(account_id, Integer.valueOf(amount));
					String x = String.format(amount + " has been withdrawed in the %s account of %s", account_str,emps[name_id].getName());
					System.out.println(x);
				}

	
			}else {
				System.out.print("end");
				return;
			}
	}
		
	}
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		StringBuilder s = new StringBuilder();
		for (Employee e:emps) {
			s.append(e.getFormattedAcctInfo());
		}
		return s.toString();
	}
}
