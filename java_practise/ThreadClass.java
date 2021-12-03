package java_practise;

public class ThreadClass extends Thread {
	
	public void run() {
		try {
		System.out.println("Thread is running sucessfully");
		System.out.println(Thread.currentThread().getId() + " " +Thread.currentThread().getName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		 
		ThreadClass obj = new ThreadClass();
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		
		obj.start();
		
		
		obj.setName("gaurav");
		System.out.println(obj.getName());

	}

}
