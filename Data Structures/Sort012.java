import java.util.Scanner;
public class Sort012 {
     //brute force technique of sorting 0 1 and 2
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of element in the array");
		int num = s.nextInt();
		int array[] = new int[num];
		System.out.println("enter the element in the array with 0's 1's and 2's only");
		for(int i=0;i<array.length;i++) {
			array[i] = s.nextInt();
		}
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 0) {
				 count0++;
			}
			else if(array[i] ==1) {
				count1++;
			}
			else
				count2++;
		}
		int result[] = new int[array.length];
		int j=0;
		while(count0>0) {
			result[j] = 0;
			j++;
			count0--;
		}
		while(count1>0) {
			result[j] = 1;
			j++;
			count1--;
		}
		while(count2>0) {
			result[j] = 2;
			j++;
			count2--;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println("resultant array is " +result[i]);
		}
	}

}
