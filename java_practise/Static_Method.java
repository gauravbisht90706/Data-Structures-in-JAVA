package java_practise;

 class Info{
	static String college_name = "Chandigarh University";
	int uid;
	String name;
	
	
	Info(String name, int uid){
	    this.name = name;
		this.uid = uid;
	}
	void display() {
		System.out.println(name+ " " +uid+ " " +college_name);
	}
	
	static void change() { // Static method is used to change the value of static variable.
		college_name = "Panjab University";
	}
}

public class Static_Method {

	public static void main(String[] args) {
		Info obj = new Info("Gaurav", 1212);
		Info obj1 = new Info("john", 1214);
		obj.display();
		obj1.display();
		
		Info.change();// static method can be called directly,  without creating the instance of the class.
		Info obj2 = new Info("Gaurav", 1212);
		Info obj3 = new Info("John", 1214);
		obj2.display();
		obj3.display();
		
		
	}

}
