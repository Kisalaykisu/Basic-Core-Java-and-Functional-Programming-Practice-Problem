/* Q-4. Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
*/
package com.bridgelabz;

import java.util.Scanner;  // import Scanner

public class CoreJava_Practice {
    public static void main(String[] args) { // Entry Point of Program
        int N = nthValue();
        double nthHarmonic = 0;

        while (N==0){
            System.out.println("Enter a value other than zero.");
            N = nthValue();
        }

        for(int i=1;i<=N;i++){
            nthHarmonic+=(double)1/i;
            System.out.println(i+" th Harmonic Number is 1/"+i+" = "+ nthHarmonic);
        }
    }
    public static int nthValue(){
        Scanner scanner = new Scanner(System.in);  // Make Scanner object
        System.out.println("Enter the value of N: ");
        return scanner.nextInt();

    }

    }

