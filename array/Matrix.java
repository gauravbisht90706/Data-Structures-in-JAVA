package array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of rows in your matrix");
		int row = s.nextInt();
		System.out.println("enterthe number of columns in your matrix");
		int col = s.nextInt();
		
		int matrix1[][] = new int[row][col];
		System.out.println("enter the elements in the matrix1");
		for(int i=0; i<row;i++) {
			for(int j=0 ;j<col; j++) {
				matrix1[i][j] = s.nextInt();
				}
		}
		
		int matrix2[][] = new int[row][col];
		System.out.println("enter the element in the matrix2");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix2[i][j] = s.nextInt();
			}
		}
		int result[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<col;k++) {
					result
				}
			}
		}
		
		

	}

}
