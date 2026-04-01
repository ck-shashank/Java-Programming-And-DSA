package pkg1;


//import java.util.Scanner;
public class BankAccount {
    String un;
    long accNo;
    double bal;
    static String bankName="SBI";
    public BankAccount(String un, long accNo,double bal){
        this.un=un;
        this.accNo=accNo;
        this.bal=bal;
        System.out.println("Account Created");
        System.err.println("----------");
    }
    public void deposit(double amt){
        if(amt>0 && amt<99999){
            bal=bal+amt;
            System.out.println("amount deposited: new balance is:"+bal);
        }
        else{
            System.out.println("invalid balance");
        }
        System.err.println("----------");
    }
    public void withdraw(int amt){
        if(bal>=amt && amt>0){
            bal=bal-amt;
            System.out.println("Amount deducted: available balance is: "+bal);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        System.err.println("----------");
        
    }
    public void checkBalance(){
        System.out.println("Available Balance: "+bal);
        System.err.println("----------");
    }
    public void details(){
        System.out.println("Account holder     : "+un);
        System.out.println("Account number     :"+accNo);
        System.out.println("Available Balance  :"+bal);
        System.out.println("Bank Name          :"+bankName);
        System.err.println("----------");
    }
    //main method block----------
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Chandan",37942279534L,5000.0);
       b1.deposit(400.0);
        b1.withdraw(12000);
       b1.checkBalance();
        b1.details();/*
        while(true) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 to Deposit");
        System.out.println("Enter 2 to withdraw");
        System.out.println("Enter 3 to check balance");
        System.out.println("Enter 4 to see details");
        int c=sc.nextInt();
        switch(c){
            case 1: b1.deposit(1000.0);
            break;
            case 2: b1.withdraw(1200);
            break;
            case 3: b1.checkBalance();
            break;
            case 4: b1.details();
            break;
            default: System.out.println("Invalid Input");


        }
        }*/

    }

    
}    

