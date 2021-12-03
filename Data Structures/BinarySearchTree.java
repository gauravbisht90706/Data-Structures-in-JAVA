import java.util.*;

public class BinarySearchTree {
	
	static Scanner s = new Scanner(System.in);
	static int preIn = 0;

	public static void main(String[] args) {
		int preOrder[] = {1,2,4,3,5};
		int inOrder[] = {4,2,1,5,3};
		
	    Node2 root = buildTree(preOrder, inOrder, 0, preOrder.length-1);
	    preOrder(root);
		
		}
	
    static Node2 buildTree(int preOrder[], int inOrder[], int start, int end) {
    	
    	if(start > end)  return null;
    	
    	Node2 root = new Node2(preOrder[preIn++]);
    	
    	if(start == end)   return root;
    	
    	int  inorderIndex = search(inOrder, start, end, root.data);
    	
    	root.left = buildTree(preOrder, inOrder, start, inorderIndex-1);
    	root.right = buildTree(preOrder, inOrder, inorderIndex+1, end);
    	
    	return root;
    	
    	
    	
   }
    
   static int search(int array[], int start, int end, int data) {
	   if(start > end)  return 0;
	   
	   int index = 0;
	   
	   for(int i=0;i < array.length; i++) {
		   if(array[i]== data) {
			   index = i;
			   break;
		   }
			   
	   }
	   return index;
   }
   
   static void preOrder(Node2 root) {
	   if(root == null)  return;
	   
	   System.out.print(root.data+ " ");
	   preOrder(root.left);
	   preOrder(root.right);
   }

}
    	
    	
   
    


	
	
class Node2{
	Node2 left;
	Node2 right;
	int data;
	
	Node2(int data){
		this.data = data;
		
	}

}