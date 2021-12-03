package algorithm;

import java.util.Scanner;

public class QuickSortPivotFirst {
	
	public int  partition(int array[], int low , int high) {
		int pivot = array[low];
		int i = low+1;
		int j =high;
		
		
	}
	
	public void sort(int array[], int low, int high) {
		if(low < high) {
			int pi = partition(array, 0, high);
			
	}}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int num = s.nextInt();
		System.out.println("enter the array");
		int array[] = new int[num];
		for(int j=0;j<num;j++) {
			array[j] = s.nextInt();
		}
		QuickSortPivotFirst ob = new QuickSortPivotFirst();
		ob.sort(array, 0, num-1);
	}

	
		
	}


