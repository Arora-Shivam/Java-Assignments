package Java.Assignments.Day13.Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Student> student=new ArrayList<>();
        student.add(new Student(1,"Name1",723));
        student.add(new Student(2,"Name2",823));
        student.add(new Student(3,"Name3",923));
        student.add(new Student(4,"Name4",623));
        student.add(new Student(5,"Name5",523));

        Stream<Student> streamOfStudent=student.stream();
        List<Student> listOfStudents=streamOfStudent.filter(s->s.getMarks()<800).collect(Collectors.toList());

        for (Student s:listOfStudents){
            System.out.println(s);
        }
    }
}
