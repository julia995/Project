package org.example.Project;

public class Task8 {
    public static void main(String[] args) {

        int [] array = {10, 45, 80};

        int max;
        int min;

        for (int i=0; i<array.length; i++) {
            if (array[0]>array[1]) {
                if (array[0]>array[2]){
                    max=array[0];
                } else {
                    max=array[2];
                }

            }else {
                if(array[1]>array[2]) {
                    max = array[1];
                } else {
                    max = array[2];
                }

            }
            System.out.println("Maximum number is " + max);
            break;
        }



        for (int i=0; i<array.length; i++) {
            if (array[0]<array[1]) {
                if (array[0]<array[2]){
                    min=array[0];
                } else {
                    min=array[2];
                }

            }else {
                if(array[1]<array[2]) {
                    min = array[1];
                } else {
                    min = array[2];
                }

            }
            System.out.println("Minimum number is "+ min);
            break;
        }






    }
}
