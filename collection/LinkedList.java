package collection;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void insert(LinkedList list, int data) {

		Node newnode = new Node(data);
		newnode.next = null;

		if (list.head == null) {
			list.head = newnode;

		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newnode;
		}
		
	}

	public LinkedList remove(LinkedList list, int key) {
		Node temp = list.head;
		Node prev = list.head;

		if (temp.data == key) {
			System.out.println(key + " deleted");
			list.head = temp.next;
			return list;
		} else {
			while (temp != null && temp.data != key) {
				prev.next = temp.next;
				temp = temp.next;
			}

			if (temp != null) {
				prev.next = temp.next;
				System.out.println(key + " deleted");

			}
			if (temp == null) {
				System.out.println(key + " not found in the list");
			}

		}
		return list;

	}

	public static void print(LinkedList list) {
		Node temp = list.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.print(list);
		list.remove(list, 2);
		list.print(list);
		
		
		

	}

}
