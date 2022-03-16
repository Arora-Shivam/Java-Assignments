package Java.Assignments.Day9.Problem2;

public class SavingAccount {
    static int accountNumber;
    static double balance;

    void deposit( int amount){
        balance+=amount;
        System.out.println("Your Balance is "+balance);
    }
    double withdraw(int amount) throws InsufficientFundException{
        if(amount>balance){
            throw new InsufficientFundException("Insufficient Amount in the Account");
        }
        return balance-amount;
    }
}
