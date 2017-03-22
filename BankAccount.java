

public abstract class BankAccount {

	public static int nextAccNum = 12345678;
	private double balance;
	private int accountNumber;
	private Customer owner;
	private AccountType type;
	
	
	
	public BankAccount(double balance, Customer owner, AccountType type) {
		super();
		nextAccNum += 100;
		this.accountNumber = nextAccNum;
		this.balance = balance;
		this.owner = owner;
		this.type = type;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public String toString() {
		 String oString = "BankAccount [balance=" + balance + ", accountNumber=" + accountNumber + "]";
		return oString;
	}

	

}
