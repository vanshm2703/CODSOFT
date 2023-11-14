
class userbankaccount
 {
    
   String name;
   int accno,bal;     
   userbankaccount(String a,int x,int y)
   {
     name=a;
     accno=x;
     bal=y;
   }
   int withdraw(int x)
   {
       if(bal>=x && x<=60000)
       {
          bal=bal-x;
          System.out.println("now your balance is "+bal);
          return x;
          
       }
       else
       {
           System.out.println("Transaction failed because you have exceeded the daily transaction amount or you do not have sufficient balance");
           return -1;
       }
       
   }
   void deposit(int x)
   {
      bal=bal+x;
      System.out.println("now your balance is "+bal);
   }
   int checkbal()
   {   System.out.println("Your account balance is "+bal);
       return bal;
   }
   
    
 }
