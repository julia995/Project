package org.example.Project;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 15, 20},
                {25, 30, 35},
                {40, 45, 50}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];
                } else {
                    sumOdd += numbers[i][j];
                }
            }
        }

        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);
    }
}
