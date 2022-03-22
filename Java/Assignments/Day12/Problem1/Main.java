package Java.Assignments.Day12.Problem1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Student> student=new HashMap<>();

        student.put("UP",new Student(12,300,"Ram"));
        student.put("MH",new Student(15,200,"Ramesh"));
        student.put("TN",new Student(22,370,"Raman"));
        student.put("Karnataka",new Student(62,190,"Ratan"));
        student.put("Bihar",new Student(19,350,"Rakesh"));

    }
}
