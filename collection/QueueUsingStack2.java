package collection;

import java.util.Stack;

//this method is using dequeue method to implement stack
public class QueueUsingStack2 {

	static class Queue {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack();

		public void enqueue(int data) {
			stack1.push(data);

		}

		public void dequeue() {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			if (stack2.isEmpty()) {
				System.out.println("queue is empty");
			} else {
				int x = stack2.peek();
				stack2.pop();
				System.out.println(x);
			}

		}
	}

	public static void main(String[] args) {
		Queue ob = new Queue();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);

		ob.dequeue();
		ob.dequeue();

	}

}
