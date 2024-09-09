package Prog_4_3.employeeinfo;
public class Account {
	public final static AccountType CHECKING = AccountType.CHECKING;
	public final static AccountType SAVINGS = AccountType.SAVINGS;
	public final static AccountType RETIREMENT = AccountType.RETIREMENT;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + getAcctType() + "\nCurrent bal: " + balance+"\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		balance+=deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount<=balance) {
			balance-=amount;
			return true;
		}else {
			return false;
		}
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}
	
}
