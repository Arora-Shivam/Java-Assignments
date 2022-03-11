package Java.Assignments.Day7.Problem2;
import java.util.Scanner;
public class ReverseString {
    public static String reversString(String input){
//write the logic
        char[] charArray=input.toCharArray();
        String bag="";
        for(int i=charArray.length-1;i>=0;i--){
            bag+=charArray[i];
        }
        return bag;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}
