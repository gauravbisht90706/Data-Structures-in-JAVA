package array;

public class ArrayRotationByOne {

	public static void main(String[] args) {
		int array[] = {5,4,3,2,1};
		
		int i = array.length-1;
		int temp=0;
		
		while(i>0) {
			temp = array[i];
			array[i] = array[i-1];
			array[i-1] = temp;
			i--;
			}
		
		for(int j:array) {
			System.out.println(j);
		}
		
	}

}
