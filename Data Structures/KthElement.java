import java.util.Scanner;
public class KthElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of element in the array");
		int num = s.nextInt();
		int array[]  = new int[num];
		System.out.println("enter the lelements in the array");
		for(int i=0;i<array.length;i++) {
			array[i] = s.nextInt();
			
		}
		System.out.println("at which index number you want to find the element");
		int index = s.nextInt();
		int i = 0;
		while(i<=index) {
			if(index==i) {
				System.out.println(array[index]);
				break;
			}
			else
				i++;
			
		}
		
	}

}
