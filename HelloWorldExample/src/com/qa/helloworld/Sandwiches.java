package com.qa.helloworld;
import java.util.ArrayList;
import java.util.List;

public class Sandwiches{
    public static void main(String[] args){
        List<String> sandwiches = new ArrayList<>();
        
        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        System.out.println(sandwiches.size());
                

        for (String i : sandwiches){
            System.out.println(i);
        }
        


    }
}