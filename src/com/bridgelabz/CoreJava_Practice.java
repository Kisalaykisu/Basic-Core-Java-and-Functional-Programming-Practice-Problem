/* Q-10.) Java Program to Find the Largest Among Three Numbers
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        Scanner scanner = new Scanner(System.in);  //Make Scanner obj
        System.out.println("Enter three numbers : ");
        int num1 = scanner.nextInt();  // INPUT int
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largestNum = 0;

        if (num1>largestNum){
            largestNum=num1;
        }
        if (num2>largestNum){
            largestNum=num2;
        }
        if (num3>largestNum){
            largestNum=num3;
        }

        System.out.println("The largest number is = "+largestNum);

    }
}
