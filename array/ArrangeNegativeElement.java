package array;

import java.util.Scanner;

public class ArrangeNegativeElement {

	public static void main(String[] args) {
	    Scanner s  = new Scanner(System.in);
	    System.out.println("enter the number of element you want to insert in the array");
	    int num = s.nextInt();
	    
	    System.out.println("enter the array");
	    int array[] = new int [num];
	    for(int i=0;i<num;i++) {
	    	array[i] = s.nextInt();
	    	}
	    
	    int j=0;
	    
	    //this logic have time complexity of O(n) and space complexity O(1)
	    for(int i=0;i<num;i++) {
	    	if(array[i]<0) {
	    		if(i!=j) {
	    	      int temp = array[i];
	    	      array[i] = array[j];
	    	      array[j] = temp;
	    	      
	    		}
	    		j++;
	    		
	    	}
	    	
	    }
	    for(int i : array) {
	    	System.out.println(i);
	    }

	}}


