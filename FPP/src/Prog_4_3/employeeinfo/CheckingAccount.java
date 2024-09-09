package Prog_4_3.employeeinfo;

public class CheckingAccount extends Account{
	CheckingAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}
	CheckingAccount(Employee emp,double startBalance ) {
		super(emp,startBalance);
		// TODO Auto-generated constructor stub
	}

	public AccountType getAcctType() {
		return Account.CHECKING;
		}
	@Override
	public double getBalance() {
	    double baseBalance = super.getBalance();
	    return baseBalance - 5;
	}
}
