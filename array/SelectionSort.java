package array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.println("enter the number of element you want to put in the array");
	     int num = s.nextInt();
	     int array[] = new int[num];
	     System.out.println("enter the elements in the array");
	     for(int i=0;i<num;i++) {
	    	 array[i] = s.nextInt();
	     }
	     for(int i=0;i<num;i++) {
	    	 int min = i;
	    	 for(int j=i+1;j<num;j++) {
	    		 if(array[j] < array[min]) {
	    			 min = j;
	    		 }
	    	 }
	    	 int temp = array[i];
	    	 array[i] = array[min];
	    	 array[min] = temp;
	    	 
	    	 
	     }
	     System.out.println("Sorted array is");
	     for(int i : array) {
	    	 
	    	 System.out.println(i);
	     }

	}

}
