package Prog_4_3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import Prog_4_3.AccountList;
import Prog_4_3.MyStringList;

public class Employee {

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}

	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void createNewChecking(double startBalance) {
		Account acct = new CheckingAccount(this,startBalance);
		//accounts is the name of the AccountList variable
		    accounts.add(acct);
		}

	public void createNewSavings(double startBalance) {
		Account acct = new SavingsAccount(this,startBalance);
		//accounts is the name of the AccountList variable
		    accounts.add(acct);
		}

	public void createNewRetirement(double startBalance) {
		Account acct = new RetirementAccount(this,startBalance);
		//accounts is the name of the AccountList variable
		    accounts.add(acct);
		}

	public String getFormattedAcctInfo() {
		String s = String.format("ACCOUNT INFO FOR %s \n\n", name);
		for (Account a:accounts.arr) {
			if (a==null) {
				break;
			}
			s+=a.toString();
		}
		s+="\n\n";
		
		
		
		// implement
		return s;
	}
	public void deposit(int accountIndex, double amt) {
	    Account selected = accounts.get(accountIndex);
	    selected.makeDeposit(amt);
		
	}
	public void withdraw(int accountIndex, double amt) {
	    Account selected = accounts.get(accountIndex);
	    selected.makeWithdrawal(amt);
		
	}
	
	public MyStringList getNamesOfAccounts() {
		MyStringList name_of_accounts = new MyStringList();
		for (Account a:accounts.arr) {
			if (a==null) {
				break;
			}
			name_of_accounts.add(a.getAcctType().toString());
		}
		return name_of_accounts;
	}

}
