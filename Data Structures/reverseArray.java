import java.util.Scanner;
public class reverseArray {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of elements you want to put in the array");
		int num = s.nextInt();
		int array[] = new int[num];
		System.out.println("enter the elements in the array");
		for(int i=0;i<array.length;i++) {
			array[i] = s.nextInt();
			
		}
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max= array[i];}}
		
			System.out.println("maximum value is " +max);
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i] < min) {
				min = array[i];
			}}
			System.out.println("minimum value is " +min);
		

	}

}
