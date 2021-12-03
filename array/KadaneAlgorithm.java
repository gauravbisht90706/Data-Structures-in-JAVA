package array;

import java.util.Scanner;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number of elements you want to insert in the array");
		int num = s.nextInt();
		int array[] = new int[num];
		System.out.println("enter the array");
        for(int i=0;i<num;i++) {
        	array[i] = s.nextInt();
        }
        int start = 0;
        int end = 0;
        int temp=0;
        int maxEndinghere  =  0;
        int maxSofar = 0;
        for(int i=0;i<num;i++) {
        	maxEndinghere = maxEndinghere + array[i];
        	
        	if(maxEndinghere >0) {
        	   if(maxSofar < maxEndinghere) {
        		     maxSofar = maxEndinghere;
        		     start = temp;
        		     end = i;
        		}}
        	
        	else {
        		maxEndinghere = 0;
        		temp = temp +1;
        	}
        	
        }
        System.out.println(maxSofar);
        System.out.println("the subarray with maximum sum is between :- " + start+ " to " + end);
        
	}
	

}
