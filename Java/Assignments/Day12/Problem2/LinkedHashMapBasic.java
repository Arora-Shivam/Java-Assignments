package Java.Assignments.Day12.Problem2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapBasic {
    public static void main(String[] args) {
        Map<String,String> statesCapital=new LinkedHashMap<>();

        statesCapital.put("UP","Lucknow");
        statesCapital.put("MP","Bhopal");
        statesCapital.put("Rajasthan","Jaipur");
        statesCapital.put("MH","Mumbai");
        statesCapital.put("TN","Chennai");

        Set<Map.Entry<String,String>> keyValueStateCapital=statesCapital.entrySet();

        for(Map.Entry<String,String> i:keyValueStateCapital){
            System.out.println("Satate=> "+i.getKey()+" Capital=> "+i.getValue());
        }
    }
}
