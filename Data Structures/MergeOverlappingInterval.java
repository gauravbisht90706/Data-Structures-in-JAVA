import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MergeOverlappingInterval {
	
	static void merge(ArrayList<List<Integer>> list){
		if(list.isEmpty())
			return;
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int previous = -1;
		int current  = -1;
		
		for(int i=0;i<list.size();i++) {
			if(previous == -1) {
				previous = list.get(i).get(0);
				current = list.get(i).get(1);
				
			}
			else {
				if(list.get(1).get(0) > current) {
					result.add(new ArrayList<Integer>());
					result.get(i).add(previous);
					result.get(i).add(current);
					previous = list.get(i).get(0);
					current = list.get(i).get(1);
				}
				
				else {
					current = Math.max(current, list.get(i).get(0));
					
				}
				
				result.add(new ArrayList<Integer>());
				result.get(i)
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		System.out.println("Enter the number of interval");
		int n = s.nextInt();
		
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Integer>());
			System.out.println("Enter the interval");
			for(int j=0;j<2;j++) {
			int element = s.nextInt();
			list.get(i).add(element);
		}}
		
		merge(list);

	}

}
