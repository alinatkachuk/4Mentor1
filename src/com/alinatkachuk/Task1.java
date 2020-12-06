package com.alinatkachuk;

import java.util.Scanner;

public class Task1 {

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
	    
	    int tmp;
	    boolean bubble=false; 
	 
	    while (!bubble) {
	    	bubble=true;
	        for (int i=0; i<array.length-1; i++) {
	            	if (array[i]>array[i+1]) {
	            		tmp=array[i];
	    		        array[i]=array[i+1];
	    		        array[i+1]=tmp;
	    		        bubble=false;
	    		    }
	        }
	    }
	    
	    for (int i=0; i<array.length; i++) {
	    	System.out.print(array[i]+" ");
	    	
	    }
 	}
}
