package com.bridgelabz.Day5;

import java.util.Scanner;

public class Quadratic {
	 public static void main(String[] args) {
	        int a, b, c;
	        int delta;
	        System.out.println("The Quadratic Equation is = a*x*x + b*x + c");
	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter the value of a = ");
	        a = sc.nextInt();

	        System.out.print("enter the value of b = ");
	        b = sc.nextInt();

	        System.out.print("enter the value of c = ");
	        c = sc.nextInt();

	        System.out.println("Find the Root of x");
	        //using delta formula from given and find root
	        delta = b*b - 4*a*c;

	        //Find root 1 and root 2 of x by using formula

	        int root1 =(int) (-b + Math.sqrt(delta))/(2*a);
	        int rooot2 =(int) (-b - Math.sqrt(delta))/(2*a);

	        System.out.println("Root 1 of X is " +root1);
	        System.out.println("Root 2 of X is " +rooot2);
	    }
	}


