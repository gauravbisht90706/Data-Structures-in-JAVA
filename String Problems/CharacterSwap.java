import java.util.Scanner;

public class CharacterSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = sc.nextLine();
		
		char array[] = s.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			int k = i;
			
			while(i < array.length && array[i] != ' ') {
				i++;
			}
			
			char temp = array[k];
			array[k] = array[i-1];
			array[i-1] = temp;
		}
		
		System.out.println(new String(array));

	}

}
