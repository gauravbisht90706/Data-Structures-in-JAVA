package array;

import java.util.Scanner;

public class MaximumSumSubarrayOptimized {
	
	static void maximumSum(int array[]) {
		int maxsum = Integer.MIN_VALUE;
		
		int sum = array[0];
		
		for(int j=0;j<array.length;j++) {
			int temp[] = new int[array.length-1];
			for(int i=1;i<array.length;i++) 
			{
				sum = sum + array[i];
				temp[i-1]= sum;
				if(sum > maxsum)
					maxsum = sum;
				}
			
		}
		
		System.out.println("Maximum sum is : "+maxsum);
				
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the number of elements in the array");
		int size = s.nextInt();
		
		System.out.println("Input the elements");
		int array[] = new int[size];
		
		for(int i=0;i<size;i++)
			array[i] = s.nextInt();
		
		maximumSum(array);
	}

}
