import java.util.ArrayList;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private String name;
	private ArrayList<Transaction> transactions;
	
	public Account() {
	  dateCreated = new java.util.Date();
	  name = "";
	  id = 0;
	  balance = 0;
	  annualInterestRate = 0;
	  dateCreated = new java.util.Date();
	  transactions = new ArrayList<Transaction>();
	}

	public Account(int newId, double newBalance) {
		name = "";
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
		transactions = new ArrayList<Transaction>();
	}
	
	public Account(int newId, double newBalance, String newName) {
		id = newId;
		balance = newBalance;
		name = newName;
		dateCreated = new java.util.Date();
		transactions = new ArrayList<Transaction>();
	}
	
	public int getId() {
	  return this.id;
	}

	public double getBalance() {
	  return balance;
	}
	
	public String getName() {
		return name;
	}

	public double getAnnualInterestRate() {
	  return annualInterestRate;
	}

	public void setId(int newId) {
	  id = newId;
	}

	public void setBalance(double newBalance) {
	  balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
	  annualInterestRate = newAnnualInterestRate;
	}

	public double getMonthlyInterest() {
	  return balance * (annualInterestRate / 1200);
	}

	public java.util.Date getDateCreated() {
	  return dateCreated;
	}

	public void withdraw(double amount) {
	  balance -= amount;
	  transactions.add(new Transaction('W', amount, balance, "Withdraw"));
	}
	
	public void deposit(double amount) {
	  balance += amount;
	  Transaction tran = new Transaction('D', amount, balance, "Deposit");
	  transactions.add(tran);
	}
	
	public ArrayList<Transaction> getTransaction(){
		return transactions;
	}
}
