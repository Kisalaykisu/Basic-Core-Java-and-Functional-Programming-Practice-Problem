/*      1. Flip Coin and print percentage of Heads and Tails
        a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
        b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
        heads
        c. O/P -> Percentage of Head vs Tails
*/
package com.bridgelabz;

import java.util.Random;   // import Random
import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) {  // Entry Point of Program

        int heads = 0;  // Variable Creation
        int tails = 0;
        int coin;
        int n;

        Random random = new Random();  // Make Random obj
        n = coinFlip();
        while(n<=0) {
            System.out.println("Enter a positive integer.");
            n = coinFlip();
        }

        for(int i=0; i<n; i++) {

            coin = random.nextInt(2);
            switch (coin) {
                case 0 -> heads++;
                case 1 -> tails++;
            }
        }
        System.out.println("Heads = " + heads);
        System.out.println("Tails = " + tails);
        System.out.println("Percentage Heads= "+(double)heads/n*100+" %");
        System.out.println("Percentage Tails= "+(double)tails/n*100+" %");
        if ((double)heads/n>0.5){
            System.out.println("Its Heads");
        }else
            System.out.println("Its Tails");

    }
    public static int coinFlip(){
        Scanner scanner = new Scanner(System.in);  // Make Scanner Obj
        System.out.println("Enter the number of times to flip the coin: ");
        return scanner.nextInt();
    }

    }

