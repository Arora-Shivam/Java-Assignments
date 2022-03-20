package Java.Assignments.Day11.Problem1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Set<Employee> employees=new TreeSet<>(new EmployeeSalaryComparator());

        int count=1;
        while(true){
            System.out.println("Enter the details of Employee"+(count++));

            System.out.println("Name=>");
            String name=input.nextLine();

            System.out.println("ID=>");
            int empId=input.nextInt();
            input.nextLine();

            System.out.println("Salary=>");
            double salary=input.nextDouble();
            input.nextLine();


            employees.add(new Employee(empId,name,salary));
            if(count==5){
                break;
            }

        }
        System.out.println("===============================================");
        int counter=1;
        for(Employee e:employees){
            System.out.println("Details of Employee"+(counter++));
            System.out.println("Name=> "+e.getEmpName());
            System.out.println("ID=> "+e.getEmpId());
            System.out.println("Salary=> "+e.getSalary());
            System.out.println();
        }
    }
}
