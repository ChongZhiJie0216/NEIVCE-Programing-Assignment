package OOP.Assignment01;

import java.util.Scanner;

public class Question01 {
    static double balance=0;
    double setWithdraw=0;
    double setDeposit=0;
    double setTransfer=0;
    public void setDeposit(double deposit){
        setDeposit = balance + deposit;
        balance=setDeposit;
    }
    public void setWithdraw(double withdraw){
        setWithdraw = balance - withdraw;
        balance=setWithdraw;
    }
    public void setTransfer(double transfer){
        if (transfer <= balance){
            setTransfer=balance-transfer;
            balance=setTransfer;
            System.out.println("Transfer Success");
            System.out.println("Your Current Balance balance is :" + balance);
        }else{
            System.out.println("Failed to transfer");
            System.out.println("Sorry Your Balance is not enough for above Transaction");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question01 account = new Question01();
        int selection = 0;
        Question01.balance=1500;
        while(true) {
            System.out.println(" ");
            System.out.println("*Firefox Banking ATM System*");
            System.out.println("****************************");
            System.out.println("** 1. Deposit Money        **");
            System.out.println("** 2. Withdraw Money       **");
            System.out.println("** 3. Transfer Money       **");
            System.out.println("** 4. Balance Inquiry      **");
            System.out.println("** 5. End Session          **");
            System.out.println("Please Enter your Selection(1-5):");
            selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Your Current Saving balance is :" + balance);
                System.out.println("How Mich Money would you like to Deposit?:");
                double deposit = sc.nextDouble();
                account.setDeposit(deposit);
                System.out.println("Your Savings Balance is now :RM" + account.setDeposit);
            }
            if (selection == 2) {
                System.out.println("Your Current Saving balance is :" + balance);
                System.out.println("How Mich Money would you like to withdraw?:");
                double withdraw = sc.nextDouble();
                account.setWithdraw(withdraw);
                System.out.println("Your Savings Balance is now :RM" + account.setWithdraw);
            }
            if (selection == 3) {
                System.out.println("Your Current Saving balance is :" + balance);
                System.out.println("How Mich Money would you like to Transfer?:");
                double transfer = sc.nextDouble();
                account.setTransfer(transfer);
            }
            if (selection == 4) {
                if (balance <= 0) {
                    System.out.println("Your Current Balance balance is : 0");
                } else {
                    System.out.println("Your Current Balance balance is :" + balance);
                }
            }if (selection ==5 ){
            break;
            }
        }
    }
}
