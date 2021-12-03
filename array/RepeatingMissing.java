package array;

import java.util.Scanner;
import java.util.*;


public class RepeatingMissing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int size = s.nextInt();
		System.out.println("Input the array");
		int array[] = new int[size];
		
		for(int i=0;i<size;i++) {
			int num = s.nextInt();
			if(num <= size) 
				array[i] = num;
			
		}
			
		
	    int temp[] = new int[size];
	    
	    for(int i=0;i<size;i++) 
	    	temp[i] = 0;
	    
	    int repeating = 0;
	    
	    for(int i=0;i<array.length;i++) {
	    	if(temp[array[i]-1]==0) {
	    		temp[array[i]-1] =1;
	    	}
	    	else if(temp[array[i]-1]==1) {
	    		repeating = array[i];
	    		System.out.println("Repeating Element is "+ repeating);
	    	}
	    		
	    		
	    }
	    
	int missing = 0;
	for(int i=1;i<temp.length;i++) {
		if(temp[i] == 0)
			missing = i+1;
	}
	
	System.out.println("Missing Element is "+ missing);

  
	}}
