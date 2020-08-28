package Team1;

import java.util.ArrayList;

public class Bank {
	private int totalAccount;
	private ArrayList<Account> accounts;  //  List<Account> ^^
	
	public Bank() {
		this.totalAccount = 0;
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String accountNo, String name) {	//계좌를 생성
		accounts.add(new Account(accountNo, name));
		totalAccount++;
	}
	
	public Account getAccount(String accountNo) {	//계좌를 찾는다(계좌번호로)
		Account acc = null;
		for(Account a : this.accounts) {
			if(a.getAccountNo() == accountNo) {
				acc = a;
			}
		}
		return acc;
	}
	
	public ArrayList<Account> findAccounts(String name){	//계좌를 찾는다(소유자명으로)
		ArrayList<Account> accs = new ArrayList<Account>();
		for(Account acc : this.accounts) {
			if(acc.getName() == name) {
				accs.add(acc);
			}
		}return accs;
	}
	
	public ArrayList<Account> getAccounts(){	//계좌목록을 본다
		return accounts;
	}
	
	public int getTotalAccount() {	//총 계좌수를 반환한다.
		return totalAccount;
	}
}