package array;

import java.util.Scanner;
//this is brute force approach whose time complexity is O(n^3)
public class MaximumContiguousSubarraySum {
	
	public static void maximumSum(int array[]) {
		int maxsum = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum = array[k]+sum;
					
				}
				if(sum > maxsum)
					maxsum = sum;
			}
		}
		
		System.out.println("Maximum contiguous sum is : "+ maxsum);
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size = s.nextInt();
		
		System.out.println("Input the array");
		int array[] = new int[size];
		for(int i=0;i<size;i++) 
			array[i] = s.nextInt();
		
		maximumSum(array);
		
		
		
	}

}
