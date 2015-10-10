package eBank;

public class CurrentAccount extends Account {
	
	public CurrentAccount(){
		super();
	}
	
	public CurrentAccount(String userName, String userPassword){
		super(userName, userPassword);
	}

	@Override
	public void monthlyInterest() {
		
	}

}
