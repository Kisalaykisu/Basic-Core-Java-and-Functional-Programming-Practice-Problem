/*     Q-2. Leap Year
         a. I/P -> Year, ensure it is a 4 digit number.
         b. Logic -> Determine if it is a Leap Year.
         c. O/P -> Print the year is a Leap Year or not.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        int year = Year();

        while(year<1000 || year>9999){      //  || represents logical Or
            System.out.println("Enter a four digit number.");
            year = Year();
        }

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

    public static int Year(){
        System.out.println("Enter an Year :: ");
        Scanner scanner = new Scanner(System.in);  // create Scanner Object
        return scanner.nextInt();

    }

    }

