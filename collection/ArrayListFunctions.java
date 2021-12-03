package collection;
import java.util.*;
import java.util.ArrayList;

public class ArrayListFunctions {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		 List <String> vegetables = new ArrayList();
		 vegetables.add("potato");
		 vegetables.add("carrot");
		 vegetables.add("tomato");
		 fruits.addAll(vegetables);
		 System.out.println(fruits);
		 
		 System.out.println(fruits.get(3)); // returns the element at the specified index
		  vegetables.set(2, "ladyfinger");  // used to set a element at any index
		  System.out.println(vegetables);
		   fruits.remove(2);
		   System.out.println(fruits);
		   
		   List<String> toRemove = new ArrayList();
		   toRemove.add("hello");
		   toRemove.add("apple");
		   toRemove.add("welcome");
		   
		   toRemove.removeAll(fruits);
		   System.out.println(toRemove);
		   toRemove.clear();
		   System.out.println(toRemove);
		   
		   String temp[] = new String[fruits.size()];
		   fruits.toArray(temp);
		   
		   for(String e : temp) {
			   System.out.println(e);
		   }
		   
		   
		   		   
		 
	}
	}

	
	

