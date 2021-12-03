package collection;

import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number of element you want to insert in hashmap");
		int num = s.nextInt();
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		for(int i=0;i<num;i++) {
			System.out.println("enter the key of the hashtable");
			int key = s.nextInt();
			System.out.println("enter the value of the hashtable");
			String value = s.next();
			
			ht.put(key, value);
		}
		
		for(Map.Entry<Integer, String> en : ht.entrySet()) {
			System.out.println(en.getKey()+"  "+en.getValue());
		}
		

	}

}
