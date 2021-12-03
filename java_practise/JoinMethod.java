package java_practise;

public class JoinMethod extends Thread {
	
	public void run() {
		for(int i = 0;i<5;i++){
		try {
		Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		JoinMethod obj = new JoinMethod();
		JoinMethod obj2 = new JoinMethod();
		JoinMethod obj3 = new JoinMethod();
		try {
			obj.start();
			obj.join(1500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		obj2.start();
		obj3.start();

	}

}
