/*
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

