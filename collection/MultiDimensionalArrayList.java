package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayList {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer>>();
		arr.add(new ArrayList<Integer>());  // allocated 0th row 
		arr.get(0).add(0,3);
		
		arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		arr.get(1).add(0,0);
		
		arr.add(new ArrayList<Integer>(Arrays.asList(10,20,30)));
		
		arr.get(2).add(1,40);
		
		System.out.println(arr);
		System.out.println(arr.get(1).get(2));
		
	
	}

}
