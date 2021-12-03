import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int counter = 0;
	    	System.out.println("enter the number you  want to check");
	    	int num = s.nextInt();
	    	for(int i = 1;i<=num;i++) {
	    		if(num % i ==0) {
	    			counter++ ;
	    		}
	    		
	    	}
	    	if(counter==2){
	    		int temp = num+2;
	    		int flag = 0;
	    		
	    		for(int i = 1; i<=temp; i++) {
	    			if(temp % i ==0) {
	    				flag++;
	    			}
	    			
	    		}
	    		if(flag==2) {
	    			System.out.println(num+ " is twin prime number");
	    		}
	    		else {
	    			System.out.println("Number is not twin prime");
	    		}
	    	
	    	}
	    	else {
	    		System.out.println("number is not twin prime");
	    	}
	    	
	    	
	}

}
