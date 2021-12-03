package collection;

public class Queue {
	
	int rear, front;
	int size = 5;
	int queue[]  = new int[size];
	
	Queue(){
		front = -1;
		rear = -1;
	}
		
	
	public boolean isFull() {
		if(front==0 && rear == size-1)
			return true;
		else
			return false;
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front == -1) {
				front = front+1;
			}
			rear = rear+1;
			queue[rear] = data;
			System.out.println("data inserted " +data);
			
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			if(front==rear) {
				front = -1;
				rear = -1;
				
			}
			else {
				System.out.println("Front of the queue is deleted that is " +queue[front]+ 
						" and new front is updated" );
			                          
				front++;
				
			}
		}
	}
	
	public boolean isEmpty() {
		if(front==-1 && rear ==-1) 
			return true;
		
		else
			return false;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("the front element of the queue is " +queue[front]);
		}
	}
	
	public void size() {
		if(isEmpty()) {
			System.out.println("Size of Queue is 0");
		}
		else {
			int count=0;
			if(front==0 && rear==0) {
				System.out.println("size of queue is 1");
			}
			
			else {
				for(int i=front;i<=rear;i++) {
					count++;
				}
				System.out.println("The size of queue is " +count);
			}
		}
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			
			System.out.println("front of the Queue is " +front);
			for(int i=front;i<=rear;i++) {
				System.out.println(queue[i]);
			}
			System.out.println("End of the queue is " +rear);
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(11);
		q.enQueue(12);
		q.enQueue(13);
		
		q.print();
		q.size();
		q.peek();
		q.dequeue();
		q.peek();
		q.size();

	}

}

