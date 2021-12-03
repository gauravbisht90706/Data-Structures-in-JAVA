package array;

import java.util.Scanner;

public class OptimizedMaxmSumSubset {
	public void MaxmSumSubset(int array[], int maxSum) {
		int checkSum = array[0];
		int last = 0;
		for (int i = 1; i < array.length; i++) {

			if (checkSum < maxSum) {
				checkSum = checkSum + array[i];
			}

			if (checkSum > maxSum) {
				while (checkSum > maxSum && last < i) {
					checkSum = checkSum - array[last];
					last++;
				}
			}
			else if (checkSum == maxSum) {
				for (int k = last; k < i; k++) {
					System.out.println(array[k]);
				}
			} 
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		System.out.println("enter the elements in the array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		System.out.println("enter the maximum sum");
		int maxSum = s.nextInt();

		OptimizedMaxmSumSubset ob = new OptimizedMaxmSumSubset();
		ob.MaxmSumSubset(array, maxSum);
	}

}
