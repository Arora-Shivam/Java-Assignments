package Java.Assignments.Day9.Problem2;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount person=new SavingAccount();

        SavingAccount.accountNumber=123;
        SavingAccount.balance=100;



        person.deposit(2500);

        try {
           double balance= person.withdraw(20000);
            System.out.println("Balance after withdrawal "+balance);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
