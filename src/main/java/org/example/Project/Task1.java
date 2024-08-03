package org.example.Project;

public class Task1 {
    public static void main(String[] args) {

        int [] temperature = {85, 90, 91, 92, 87, 84};

        int highest = temperature[0];
        int lowest = temperature[0];

        for (int temp: temperature) {
            if (temp>highest) {
                highest = temp;
            }
            if (temp <lowest) {
                lowest = temp;
            }
        }

        System.out.println("The highest temperature is " + highest);
        System.out.println("The lowest temperature is " + lowest);



    }
}
