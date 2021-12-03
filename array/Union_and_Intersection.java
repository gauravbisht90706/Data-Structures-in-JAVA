package array;

import java.util.Scanner;

public class Union_and_Intersection {

	public void intersection(int array1[], int array2[], int n1, int n2) {
		int i = 0, j = 0;
		while (i < n1 - 1 && j < n2 - 1) {
			if (array1[i] < array2[j]) {
				i++;
			}
			if (array1[i] > array2[j]) {
				j++;
			} else {
				System.out.println(array2[j++]);
				i++;
			}
		}
	}

	public void union(int array1[], int array2[], int n1, int n2) {
		int i = 0, j = 0;
		while (i < n1 - 1 && j < n2 - 1) {
			if (array1[i] < array2[j]) {
				System.out.println(array1[i++]);
			}
			if (array2[j] < array1[i]) {
				System.out.println(array2[j++]);
			} else {
				System.out.println(array2[j++]);
				i++;
			}
		}

		while (i < n1) {
			System.out.println(array1[i++]);
		}
		while (j < n2) {
			System.out.println(array2[j++]);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of element in the array1");
		int num1 = s.nextInt();
		System.out.println("enter the number of element in the array2");
		int num2 = s.nextInt();
		System.out.println("enter the array1");
		int array1[] = new int[num1];
		for (int i = 0; i < num1; i++) {
			array1[i] = s.nextInt();
		}
		System.out.println("enter the array2");
		int array2[] = new int[num2];
		for (int i = 0; i < num2; i++) {
			array2[i] = s.nextInt();

		}

		Union_and_Intersection obj = new Union_and_Intersection();
		obj.intersection(array1, array2, num1, num2);
		obj.union(array1, array2, num1, num2);
	}

}
