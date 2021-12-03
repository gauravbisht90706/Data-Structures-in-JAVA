package array;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
    System.out.println("enter the number of elements you want to put inside the array");
    int num = s.nextInt();
    int array[] = new int[num];
    boolean sorted = true;
    System.out.println("enter the elements in the array");
    for(int i=0;i<num ;i++) {
    	array[i] = s.nextInt();
    	}
    for(int i=0;i<num-1;i++) {
    	for(int k=i+1;k<num;k++) {
    		if(array[k]<array[i]) {
    			int temp = array[k];
    			array[k] = array[i];
    			array[i] = temp;
    			sorted = false;
    		}
    		
    	}
    	if(sorted==true) //for checking if the array is sorted so that no extra loop could run. to avoid irrelevant looping
    		break;
    }
    for(int item : array) {
    	System.out.println(item +"");
    }
	}

}
