package chapterTwo;

import chapterTwo.Account;

public class Account2 {
	public static void main(String[] args){
		Account account = new Account("Vineela Vandanapu");
		System.out.println(account.getName()+ " in account number "+ 
		account.getAccountNo() +" has " +account.getBalance());
		
		Account account1 = new Account("Pulleswararao Vandanapu");
		System.out.println(account1.getName()+ " in account number "+
		account1.getAccountNo() +" has " +account1.getBalance());
	}

}
