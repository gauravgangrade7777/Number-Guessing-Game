import java.util.Scanner;
public class ATMExample{
       public static void main(String[] args){
       int balance=100000;
       int withdraw;
       int deposit;
     Scanner sc= new Scanner(System.in);
  while(true)
{
 System.out.println("_________||Welcome to ATM ||_________ ");
System.out.println("choose 1 for Withdraw ");
System.out.println("choose 2 for Deposit");
System.out.println("choose 3 for Check Balance");
System.out.println("choose 4 for EXIT");
System.out.print("choose the operation you want to perform : ");
 int choice=sc.nextInt();
 switch(choice)
{
case 1:
System.out.print("Enter money to be withdraw : ");
withdraw=sc.nextInt();
if(balance>withdraw)
 {
  balance= balance-withdraw;
System.out.println("please collect your money.");
  }
 else{
   System.out.println("insufficient balance");
}
 System.out.println(" ");
break;

 case 2:
System.out.println("Enter the money to br deposited");
deposit=sc.nextInt();
 balance=balance+ deposit;
System.out.println("Your money has been successfully deposited");
System.out.println(" ");
break;

case 3:
System.out.println("Balance :"+balance);

case 4:
 System.exit(0);

}
}
}
}