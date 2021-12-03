package string;

import java.util.Scanner;

public class StringReverseRecursion {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("input string");
		String input = s.next();
		reverse(input);
	}
	
	static void reverse(String str) {
		if(str == null || str.length() <=1)  // base case
			System.out.print(str);
		
		else {
			System.out.print(str.charAt(str.length()-1)+ " ");
			reverse(str.substring(0, str.length()-1));
		}
	}
}
