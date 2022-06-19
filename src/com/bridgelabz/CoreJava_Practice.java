/* Q-8 Java Program to Check Whether a Number is Even or Odd.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        Scanner scanner = new Scanner(System.in); //Make scanner obj
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();  // Input int

        if(num%2==0){
            System.out.println(num+" is an even number");
        }else
            System.out.println(num+" is an odd number");
        }

}

