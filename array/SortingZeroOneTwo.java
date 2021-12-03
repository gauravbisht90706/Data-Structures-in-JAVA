package array;

import java.util.Scanner;

public class SortingZeroOneTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of element you want to insert in the array");
		int num = s.nextInt();
		System.out.println("Enter the array of 0, 1 and 2");
		int array[] = new int[num];
		
		for(int i=0;i<num;i++) 
			array[i] = s.nextInt();
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<num;i++) {
			if(array[i]==0)  count0++;
			if(array[i]==1)  count1++;
			if(array[i]==2)  count2++;
				
		}
		
		int j=0;
		while(count0 >0) {
			array[j] = 0;
			j++;
			count0--;
		}
		
		while(count1 >0) {
			array[j] = 1;
			j++;
			count1--;
		}
		
		while(count2 >0) {
			array[j] = 2;
			j++;
			count2--;
		}
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
