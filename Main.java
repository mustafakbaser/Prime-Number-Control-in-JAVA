package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i; //i is the number that we will get from the user.
        boolean isPrime = true; //default is prime value is true. If i is not prime, it will turn to false.

        System.out.print("\nPlease enter a number to calculate: ");
        Scanner input = new Scanner(System.in); //defined the scanner to take value from the user.
        i = input.nextInt(); //we equalized the number we received from the user to the value of i.

        for(int j = 2; j < i; j++){ //the variable j will increase until it is equal to the number received from the user, and perform this process.
            if(i % j == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println(i + " is a prime number!");
        }else {
            System.out.println(i + " is not a prime number!");
        }
    }
}
