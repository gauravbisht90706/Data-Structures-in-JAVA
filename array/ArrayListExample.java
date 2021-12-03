package array;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the element you want to insert in the arrayList");
		int num = s.nextInt();
		System.out.println("enter the elements in the list");
		for(int i = 0;i<num;i++) {
			int userinput = s.nextInt();
			arr.add(userinput);
		}
		System.out.println(arr);
		System.out.println(arr.size());
		
	}

}