
import java.util.*;

public class atmmachine
{
    userbankaccount start()
    {
        int a=0;
        String b="Vansh";
        int c=123456;
        userbankaccount obj1=new userbankaccount(b,c,a);
        return obj1;
        
    }
    public static void main()
    {
      System.out.println("\f");
      Scanner sc=new Scanner(System.in);
     atmmachine atm=new atmmachine();
      userbankaccount acct=atm.start();
      int k,y;
     System.out.println("enter account number");
     int u=sc.nextInt();
     if(u==acct.accno)
     {
        
     do
     { 
     
     System.out.println("Welcome to the atm "+acct.name);
     System.out.println("enter 1 for withdraw\nenter 2 for deposit\nenter 3 for check balance\nenter 4 to quit");
     k=sc.nextInt();
     System.out.println("\f");
     if(k==1)
     {
        System.out.println("enter amount to withdraw");
        y=sc.nextInt();
        acct.withdraw(y);
        
     }
     else if(k==2)
     {
         System.out.println("enter amount to deposit");
         y=sc.nextInt();
         acct.deposit(y);
     }
     else if(k==3)
     {
         
         acct.checkbal();
     }
     else if(k==4)
     {
         System.out.println("Thankyou for using atm");
     }
     else
     {
         System.out.println("error\nenter valid number");
     }
    } while(k!=4);}
    else
    {
        System.out.println("enter valid account number");
    }
}
}
