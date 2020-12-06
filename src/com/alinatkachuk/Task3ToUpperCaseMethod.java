package com.alinatkachuk;

import java.util.Scanner;

public class Task3ToUpperCaseMethod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Enter one word (in Russian): ");
	    word = scanner.next();
	    
	    scanner.close();
	    
	    //ПРИВЕТ
	    System.out.println(word.toUpperCase());
	    
	    //привет
	    System.out.println(word.toLowerCase());
	    
        //соединить можно при помощи String.join, а разделить на отдельные символы ???
	}

}
