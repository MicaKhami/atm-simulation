public class SavingAccount extends Account
{
    double annualInterestRate;
    public SavingAccount(int id,double balance)//the constructor that initialise the variable
    {
      super(id,balance);
    }
    public double getMonthlyInterestRate()//methods to calculate the monthly interest rate
    {
    	double monthlyInterestRate =annualInterestRate*12/100;

    	return monthlyInterestRate;
    }
    public double getMonthlyInterest()//methods to calculate the monthly interest
    {
    	double monthlyInterest=balance * getMonthlyInterestRate();

    	return monthlyInterest;
    }
}
