package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter any string");
		String input = s.next();
		
		char array[] = input.toCharArray();
		
		for(int i=array.length-1; i>=0;i--)
			System.out.print(array[i]+ " ");
		
		

	}

}
