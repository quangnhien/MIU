package Prog_4_3.employeeinfo;

public class SavingsAccount extends Account{
	private final double rate = 0.25;
	SavingsAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}
	SavingsAccount(Employee emp,double startBalance ) {
		super(emp,startBalance);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return Account.SAVINGS;
		}
	@Override
	public double getBalance() {
	    double baseBalance = super.getBalance();
	    double interest = (rate/100)*baseBalance;
	    super.setBalance(baseBalance + interest);
	    return baseBalance + interest;
	}

}
