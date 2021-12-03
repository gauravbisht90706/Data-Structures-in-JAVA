import java.util.Scanner;

public class ThreeWayPartitioning {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
	   System.out.println("enter the number of element you want to insert in the array");
	   int num = s.nextInt();
	   int array[] = new int[num];
	   System.out.println("enter the elements in the array");
	   for(int i=0;i<array.length;i++) {
		   array[i] = s.nextInt();
	   }
	   
	   int high = num-1;
	   int low = 0;
	   int mid = 0;
	   int temp = 0;
	   
	   while(mid <=high) {
		   if(array[mid]==0) {
			   temp = array[mid];
			   array[mid] = array[low];
			   array[low]=temp;
			   low++;
			   mid++;
		   }
		   if(array[mid]==1) {
			   mid++;
		   }
		   if(array[mid]==2) {
			   temp = array[mid]; 
			   array[mid] = array[high];
			   array[high] = temp;
			   high--;
			   mid++;
		   }
	   }
	   System.out.println("resultant array is : " );
	   for(int i=0;i<array.length;i++) {
		   
		   System.out.println(array[i]);
	   }
	}

}
