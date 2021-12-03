package collection;

public class DoublyLinkedList {
	Node head;;
	
	 class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	// Adding node in front of the DLL
	public void push(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		newnode.prev = null;
		
		if(head !=null) {
			head.prev = newnode;
		}
		head = newnode;
	}
	
	public void append(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		if(head == null) {
			head = newnode;
		}
		else {
			
			while(temp.next !=null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
			
		}
	}
	
	public void insertAfter(int data, int key) {
		if(head==null) {
			System.out.println("DLL is empty");
		}
		else {
			Node temp = head;
			Node newnode = new Node(data);
			while(temp.data != key) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			newnode.prev = temp;
		}
	}
	
	public void insertAfterIndex(int data, int index) {
		if(head == null) {
			System.out.println("DLL is empty");
		}
		else {
			int indexCount =0;
			Node temp = head;
			Node newnode = new Node(data);
			while(indexCount != index && temp != null) {
				indexCount++;
				temp = temp.next;
			}
			if(temp == null) {
				System.out.println("index is not present in the list");
			}
			else {
				newnode.next = temp.next;
				temp.next = newnode;
				newnode.prev = temp;
			}
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ "  ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		 DoublyLinkedList ob = new DoublyLinkedList();
		 ob.append(2);
		 ob.append(3);
		 ob.append(4);
		 ob.append(6);
		 ob.printList();
		 ob.push(1);
		 ob.push(0);
		 System.out.println("Linked List after pushing is :- ");
		 ob.printList();
		 ob.insertAfter(5 , 4);
		 System.out.println("Linked List after Inserting is -: ");
		 ob.printList();
		 ob.insertAfterIndex(15 , 0);
		 ob.insertAfterIndex(25, 3);
		 ob.insertAfterIndex(65, 8);
		 ob.insertAfterIndex(79, 10);
		 ob.printList();

}

}
