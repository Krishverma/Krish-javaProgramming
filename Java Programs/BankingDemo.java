/*Define a class bank having acno cname, actype and balance as private data menmbers
Write a methid setbalance depends upon type of accountfor saving account
set the balance 10000
for current account 20000
write a method open account to enter acc no. cname and account type and call the method set balance to set the balance
Write a method deposit money to deposit the money
Write a method withdraw money to wothdraw the money
enquiry account to diplay acc details
 */

import java.util.Scanner;
class Bank{
    private int acno, balance;
    private String cname,actype;
    private void setBalance(){
        if(actype.equalsIgnoreCase("savings"))
            balance = 10000;
        else if (actype.equalsIgnoreCase("current")) {
            balance = 20000;
        }

    }
    public void openAccount(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Account Number ");
        acno=s1.nextInt();
        System.out.println("Enter your Name ");
        cname=s1.next();
        System.out.println("Enter type of Account savings/current ");
        actype = s1.next();
        setBalance();
    }
    public void dePosit(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Amount to be Deposited ");
        int damount = s1.nextInt();
        balance = balance + damount;

    }
    public void withDraw(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw ");
        int wamount = s1.nextInt();
        if(wamount<balance){
            balance = balance - wamount;
        }
        else {
            System.out.println("Not Enough Balance");
        }
    }
    public void enQuiry(){
        System.out.println("Customer Name "+cname);
        System.out.println("Account Number "+acno);
        System.out.println("Account Type "+actype);
        System.out.println("Net Balance "+balance);
    }
}

public class BankingDemo {
    public static void main(String ar[]){
        Scanner ss = new Scanner(System.in);
        System.out.println("Welcome Bank");
        System.out.println("Please Open Your Account");
        Bank s1 = new Bank();
        s1.openAccount();
        s1.enQuiry();
        System.out.println("Do you want to Withdraw / Deposit Money");
        String a = ss.next();
        if(a.equalsIgnoreCase("yes")) {
            System.out.println("Enter your Choice -");
            System.out.println("1. Withdraw");
            System.out.println("2.Deposit");
            int c = ss.nextInt();
            switch (c) {
                case 1:
                    s1.withDraw();
                    s1.enQuiry();
                    break;
                case 2:
                    s1.dePosit();
                    s1.enQuiry();
                    break;
            }
        }
        else{
            System.out.println("Thank you");
            }

    }
}
