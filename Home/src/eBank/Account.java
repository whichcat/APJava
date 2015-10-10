package eBank;

public abstract class Account {
	
	protected double balance = 0;
	private String accountName;
	private static int lastAccountNo = 0;
	private int accountNo;
	private String password;
	
	public Account(){
		balance = 5;
		accountName = "";
		password = "";
		this.accountNo = ++lastAccountNo;
	}

	public Account(String userName, String userPassword){
		balance = 5;
		accountName = userName;
		password = userPassword;
		this.accountNo = ++lastAccountNo;
	}
	
	protected boolean verifyPassword(String password){
		if (password == this.password){
			return true;
		}else{
			return false;
		}
	}
	
	public void changePassword(String password, String newPassword){
		if (this.verifyPassword(password)){
			this.password = newPassword;
		}else{
			System.out.println("Invalid. Your password has not been changed.");
		}
			
	}
	
	public void deposit(double depositAmount, String password){
		if(this.verifyPassword(password)){
			this.balance += depositAmount;
		}else{
			System.out.println("Invalid. Your balance has not been changed.");
		}
	}
	
	public void withdraw(double withdrawAmount, String password){
		if(this.verifyPassword(password) && withdrawAmount <= this.balance){
			this.balance -= withdrawAmount;	
		}else{
			System.out.println("Invalid. Your balance has not been changed.");
		}
	}
	
	public abstract void monthlyInterest();
	
	public String getAccountName(String password){
		if(this.verifyPassword(password)){
		return this.accountName;
		}else{
			return "Invalid. Cannot display name.";
		}
	}

	public double getBalance(String password){
		if(this.verifyPassword(password)){
			return this.balance;
		}else{
			System.out.println("Invalid. Cannot display balance.");
			return 0;
		}
		
	}
	
	public int getAccountNo(String password){
		if(this.verifyPassword(password)){
			return accountNo;
		}else{
			System.out.println("Invalid. Cannot display account number.");
			return 0;
		}
	}
	
	public static int getAccountCount(){
		return lastAccountNo;
	}
	
	public String toString(String password){
		if(this.verifyPassword(password)){
				return this.accountName+ " in account number "+ this.accountNo +" has " + this.balance;
			}else{
				return "Invalid. Account details cannot be shown.";
			}
	}
}
