 import java.util.*;


public class ATM {
    public static void main(String args[])
    {
        int balance= 100000,withdraw,deposite;

        try (Scanner sc = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for withdraw");
                System.out.println("choose 2 for Deposite");
                System.out.println("choose 3 for check Balance");
                System.out.println("choose 4 for EXIT");
                System.out.println("Choose the operation you want to perform:");

                int choice=sc.nextInt();
                
                switch(choice)
                {
                    case 1: System.out.println("Enter money to be withdraw");

                    withdraw = sc.nextInt();

                    if(balance>=withdraw)
                    {
                        balance=balance-withdraw;
                        System.out.println("Please collect your money");
                    }
                    else 
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                    case 2: System.out.println("Enter money to be deposited");

                     deposite=sc.nextInt();

                     balance=balance+deposite;
                     System.out.println("Your money has been successfully deposited");
                     System.out.println("");
                     break;

                     case 3: System.out.println("Balance : "+balance);
                }
            }
        }

    }
    
}
