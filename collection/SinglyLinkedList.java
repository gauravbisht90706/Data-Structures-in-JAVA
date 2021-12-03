package collection;

public class SinglyLinkedList {
	Node head ;
	
	static class Node{
		int data;
		Node next;
		 Node(int d){
			 data = d;
			 next = null;
		 }
	}
	
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
		Node newnode = new Node(data);
		newnode.next = null;
		if(list.head==null) {
			list.head = newnode;
			
		}
		else {
			Node temp = list.head;
			while(temp.next!=null) {
				temp = temp.next;
				
			}
			temp.next = newnode;
		}
		return list;
	}
	
	static void print(SinglyLinkedList list) {
		if(list.head==null) {
			System.out.println("Linked List in empty");
		}
		else {
			Node temp = list.head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	
	static SinglyLinkedList nthNodeFromLast(SinglyLinkedList list,int indexFromLast) {
		Node temp = list.head;
		int length=0;
		while(temp!=null) {
			length++;
			temp = temp.next;
		}
		temp = list.head;
		
		for(int i=1;i<length-indexFromLast;i++) {
			temp = temp.next;
		}
		System.out.println("element at index " +indexFromLast+ " from last is "  +temp.data);
		return list;
		}
	
	

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		
		list.print(list);
		list.nthNodeFromLast(list, 2);
		

	}

}
