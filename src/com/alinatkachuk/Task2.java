package com.alinatkachuk;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N;
		
		do {
		    do {
		    System.out.print("Enter the amount of real numbers in array (<=5): ");
		    N = scanner.nextInt();
		    } while (N<=0);
		} while (N>5);   
		
		int [] array = new int [N];
					
	    for (int i=0; i<array.length; i++) {
	    	System.out.print("Enter a integer: ");
	    	array[i]=0;
	    		if (scanner.hasNextInt()) {
	    			array[i]=scanner.nextInt();  
	    		} else {
	    		 	System.out.println("Wrong number format. Try again!");
	    		}
	    }  
	    scanner.close();
	    
	    Task2BubbleSort BubbleS = new Task2BubbleSort();
	    BubbleS.bubbleSorter(array); //Enter the name of the array, the numbers of which you want to sort, in the brackets
	    
	    for (int i=0; i<array.length; i++) {
	    	System.out.print(array[i]+" ");
	    }
	}
}

