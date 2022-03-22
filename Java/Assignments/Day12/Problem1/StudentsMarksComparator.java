package Java.Assignments.Day12.Problem1;

import java.util.Comparator;
import java.util.Map;

public class StudentsMarksComparator implements Comparator<Map.Entry<String,Student>> {


    @Override
    public int compare(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2) {
        return (e1.getValue().getMarks() > e2.getValue().getMarks()) ? +1 : -1;
    }
}
