
import java.util.Scanner;//importing the scanner
public class ATM{
	static int id;
	public static void main(String[] list)
	{
      //creating a scanner object
	  Scanner input =new Scanner(System.in);
     
      Account account =new Account(1,100.9);
      //declaring an array[] of 5 saving account
       SavingAccount[] savingAcc={new SavingAccount(2001,199.34),
       	                          new SavingAccount(2002,1000.4),
       	                          new SavingAccount(2003,1500.0),
       	                          new SavingAccount(2004,3000.6),
       	                          new SavingAccount(2005,5000.0)};
     //declaring an array[] of 5 checking account  	                            
       CheckingAccount[] checkingAcc={new CheckingAccount(2006,2400.0),
                                      new CheckingAccount(2007,2000.56),
                                      new CheckingAccount(2008,7000.0),
                                      new CheckingAccount(2009,7060.0),
                                      new CheckingAccount(2010,80700.0),};

       System.out.println("Enter account Id");
       id =input.nextInt();//gettting the accountId from user
       boolean option=true;//initialising the boolean value
      while(option)
      {
      	int i;
      for (i=0;i<5;i++)//looping inside the array
       {
       	  if(savingAcc[i].id ==id ||checkingAcc[i].id == id)//checking if the user id entered is the same as the one in the both arrays
       	  {
       	  	System.out.println("MAIN MENU: \n 1.Check Balance \n2.Withdraw \n 3.Deposit \n4.Exit");//printing the menu
            int menu=input.nextInt(); 
            /*
            if the user choose number 1 on the menu the program
            will display the balance matching the id entered
            */
            if(menu == 1)
            {

              if(savingAcc[i].id ==id)
              {
              	 System.out.println("Balance"+ savingAcc[i].getBalance());
              }	
              else if(checkingAcc[i].id == id)
              {
              	
                 System.out.println("Balance"+ checkingAcc[i].getBalance());
              	}
              }
          	  
            }
            /*
               if the user choose number 2 on the menu the program
              should ask the user to enter the amount to be withdrawed
              and its gonna subtract the amount from the current balance
              and its gonna show remaining balance
            */
            else if(menu == 2)
            {
              if(savingAcc[i].id ==id)
              {
              	System.out.println("Enter the amount");
              	 double withdraw=input.nextDouble();

                 System.out.println("" + (savingAcc[i].withdraw()-withdraw));
              } 
              else if(checkingAcc[i].id == id)
              {
              	System.out.println("Enter the amount");
              	 double withdraw=input.nextDouble();
                 System.out.println("" + (checkingAcc[i].withdraw()-withdraw));
              } 	
              
            }
            /*
              if the user choose number 3 on the menu the program
              should ask the user to enter the amount to be deposited
              and its gonna add the amount to the current balance
              and show new balance
            */
            else if(menu ==3)
            {
               if(savingAcc[i].id ==id)
               {
              	System.out.println("Enter the amount");
              	 double deposit=input.nextDouble();

                 System.out.println("" + (savingAcc[i].deposits()+deposit));
               } 
              else if(checkingAcc[i].id == id)
              {
              	System.out.println("Enter the amount");
              	 double deposit=input.nextDouble();
                 System.out.println("" + (checkingAcc[i].deposits()+deposit));
              } 
            }
            /*
            if the user choose number 4 on the menu the program
             should ask the user to enter the Id
             then its going to terminate 
            */
            else if(menu == 4)
            {
               System.out.println("Enter account Id");
               id= input.nextInt();
               option=false;
            }
       	  }
          
       }
     }  

	
