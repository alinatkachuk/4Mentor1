package com.alinatkachuk;

public class Task2BubbleSort {

    private int tmp;
	private boolean bubble=false; 

	
	public void bubbleSorter(int [] newArray) {
		
		while (!bubble) {
			bubble=true;
		    for (int i=0; i<newArray.length-1; i++) {
		    	if (newArray[i]>newArray[i+1]) {
		    		tmp=newArray[i];
		    	    newArray[i]=newArray[i+1];
		    	    newArray[i+1]=tmp;
		            bubble=false;
		        }
		     }
         }
     }
}
