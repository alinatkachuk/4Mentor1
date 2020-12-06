package com.alinatkachuk;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Enter one word (in Russian): ");
	    word = scanner.next();
	    
	    scanner.close();
	    
	    char [] wordToArray0 = word.toCharArray();
	    char [] wordToArray1 = word.toCharArray();
	    char [] wordToArray2 = word.toCharArray();
	    
	    //œ–»¬≈“
	    for (int i=0; i<wordToArray0.length; i++) { 
     	   	if (wordToArray0[i]>=97 && wordToArray0[i]<=122) { 
     	     	wordToArray0[i]-=32;
	    		System.out.print(wordToArray0[i]);
	    	} else {
	    		System.out.print(wordToArray0[i]);
	    	} 		    	
	    }
	    System.out.println(); 
	    
	  //ÔË‚ÂÚ
	    for (int i=0; i<wordToArray1.length; i++) { 
     	   	if (wordToArray1[i]>=65 && wordToArray1[i]<=90) { 
     	     	wordToArray1[i]+=32;
	    		System.out.print(wordToArray1[i]);
	    	} else {
	    		System.out.print(wordToArray1[i]);
	    	} 		    	
	    }
	    System.out.println();
	    
	  //Ú≈‚»œ
	    for (int i=1; i<wordToArray2.length; i=i+2) { 
     	   	if (wordToArray2[i]>=97 && wordToArray2[i]<=122) { 
     	     	wordToArray2[i]-=32;
	    	} 		    	
	    }
	    
	    for (int i=0; i<wordToArray2.length; i=i+2) { 
     	   	if (wordToArray2[i]>=65 &&wordToArray2[i]<=90) { 
     	     	wordToArray2[i]+=32;
	    	} 
      	}
	    for (int i=wordToArray2.length-1; i>=0; i--) {
	    	 System.out.print(wordToArray2[i]);
	    }
	    System.out.println();
	    
	  //œ»‚≈ÚÚ≈‚»œ
	    for (int i=0; i<wordToArray2.length; i++) {
	    	 System.out.print(wordToArray2[i]);
	    }
	    for (int i=wordToArray2.length-1; i>=0; i--) {
	    	 System.out.print(wordToArray2[i]);
	    }
	    
	}
}
