package org.example.Project;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        String[] names = {"Mike", "John", "David", "Leo", "Will", "David"};


        for (int i = 1; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                    break;
                }
            }

        }
    }
}
