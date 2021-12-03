package array;

import java.util.Scanner;

public class MaxmSumSubsetProblem {
	
	public void  maxmSumSubset(int array[], int maxSum ) {
		int i=0;
		int  j=0;
		int checkSum = 0;
		
		while(i < array.length) {
			 j = i;
			while(j < array.length && checkSum < maxSum) {
				checkSum = checkSum + array[j];
				
				if(checkSum == maxSum)
					break;
				else 
					j++;
			}
			if(checkSum == maxSum)
				break;
			if(i+1 == array.length)
				System.out.println("subarray not found");
			
			checkSum = 0;
			i++;
		}
		if(checkSum == maxSum) {
		for(int k = i; k <= j;k++) 
			System.out.println(array[k]);}
		
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		System.out.println("enter the elements in the array");
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = s.nextInt();
		}
		System.out.println("enter the maximum sum");
		int maxSum = s.nextInt();
		
		MaxmSumSubsetProblem ob = new MaxmSumSubsetProblem();
		ob.maxmSumSubset(array, maxSum);
	}

}
