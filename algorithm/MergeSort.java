package algorithm;

import java.util.Scanner;

public class MergeSort {
	
	public void merge(int array[], int low, int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i] = array[low+i];
			
		}
		for(int j=0;j<n2;j++) {
			right[j] = array[mid+1+j];
		}
		
		int i=0, j=0;
		
		int k=low;
		
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			array[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	public void sort(int array[], int low, int high) {
		
		if(low < high) {
			int mid = (low+high)/2;
			
			sort(array, low, mid);
			sort(array, mid+1, high);
			
			merge(array, low, mid, high);
		}
	}
	
	public void print(int array[]) {
		System.out.println("Sorted array is :- ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of element you want to insert in the array");
		int num = s.nextInt();
		int array[] = new int[num];
		System.out.println("enter the array");
		for(int i=0;i<num;i++) {
			array[i] = s.nextInt();
		}
		
		MergeSort ob = new MergeSort();
		ob.sort(array, 0, num-1);
		ob.print(array);
		

	}

}
