package com.bridgelabz.Day5;
/*Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.*/
import java.util.Scanner;

public class HarmonicNumber {
	  public static void main(String[] args) {
	        System.out.print("Enter any number : ");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        double result = 0.0;
	        if (num != 0) {
	            while (num > 0) {
	                result = result + (double) 1 / num;
	                num--;
	            }
	            System.out.println("Total of Harmonic Series is " + result);
	        } else
	            System.out.println("Invalid input");
	    }
	}