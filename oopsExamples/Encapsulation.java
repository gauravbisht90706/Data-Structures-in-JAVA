package oopsExamples;

class EmployeeData{
	private String employeeName;
	private int employeeAge;
	
	public void setName(String Name) {
		employeeName = Name;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setAge(int age) {
		employeeAge = age; 
	}
	
	public int getAge() {
		return employeeAge;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		EmployeeData obj1 = new EmployeeData();
		obj1.setName("Gaurav");
		obj1.setAge(22);
		
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		
		

	}

}
