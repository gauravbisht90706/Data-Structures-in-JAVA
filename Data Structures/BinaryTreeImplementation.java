import java.util.*;
import java.util.Scanner;

public class BinaryTreeImplementation {
	
	 static Scanner s = null;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		Node root = createTree();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		
		int treeHeight = height(root);
		System.out.println(treeHeight);
		levelOrder(root);
		
	}
	
	static Node createTree() {
		Node root = null;
	    System.out.println("enter data");
	    int data = s.nextInt();
	    
	    if(data == -1)  return null;
	    
	     root = new Node(data);
	    System.out.println("enter left child for " +data);
	    root.left = createTree();
	    
	    System.out.println("enter right child for " +data);
	    root.right = createTree();
	    
	    return root;
	    
	}
	
	static void  inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root == null)  return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
	static void preOrder(Node root) {
		if(root == null)  return;
		
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	static int height(Node root) {
		if(root == null)  return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
    static void levelOrder(Node root) {
    	if(root == null)  return;
    	
    	Queue<Node> q = new LinkedList<>();
    	
    	q.add(root);
    	q.add(null);
    	
    	while(!q.isEmpty()) {
    		Node node = q.peek();
    		q.remove();
    		
    		if(node != null) {
    			System.out.print(node.data+ " ");
    			if(node.left !=null) {
    				q.add(node.left);
    			}
    			if(node.right != null) {
    				q.add(node.right);
    			}
    		}
    		else if(node == null) {
    			q.add(null);
    		}
    	}
    	
    	
    }}
    
   

class Node{
	
	Node left, right;
	int data;
	Node(int data){
		this.data = data;
	}
}
