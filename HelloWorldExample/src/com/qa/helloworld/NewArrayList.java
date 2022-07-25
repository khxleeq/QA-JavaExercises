package com.qa.helloworld;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewArrayList {
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
        
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(8);
        arraylist.add(3);
        arraylist.set(2, 3);
        arraylist.set(3, 4);
        

        
        System.out.println(arraylist);
//        Collections.sort(arraylist);

        
//        for (int i : arraylist){
//            System.out.println(i);
//        }
	}

}
