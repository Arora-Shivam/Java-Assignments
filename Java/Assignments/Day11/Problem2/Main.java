package Java.Assignments.Day11.Problem2;

import Java.Assignments.Day11.Problem1.Employee;
import Java.Assignments.Day11.Problem1.EmployeeSalaryComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        List<Product> products=new ArrayList<>();

        int count=1;
        while(true){
            System.out.println("Enter the details of Product"+(count++));

            System.out.println("Name=>");
            String name=input.nextLine();

            System.out.println("ID=>");
            int Id=input.nextInt();
            input.nextLine();

            System.out.println("Price=>");
            double price=input.nextDouble();
            input.nextLine();


            products.add(new Product(Id,name,price));
            if(count==5){
                break;
            }

        }
        System.out.println("=======================================");
        System.out.println("Choose the sorting Method=> \n" +
                "    1 for sorting the product according to the productPrice\n" +
                "    2 for sorting the product according to the productName\n" +
                "    3 for sorting the product according to the productId\n");


        int choice=0;
        try {
           choice = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Because you Entered a Invalid Number Products will be Sorted According to the ID");
        }



        if(choice==1){
            Collections.sort(products,new ProductsPriceComparator());
        }
        else if(choice==2){
            Collections.sort(products,new ProductsNameComparator());
        }
        else{
            Collections.sort(products,new PoductsIdComparator());
        }

        
        System.out.println();
        System.out.println(products);
    }


}
