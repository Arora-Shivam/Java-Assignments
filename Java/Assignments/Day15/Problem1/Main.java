package Java.Assignments.Day15.Problem1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"Shivam","shivam@gmail.com","shivam123",new Address("UP","Rampur",244901));
        Student student2=new Student(2,"Ram","Ram@gmail.com","Ram123",new Address("MP","Rampur",21212));

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        try {
            //Serialization
            FileOutputStream fileOutputStream=new FileOutputStream("student.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);


            //Deserialization
            FileInputStream fileInputStream=new FileInputStream("student.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
           List<Student> studentListDeserialized=(List<Student>)objectInputStream.readObject();
            //Adding the student now
            Student student3=new Student(3,"Ramesh","Ramesh@gmail.com","Ramesh123",new Address("MH","Rampur",21212));
            studentListDeserialized.add(student3);
            objectOutputStream.writeObject(studentListDeserialized);
            List<Student> studentListDeserialized2=(List<Student>)objectInputStream.readObject();
           for (Student s:studentListDeserialized){
               System.out.println(s);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
