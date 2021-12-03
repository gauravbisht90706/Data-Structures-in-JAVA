import java.util.*;
import java.util.Map.Entry;

public class TopViewOfBinaryTree {
     static Scanner s  = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node1 root = insert();
		
		levelOrder(root);
		System.out.println();
		TopViewOfBinaryTree.topView(root);
		
	}
	
	static Node1 insert() {
		Node1 root = null;
		
		System.out.println("enter data");
		int data = s.nextInt();
		
		if(data == -1)  return null;
		
		root = new Node1(data);
		System.out.println("enter the left child for "+data);
		root.left = insert();
		System.out.println("enter the right child for " +data);
		root.right = insert();
		
		return root;
		
	}
	
	static void levelOrder(Node1 root) {
		if(root == null) return;
		
		Queue<Node1> q = new LinkedList<>();
		q.add(root);
		while(! q.isEmpty()) {
			Node1 node = q.poll();
			System.out.print(node.data+ " ");
			if(node != null) {
				if(node.left != null) q.add(node.left);
				
				if(node.right != null) q.add(node.right);
				
			}
			
			
		}
		
	}
	
	static void topView(Node1 root) {
		
		class QueueObj{
			Node1 node;
			int hd;
			
			QueueObj(Node1 node, int hd){
				this.node = node;
				this.hd = hd;
			}
		}
		
		if(root == null)  return;		
	Map<Integer, Integer> map = new TreeMap<>();
		Queue<QueueObj> q = new LinkedList<>();
		
		q.add(new QueueObj(root, 0));
		
		while(! q.isEmpty()) {
			QueueObj temp = q.poll();
			
			if(! map.containsKey(temp.hd)) {
				map.put(temp.hd, temp.node.data);
				
			}
		
			if(temp.node.left != null) {
				q.add(new QueueObj(temp.node.left, temp.hd-1));
			}
			if(temp.node.right != null) {				q.add(new QueueObj(temp.node.right, temp.hd+1 ));
			}
		}		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue()+ " ");
		}
	
		
	}
	
	

//-------------End of Main Class_____________________//
}

 class Node1{
	Node1 left, right;
	int data;
	
	Node1(int data){
		this.data = data;
	}
 }
