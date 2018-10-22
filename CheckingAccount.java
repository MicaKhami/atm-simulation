public class CheckingAccount extends Account
{
	public CheckingAccount(int id,double balance)//the constructor that initialise the variable
	{
      super(id,balance);
	}
    double overdraft=1000.0;
	public double overdraft()//method the return the overdraft of the account
	{
       return overdraft;
	}
}
