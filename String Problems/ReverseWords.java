import java.util.Scanner;

public class ReverseWords {
	
	 static void reverse(String str) {
		char temp[] = str.toCharArray();
		
		for(int i=temp.length-1;i>=0;i--) {
			System.out.println(temp[i]);
		
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		reverse(str);
		

	}

}
