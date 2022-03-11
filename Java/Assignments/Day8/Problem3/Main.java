package Java.Assignments.Day8.Problem3;

import java.util.Scanner;

public class Main {
    public Hotel provideFood(int amount){
        if(amount>1000){
            Hotel taj=new TajHotel();


            return taj;
        }
        else if(amount>200){
            Hotel road=new RoadSideHotel();

            return road;
        }
        else{

            return null;
        }
    }
    public static void main(String[] args) {
        Main objMain=new Main();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the AMount in RS.");
        int amount=input.nextInt();
        Hotel resObj=objMain.provideFood(amount);
        if(resObj instanceof TajHotel){
            TajHotel tajObj=(TajHotel)resObj;
            tajObj.welcomeDrink();
            resObj.chickenBiryani();
            resObj.masalaDosa();

        }
        else if( resObj instanceof RoadSideHotel){
            resObj.chickenBiryani();
            resObj.masalaDosa();
        }
        else
            System.out.println("Enter a valid Amount");
    }
}

