package eBank;

import eBank.Account;

public class ODAccount extends Account {
	
	static double interest = 0.12;
	double minimumBalance;
	
	public ODAccount(){
		super();
		minimumBalance = this.balance;
	}
	
	public ODAccount(String userName, String userPassword){
		super(userName, userPassword);
		minimumBalance = this.balance;
	}
	
	@ Override
	public void monthlyInterest() {
		if(minimumBalance < 0){
			double accountInterest = (interest/12)*minimumBalance;
			balance += accountInterest;
		}
		minimumBalance = this.balance;
	}
	
	@ Override
	public void withdraw(double withdrawAmount, String password){
		if(this.verifyPassword(password)){
			this.balance -= withdrawAmount;
			if(this.balance < minimumBalance){
				minimumBalance = this.balance;
			}
		}
	}
}
