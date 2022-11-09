package com.bridgelabz.Day5;

public class SumOfThreeIntZero {
	 public static void main(String[] args) {
	        int array[] = {5,3,-4,-9,6,-8,-3};
	        //print array
	        System.out.println("array Elements:- ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+ " ");
	        }
	        System.out.println();
	        getCountTriplets(array); // call the method
	        findTriplets(array);


	    }

	    //create static method for count triplets
	    //method for display and print trh Distinct triplets

	    static void getCountTriplets(int array[]) {
	        int count = 0;
	         //consider all triplets and count if their sum is == 0
	        for (int i = 0; i < array.length - 2; i++)
	            for (int j = i + 1; j < array.length - 1; j++)
	                for (int k = j + 1; k < array.length; k++)
	                    if (array[i] + array[j] + array[k] == 0)
	                        count++;
	        System.out.println("number of distinct triplets are " +count);

	    }

	    //create method to display or print all triplets of array

	    static void findTriplets(int array[]) {
	        for (int i = 0; i < array.length - 2; i++)
	            for (int j = i + 1; j < array.length - 1; j++)
	                for (int k = j + 1; k < array.length; k++)
	                    if (array[i] + array[j] + array[k] == 0)
	                        System.out.println("distinct triplets :- " +array[i]+ " " +array[j]+ " " +array[k]);
	    }
	}

