package Java.Assignments.Day13.Problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitySort {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Rampur");
        cities.add("Moradabad");
        cities.add("Amroha");
        cities.add("Rudarpur");
        cities.add("Nainital");
        cities.add("Zaka");

        Collections.sort(cities,(c1,c2)->c2.compareTo(c1));

        for(String city:cities){
            System.out.println(city);
        }
    }
}
