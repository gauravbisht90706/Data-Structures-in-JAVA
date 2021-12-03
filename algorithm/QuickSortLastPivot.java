package algorithm;

import java.util.Scanner;
public class QuickSortLastPivot {
	
	public int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(array[j]<pivot) {
				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
			
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		return i+1;          // Partiton Index returning as pi in sort function
		
	}
	
	public void sort(int array[], int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);
			
			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
	}
	
	public void print(int array[]) {
		System.out.println("Sorted array is : -");
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+ " ");
		}
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int num = s.nextInt();
		System.out.println("enter the array");
		int array[] = new int[num];
		for(int j=0;j<num;j++) {
			array[j] = s.nextInt();
		}
		
		QuickSortLastPivot ob  = new QuickSortLastPivot();
		ob.sort(array, 0, num-1);
		ob.print(array);
		

	}

}
