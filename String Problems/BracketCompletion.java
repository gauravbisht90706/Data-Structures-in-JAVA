import java.util.ArrayList;
import java.util.Scanner;

public class BracketCompletion {
	
	static void bracket(String str) {
		int result = 0;
		ArrayList<Character> list = new ArrayList<>();
		
		
		for(char ch : str.toCharArray()) {
			list.add(ch);
		}
		for(int i=0;i<list.size();i++) {
			int count = 0;
			list.add(i, ')');
			for(int j=0;j<list.size();j++) {
				if(list.get(j) == '(')
					count++;
				else count--;
			}
			if(count ==0)
				result++;
			list.remove(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String of round brackets");
		String str = s.nextLine();
		
		System.out.println("number of ways to complete bracket are :-");
		bracket(str);
		
		
	}

}
