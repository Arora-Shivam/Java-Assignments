package Java.Assignments.Day15.Problem2;

public class RaceCondition {
    public static void main(String[] args) {
        Account rajuAccount=new Account();//Raju account
        rajuAccount.setBalance(5000);//5000->Balance of Raju Account
        Thread rajuGPay=new GPay(rajuAccount,3000);//GPay transaction Rs.3000 from raju Account;
        Thread rajuATM=new ATM(rajuAccount,4000);//ATM transaction Rs.3000 from raju Account;

        //Ideally one of the transaction should be unsuccessful due to insufficient balance but due to the race condition
        //we will have data inconsistency and both the transaction will be successful;

        rajuGPay.start();
        rajuATM.start();
        //Just by making the withdrawl method syncronized we can avoid this data inconsistency
    }
}
class Account{
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawl(int amount){
        if(balance>=amount){
            System.out.println("Transction successfull your balance is "+(balance-amount));
        }
        else{
            System.out.println("Transaction Failed Insufficient balance");
        }
    }
}
class GPay extends Thread{
    Account account;
    int withdrawlAmount;

    public GPay(Account account, int withdrawlAmount) {
        this.account = account;
        this.withdrawlAmount = withdrawlAmount;
    }

    @Override
    public void run(){
      account.withdrawl(withdrawlAmount);
    }
}
class ATM extends Thread{
    Account account;
    int withdrawlAmount;

    public ATM(Account account, int withdrawlAmount) {
        this.account = account;
        this.withdrawlAmount = withdrawlAmount;
    }

    @Override
    public void run(){
        account.withdrawl(withdrawlAmount);
    }
}