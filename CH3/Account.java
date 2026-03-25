class Account{
	
	private String name;
	private double balance;


	public Account(String name, double balance){
		this.name = name;
		if(balance > 0.0){
			this.balance = balance;
		}
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public double getBalance(){
		return balance;
	}

	//add o deposit

	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			this.balance += depositAmount;
		}
	}

	public void withDrawal(double witdrawAmount){
		if(witdrawAmount > balance){
			System.out.printf("Withdrawal amount exceeded account balance%n");
		}else{
			balance -= witdrawAmount;
		}
	}
} 