package Java.Assignments.Day7.Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Roll Number");
        int roll=input.nextInt();
        input.nextLine();
        System.out.println("Marks");
        int marks=input.nextInt();
        input.nextLine();
        System.out.println("Name");
        String name=input.nextLine();
        Student obj=new Student(roll,name,marks);
        System.out.println("Student Details =>");
        System.out.println("Student Name=> "+obj.getStudentName());
        System.out.println("Student Marks=> "+obj.getMarks());
        System.out.println("Student Roll Number=> "+ obj.getRollNumber());

    }
}
