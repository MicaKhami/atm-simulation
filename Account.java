import java.util.Date;

public class Account
{
	 int id;
	 double balance;
	 Date dateCreated;

	 public Account(int id,double initialBalance)//constructor
	 {
        this.id=id;
        this.balance=initialBalance;
	 }
	 //get methods
	 public int getId()
	 {
	 	return id;
	 }
	 public double getBalance()
	 {
	 	return balance;
	 }
	 public Date getDateCreated()
	 {
	 	return dateCreated;
	 }
	 //sets methods
	 public void setId(int id)
	 {
	 	this.id=id;
	 }
	 public void setBalance(double balance)
	 {
	 	this.balance=balance;
	 }
	 public void setDateCreated(Date dateCreated)
	 {
	 	this.dateCreated=dateCreated;
	 }
	 /*
	   the methods withdraws the money by subtracting 
	   it from the current balance
	 */
	 public double withdraw()
	 {
       double withdraw =0.0;
       withdraw= balance - withdraw;
       return withdraw;
	 }
	 /*
	  the methods deposits the money by adding  
	   it to the current balance
	 */
	 public double deposits()
	 {
	 
       double deposit=0.0;
       deposit =balance + deposit;
       return deposit;
	 }
}
