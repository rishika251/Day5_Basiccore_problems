package com.bridgelabz.Day5;

import java.util.Scanner;

public class LargestNumber {
	 static int num1, num2, num3;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number:- ");
	        num1 = sc.nextInt();
	        num2 = sc.nextInt();
	        num3 = sc.nextInt();

	        //call method
	        getLargestNumber();
	    }

	    static void getLargestNumber() {
	        if (num1>= num2&& num2 >= num3) {
	            System.out.println(num1+ " is largest number");

	        } else if (num2 >= num3 && num2 >= num1) {
	            System.out.println(num2+ " is largest number");

	        }
	        else {
	            System.out.println(num3+ " is largest number");
	        }
	    }

	}

