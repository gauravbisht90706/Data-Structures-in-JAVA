package array;

import java.util.Scanner;

public class MultidimensionalArray {
	public static void main(String args[]) {
	Scanner s  = new Scanner(System.in);
	System.out.println("enter the numbers of rows and columns in array A");
	int rowsA = s.nextInt();
	int colsA = s.nextInt();
	System.out.println("enter the numbers of rows and columns in array B");
	int rowsB = s.nextInt();
	int colsB = s.nextInt();
	int arrayA[][] = new int[rowsA][colsA];
	int arrayB[][] = new int[rowsB][colsB];
	System.out.println("enter the array A");
	for(int i=0;i<rowsA; i++) {
		for(int j = 0;j<colsA;j++) {
			arrayA[i][j] = s.nextInt();
		}	
	}
	System.out.println("enter the array B");
	for(int i = 0;i<rowsB;i++) {
		for(int j = 0;j<colsB;j++) {
			arrayB[i][j] = s.nextInt();
		}
	}
	int arrayC[][] = new int[rowsA][colsA];
	if(colsA != rowsB) {
		System.out.println("multiplication cannot be done");
		
	}
	
	else {
		for(int i = 0;i<rowsA; i++) {
			for(int j = 0;j<colsB;j++) {
				for(int k=0;k<colsB;k++) {
					arrayC[i][j] =arrayC[i][j]+ arrayA[i][k]*arrayB[k][j];
				}
			}
		}
		
	}
	for(int i=0;i<rowsA;i++) {
		for(int j=0;j<colsA;j++) {
			System.out.print(arrayC[i][j]);
		}
	}
	
	
	
	
}
}
