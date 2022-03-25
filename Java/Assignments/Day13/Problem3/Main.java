package Java.Assignments.Day13.Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents=new ArrayList<>();

        listStudents.add(new Student(1,"Name1",98));
        listStudents.add(new Student(2,"Name2",98));
        listStudents.add(new Student(3,"Name3",78));
        listStudents.add(new Student(4,"Name4",99));
        listStudents.add(new Student(5,"Name5",91));

        Stream<Student> studentStream=listStudents.stream();

        List<Employee> empList=studentStream.map(s->{
            Employee e=new Employee(s.getRoll(),s.getName(),s.getMarks()*1000);
            return e;
        }).collect(Collectors.toList());

        for(Employee e : empList){
            System.out.println(e);
        }
    }
}
