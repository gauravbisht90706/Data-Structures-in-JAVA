package recursion;

import java.util.Scanner;

public class PowerCalcuation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number");
		int num = s.nextInt();
		System.out.println("Input a power");
		int pow = s.nextInt();
		
		System.out.println(calculate(num, pow));
		

	}
	static int calculate(int num, int pow) {
			if(pow == 0) {
				return 1;
			}
			else {
			  int result = num * calculate(num, pow-1);
			  return result;
			}
	}

}
