package array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//incomplete code of four sum
public class FourSum {
	
	public static void foursumimplement(int nums[], int target){
		ArrayList<ArrayList<Integer>> listoflist = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int start =j+1;
                int end = nums.length-1;
                ArrayList<Integer> list = new ArrayList<>();
                
                while(start < end){
                    if(nums[start]+nums[end]+nums[i]+nums[j] == target){
                        list.add(nums[start]);
                        list.add(nums[end]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        start++;
                        end--;
                        }
                    else if(nums[start]+nums[end]+nums[i]+nums[j] > target)
                        end--;
                    else
                        start++;
                    
                    listoflist.add(list);
                    
                }
                
                
            }
            
        }
        
        System.out.println(listoflist);
        
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of input");
		int n = s.nextInt();
		
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = s.nextInt();
		}
		System.out.println("Enter the value of target sum");
		int sum = s.nextInt();
		foursumimplement(nums, sum);
		
		
		
	}

}
