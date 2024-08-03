package org.example.Project;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number<=1 || number%2==0) {
            if (number==2) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number isn't prime");
            }

        } else {
            System.out.println("Number is prime");
        }
        }
    }
