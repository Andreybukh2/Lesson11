package org.example.Lesson11HW15Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListElements {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        java.util.Random random = new Random();
        integerList.add(0,1);
        integerList.add(1,2);
        integerList.add(2,57);
        integerList.add(3,32);
        integerList.add(3,67);

        System.out.println("Count of elements in mas - " + integerList.size());
        System.out.println(integerList);
    }
}
