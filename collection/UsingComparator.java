package collection;
import java.util.*;
public class UsingComparator {

	public static void main(String[] args) {
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the number of input in the list");
		int num = s.nextInt();
		
		for(int i=0;i<num;i++) {
			list.add(new ArrayList<Integer>());
			System.out.println("Enter the element");
			for(int j=0;j<2;j++) {
				int element = s.nextInt();
				list.get(i).add(element);
				}
			
		}
		
         System.out.println("Unsorted List :- " +list);
		 
         Collections.sort(list, new Comparator <ArrayList<Integer>>() {
			 public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
				 return a.get(0).compareTo(b.get(0));
			 }
		 });
		 
		 System.out.println(list);
		 
		 
         

	}

}
