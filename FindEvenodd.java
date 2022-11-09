package com.bridgelabz.Day5;

import java.util.Scanner;

public class FindEvenodd {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //check the number is even or odd
        if(num % 2 == 0) {
            System.out.println(num + " is even");
	} else {
            System.out.println(num + " is odd");
    }
}	
}

