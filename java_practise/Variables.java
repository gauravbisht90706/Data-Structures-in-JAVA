package java_practise;

public class Variables {
	
	static String college_name = "Chandigarh University"; // static keyword is used where the property of the objects are same
	static int count = 0; // static variable is preserving its value till program is terminated..
	//if we will not use static keyword then every time the object is created, it will make the value of count to 0..
	
	 Variables(String name, int uid) {
		
		System.out.println("Name of the student is : " +name);
		System.out.println("Uid of the student is : " +uid);
		System.out.println("University name is : " +college_name);
		
		college_name = "Panjab University";
		System.out.println("University name is " +college_name);
		
		System.out.println(count++);
	}
	
public static void main(String[] args) {
	
	Variables obj = new Variables("gaurav", 1212);
	Variables obj1 = new Variables("John", 1214);
	
		}


}
