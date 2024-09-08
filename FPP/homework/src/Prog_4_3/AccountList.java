package Prog_4_3;
import Prog_4_3.employeeinfo.Account;
import Prog_4_3.employeeinfo.CheckingAccount;
import Prog_4_3.employeeinfo.RetirementAccount;
import Prog_4_3.employeeinfo.SavingsAccount;
public class AccountList {
	private  int size = 0;
	private  int init_size=2;
	public Account[] arr;
	
	
	public AccountList() {
		this.arr = new Account[init_size];
	}
	public void add (Account s) {
		if(size==init_size) {
			resize();
		}
		arr[size] = s;
		size+=1;
	}
	public Account get(int i) {
		for (Account a:arr) {
			if (i==0) {
				if (a instanceof CheckingAccount) {
					return a;
				}
			}else if(i==1) {
				if (a instanceof SavingsAccount) {
					return a;
				}
			}else {
				if (a instanceof RetirementAccount) {
					return a;
				}	
			}

		}
		return arr[i];
	}
	public boolean find(Account s) {
		for (Account i:arr) {
			if (i.equals(s)) {
				return true;
			}
		}
		return false;
	}
	public boolean remove(Account s) {
		int i;
		for (i=0;i<size;i++) {
			if (arr[i].equals(s)) {
				break;
			}
		}
		if (i+1==size) {
			return false;
		}
		for (int j = i;j<size-1;j++) {
			arr[j]=arr[j+1];
			
		}
		arr[size]=null;
		size-=1;
		return true;	
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("["+arr[0]);
		for (int i=1;i<size;i++) {
			s.append(", "+arr[i]);
			
		}
		s.append("]");
		return s.toString();
	}
	public int size() {
		return size;
	}
	private void resize() {
		System.out.println("Resizing....");
		init_size*=2;
		Account[] tmp = new Account[init_size];
		for (int i=0;i<size;i++) {
			tmp[i] = arr[i];
			
		}
		arr = tmp;
	}

}

