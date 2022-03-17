package Java.Assignments.Day10.Problem1;

public class Main {
    public static void main(String[] args) {
        EmployeeBonus employee=new EmployeeBonus();
        try {
            employee.joiningDate("22-02-2021");
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }
        try {
            employee.joiningDate("22-02-2021");
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }   try {
            employee.joiningDate("22/02-2021");
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }   try {
            employee.joiningDate("22-02-2020");;
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }   try {
            employee.joiningDate("22-02-2000");
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }
        try {
            employee.joiningDate("22-02-2022");
        }
        catch (InvalidAge ia){
            System.out.println(ia.getMessage());
        }




    }
}
