package eBank;

import eBank.Account;

public class SavingsAccount extends Account {
	
	static double interest = 0.06;
	double minimumBalance;

	public SavingsAccount(){
		super();
		minimumBalance = this.balance;
	}
	
	public SavingsAccount(String userName, String userPassword){
		super(userName, userPassword);
		minimumBalance = this.balance;
	}
	
	public void withdraw(double withdrawAmount, String password){
		super.withdraw(withdrawAmount, password);
		if(this.balance < minimumBalance){
			minimumBalance = this.balance;
		}	
	}

	@Override
	public void monthlyInterest() {
		double accountInterest = (interest/12)*minimumBalance;
		balance += accountInterest;
		minimumBalance = this.balance;
	}
	
}
