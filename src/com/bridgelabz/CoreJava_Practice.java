/* Q-6. Java Program to Compute Quotient and Remainder.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program

        Scanner scanner = new Scanner(System.in);  // Make scanner obj
        System.out.println("Enter the Dividend and Divisor: ");
        int dividend = scanner.nextInt(); // Int input
        int divisor = scanner.nextInt();

        int quotient = dividend/divisor; // To find quotient
        int remainder = dividend%divisor; // To find Remainder

        System.out.println("The Quotient is = "+quotient+" and the Remainder is = "+remainder);
        }

}

