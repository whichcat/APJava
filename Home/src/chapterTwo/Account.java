package chapterTwo;

public class Account {
	
    private String name;
	private int accountNo;
	private static int lastAccountNo = 0;
	private double balance = 0.0;
	
	public Account(String userName){
		name =userName;
		this.accountNo = ++lastAccountNo;
		
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAccountNo(){
		return this.accountNo;
	}
	
	public void deposit(double depositAmount){
		this.balance += depositAmount;
	}
	
	public void withdraw(double withdrawalAmount){
		this.balance -= withdrawalAmount;
	}
	
	public String toString(){
		return this.name+ " in account number "+ this.accountNo +" has " + this.balance;
	}
	
	public static int getAccountCount(){
		return lastAccountNo;
	}
	
	public static void main(String[] args){
		Account account = new Account("Vineela Vandanapu");
		System.out.println(account);
		
		Account account1 = new Account("Pulleswararao Vandanapu");
		System.out.println(account1);
		
		Account account3 = account;
		account3.deposit(1985788.97);
		System.out.println(account.getBalance());
		
		System.out.println(Account.getAccountCount());
	}
}


