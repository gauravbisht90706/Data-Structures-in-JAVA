package array;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int num = s.nextInt();
		System.out.println("enter the array you want to insert in the the array");
		int array[] = new int[num];
		for(int i=0;i<num;i++) {
			array[i] = s.nextInt();
			
		}
		System.out.println("enter the number by which you want to rotate the array");
		int d = s.nextInt();
		
		int i=0;
		while(i<d) {
			int temp = array[i];
			for(int j =1;j<array.length;j++) {
				array[j-1] = array[j];
			}  
			array[num-1] = temp;
			i++;
		}
		for(int j : array) {
		System.out.println(j); }
   
	}
rtfg
}
