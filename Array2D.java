package com.bridgelabz.Day5;

import java.util.Scanner;

public class Array2D {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); //create object for Scanner class
	        //declare variables M=rows, N=Cols
	        int m, n;
	        int array2D[][] = new int[10][10]; //declare array obj and define max size of array


	        //enter rows and colums for array
	        System.out.print("Enter Row size for the 2D-array (max 10) : ");
	        m = sc.nextInt();
	        System.out.print("Enter Column Size for the 2D-array (max 10) : ");
	        n = sc.nextInt();

	        //M * N inputs for 2D Array
	        int arrayElement = m*n;

	        //enter 2D-array elements
	        System.out.println("Enter " +arrayElement+ " array Elements : ");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                array2D[i][j] = sc.nextInt();
	            }
	        }

	        //Display the 2D array
	        System.out.println("The Array is :\n");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(array2D[i][j]+ "  ");
	            }
	            System.out.println();
	        }

	    }
}
