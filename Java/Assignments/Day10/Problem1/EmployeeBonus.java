package Java.Assignments.Day10.Problem1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus{
    void joiningDate(String date) throws InvalidAge{
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate joinDate = LocalDate.parse(date, formatter);

            LocalDate today=LocalDate.now();

            long experience=ChronoUnit.YEARS.between(joinDate,today);

            if(experience<0){
                throw new InvalidAge("Age should not be in the future");
            }
            else if(experience>=2){
                System.out.println("Bonus of 10000 credited");
            }
            else if(experience>=1)
                System.out.println("Bonus of 8000 credited");
            else
                System.out.println("Bonus of 5000 credited");
        }
        catch (Exception e){
            System.out.println("Please pass the date in correct format");
        }

    }
}
