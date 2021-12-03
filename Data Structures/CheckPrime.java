package recursion;

import java.util.Scanner;

public class CheckPrime {
	
	public static int prime(int number, int i) {
		if( i == number)
			return 0;
		else {
			if(number % i ==0) {
				return 1;
			}
			else
				return prime(number, i+1);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		int check = prime(number,2);
		if(check ==1)
			System.out.println("Not Prime");
		else 
			System.out.println("Prime");
		
		
		
		
	}

}
