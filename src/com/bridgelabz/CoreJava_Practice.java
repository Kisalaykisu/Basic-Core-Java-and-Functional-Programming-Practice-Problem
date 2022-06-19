/* Q-9) Java Program to Check Whether an Alphabet is Vowel or Consonant
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        boolean is_Vowel=false;    // initialize condition as false
        Scanner scanner = new Scanner(System.in); // Make Scanner obj

        System.out.println("Enter the number : ");

        char alphabet = scanner.next().charAt(0);  // Input char

        char[] vowels = {'a','e','i','o','u'};

        for (char item : vowels) {
            if (alphabet == item) {
                is_Vowel = true;
                break;
            }
        }
        if (is_Vowel){
            System.out.println( alphabet + " is a Vowel");
        }else
            System.out.println( alphabet + " is a Consonant");

    }
}
