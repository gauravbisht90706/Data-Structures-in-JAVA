package array;

import java.util.Scanner;

public class SumOfNumberDivisibleBy3 {
	
	public void sum(int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i] >0 && array[i] % 3==0) {
				sum=sum+array[i];
			}
		}
		System.out.println("the sum of the element in the array that are divisible by 3 is :- " +sum);
				
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		int array[] = new int[size];
		System.out.println("enter the elements in the array");
		for(int i=0;i<size;i++) {
			array[i] = s.nextInt();
		}
		
		SumOfNumberDivisibleBy3 ob = new SumOfNumberDivisibleBy3();
		ob.sum(array);
		
		

	}

}
