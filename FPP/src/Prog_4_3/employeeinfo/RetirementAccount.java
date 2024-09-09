package Prog_4_3.employeeinfo;

public class RetirementAccount extends Account{
	private final double rate = 0.02;
	RetirementAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}
	RetirementAccount(Employee emp,double startBalance ) {
		super(emp,startBalance);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return Account.RETIREMENT;
		}
	@Override
	public boolean makeWithdrawal(double amount) {
		// implement
		double balance = super.getBalance();
		if (amount<=balance) {
			balance-=amount*(1+rate);
			super.setBalance(balance);
			return true;
		}else {
			return false;
		}
	}
}
