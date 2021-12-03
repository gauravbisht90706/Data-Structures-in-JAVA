package array;

import java.util.HashMap;
import java.util.Scanner;


public class RepeatingMissingThroughMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size = s.nextInt();
		int array[] = new int[size];
		
		System.out.println("Input the array");
		for(int i=0;i<size;i++) {
		int num = s.nextInt();
		if(num <= size)
			array[i] = num;
		}
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i : array) {
			if(map.get(i)== null) {
				map.put(i, true);
			}
			else
				System.out.println("Repeating "+i);
		}
		
		for(int i=1;i<map.size();i++) {
			if(map.get(i)==null) {
				System.out.println("Missing "+i);
			}
		}
		

	}

}
