package com.alinatkachuk;

import java.util.Scanner;

public class Task3ToUpperCaseMethod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Enter one word (in Russian): ");
	    word = scanner.next();
	    
	    scanner.close();
	    
	    //������
	    System.out.println(word.toUpperCase());
	    
	    //������
	    System.out.println(word.toLowerCase());
	    
        //��������� ����� ��� ������ String.join, � ��������� �� ��������� ������� ???
	}

}
