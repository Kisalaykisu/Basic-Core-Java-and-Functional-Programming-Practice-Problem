/* Q-5. Factors
      a. Desc -> Computes the prime factorization of N using brute force.
      b. I/P -> Number to find the prime factors
      c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
      d. O/P -> Print the prime factors of number N.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        int number;
        Scanner scanner = new Scanner(System.in); // Make scanner Obj
        System.out.println("Enter a number ::");
        number = scanner.nextInt();
        System.out.println("Prime factors are: ");

        for(int i = 2; i<= number; i++) {
            while(number%i == 0) {
                System.out.println(i);
                number = number/i;
            }
        }

    }

    }

