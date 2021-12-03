package java_practise;

public class ThreadSleep extends Thread {
	
	public void run() {
		for(int i = 0; i< 6; i++) {
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
		
		ThreadSleep obj = new ThreadSleep();
		ThreadSleep obj2 = new ThreadSleep();
		
		obj.start();
		obj2.start();

	}

}
