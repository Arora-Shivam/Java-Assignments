package Java.Assignments.FinalEvaluation.problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {


        List<String> mobList=new ArrayList<>();
        mobList.add(model);

        mobiles.put(company,)

        //add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
        //if the company name already exists then their model should be added to the //existing list.
        //This method should return a message "Mobile added successfully" after //adding a mobile.
    }

    public static void main(String[] args) {



    }
}
