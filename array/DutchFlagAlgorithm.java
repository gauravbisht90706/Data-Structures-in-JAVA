package array;

import java.util.Scanner;

public class DutchFlagAlgorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int size = s.nextInt();
		System.out.println("Enter the array of 0,1 and 2");
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = s.nextInt();
		}
		
		int low = 0;
		int mid = 0;
		int high = array.length-1;
		
		while(mid <= high) {
			int temp = 0;
			if(array[mid] == 0) {
				temp = array[mid];
				array[mid] = array[low];
				array[low] = temp;
				low++; mid++;
				
			}
			
			else if(array[mid] == 1) {
				mid++;
			}
			else if(array[mid] ==2) {
				temp = array[mid];
				array[mid] = array[high];
				array[high] = temp;
				high--;
				
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
