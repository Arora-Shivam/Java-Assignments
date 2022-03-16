package Java.Assignments.Day9.Problem1;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        try {
            System.out.println("Enter num1");
            num1 = sc.nextInt();
            System.out.println("Enter num2");
            num2 = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter valid number");
        }

        String message = null;
        int num3 = num1 / num2;
        if(num3 > 10){
            message = "Welcome to Exception Handling ";
        }
        System.out.println("Message is :"+message.toUpperCase());
        System.out.println("end of main");
    }

}
