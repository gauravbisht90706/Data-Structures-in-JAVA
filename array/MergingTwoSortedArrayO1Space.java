package array;

import java.util.Scanner;

public class MergingTwoSortedArrayO1Space {
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array1");
		int size1 = s.nextInt();
		
		System.out.println("Enter the number of element in the array2");
		int size2 = s.nextInt();
		
		System.out.println("Input the array 1 in sorted form");
		int array1[] = new int[size1];
		for(int i=0;i<size1;i++) 
			array1[i] = s.nextInt();
		
		System.out.println("Input the array 2 in sorted form");
		int array2[] = new int[size2];
		for(int i=0;i<size2;i++)
			array2[i] = s.nextInt();
		
		int j=0; int k=0;
		
		while(j < array1.length) {
			k=0;
			while(k < array2.length) {
				if(array1[j] > array2[k]) {
					int temp = array1[j];
					array1[j] = array2[k];
					array2[k] = temp;
				}
				else k++;
			}
			j++;
		}
		
		for(int i=0;i<array2.length;i++) {
			for(int l = i+1;l<array2.length;l++) {
				if(array2[l]< array2[i]) {
					int temp = array2[l];
					array2[l] = array2[i];
					array2[i] = temp;
				}
			}
		}
		
		for(int i=0;i<array1.length;i++)
			System.out.println(array1[i]);
		
		for(int i=0;i<array2.length;i++)
			System.out.println(array2[i]);
		
		
		

	}

}
