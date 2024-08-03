package org.example.Project;

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {45, 2, -6, 50, 900};

        int largest;
        int secondLargest;

        if (numbers[0]>numbers[1]){
            largest=numbers[0];
            secondLargest = numbers[1];
        } else {
            largest=numbers[1];
            secondLargest=numbers[0];
        }

        for (int i=2; i<numbers.length; i++){
            if (numbers[i]>largest) {
                secondLargest=largest;
                largest=numbers[i];
            } else if(numbers[i]>secondLargest){
                secondLargest=numbers[i];
            }
        }
        System.out.println("Second highest number is " +secondLargest);
    }
}
