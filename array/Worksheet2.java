package array;

import java.util.Scanner;

public class Worksheet2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements in array");
		int num = s.nextInt();
		System.out.println("enter the array");
		int array[] = new int[num];
		for(int i=0;i<num;i++) {
			array[i] = s.nextInt();
			
		}
		int sub=0;
		for(int i=0;i<num;i++) {
			if(array[i] ==6) {
				sub = sub+6;
			    for(int j=i+1;j<num;j++){
			    	if(array[j]==7) {
			    		sub = sub+7;
			    		break;
			    	}
			    	else {
			    		sub = sub+array[j];
			    	}
			    	
			    	}
			    
			}
			
			}
		int sum=0;
			for(int i=0;i<num;i++) {
				sum = sum+array[i];
				
		}
			System.err.println(sum-sub);
		

	}

}
