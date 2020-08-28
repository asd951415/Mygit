package Team1;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;   //List<Transaction> 
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	public void deposit(long amount) {
		balance += amount;
		transactions.add(new Transaction("입금", amount, this.balance));
	}

	public void withdraw(long amount) {
		balance -= amount;
		transactions.add(new Transaction("출금", amount, this.balance));
	}

	public long getBlance() {
		return this.balance;
	}

	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}

	public String getName() {
		return name;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	@Override
	public String toString() {
		System.out.println();
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}
}