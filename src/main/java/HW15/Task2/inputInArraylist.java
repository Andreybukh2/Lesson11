package org.example.Lesson11HW15Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class inputInArraylist {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Hello"));
        ArrayList<String> arrayList = new ArrayList<String>();
        while (scanner.hasNext()) {
            arrayList.add(scanner.next());
            System.out.print(arrayList.size());
            System.out.println(arrayList);
        }
        scanner.close();
    }
}