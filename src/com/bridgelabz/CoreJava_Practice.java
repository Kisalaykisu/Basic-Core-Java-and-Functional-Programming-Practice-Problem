/*    Q-3. Power of 2
       a. Desc -> This program takes a command-line argument N and prints a table of the
          powers of 2 that are less than or equal to 2^N.
       b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
       c. Logic -> repeat until i equals N.
       d. O/P -> Print the year is a Leap Year or not.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        int N = power();

        while( N < 0 || N > 31){
            System.out.println("Enter N value between 0 and 31");
            N = power();
        }
        for(int i=0;i<=N;i++) {
            System.out.println("2 power "+ i +" is: " + Math.pow(2, i));
        }
    }
    public static int power(){
        Scanner scanner = new Scanner(System.in);  // Make scanner Obj
        System.out.println("Enter the value of N: ");
        return scanner.nextInt();

    }

    }

