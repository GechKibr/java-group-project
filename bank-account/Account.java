package  oop.bank.account;
class Account {
	String accountNumber;
	String accountType;
    double balance=0;
	User userId;
	Date creationDate;

	public void deposit(double amount)  //for deposit 
	{

		  if (amount > 0) 
		  {
            balance += amount;
          } 
		  else 
		  {
            System.out.println("Invalid deposit amount.");
          }
         
	}    
	public void withdraw(double amount)
	{
	
        if (amount > 0 && balance >= amount) 
		{
            balance -= amount;
        }
		 else 
		{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
         
	}
	public double getBalance() ///to return balance
	{
		return balance;
	}
	
    public void closeAccount()
	{

	}

	/// transfer for another account 
	public void transfer(Account targetAccount, double amount)
	{

	}

}
