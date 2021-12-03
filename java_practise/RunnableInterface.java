package java_practise;


//Thread creating through runnable interface
public class RunnableInterface implements Runnable{
     public void run() {
    	 System.out.println("Thread is running through runnable interface");
     }
	

	public static void main(String[] args) {
		
		RunnableInterface obj = new RunnableInterface();
		Thread ob = new Thread(obj);
		ob.start();
		
	}

}
