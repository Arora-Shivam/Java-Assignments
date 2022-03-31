package Java.Assignments.Day15.Problem3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {

        File file=new File("abc.txt");

        //Writing to a file
        try {
            PrintWriter write=new PrintWriter(file);
            write.println("Hello Read This File Using->");

            write.print(1);
            write.println(" Buffered Reader");

            write.print(2);
            write.println(" File Reader");

            write.print(3);
            write.println(" nio Package");

            write.flush();
            write.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Reading Using File Reader
        System.out.println("Reading With Help of File Reader=>");
        System.out.println();
        try {
            FileReader fileReader=new FileReader(file);

            int i=fileReader.read();

            while(i!=-1){
                System.out.print((char)i);
                i=fileReader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("================================================");
        //Reading Using Buffered Reader
        System.out.println("Reading With Help of Buffered Reader=>");
        System.out.println();
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=bufferedReader.readLine();

            while(line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("================================================");
        System.out.println("Reading With Help of nio package=>");
        //Reading with help of nio package

        Path p= Paths.get("abc.txt");

        try {
            Stream<String> streamOfLines= Files.lines(p);

            streamOfLines.forEach(s-> System.out.println(s));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
