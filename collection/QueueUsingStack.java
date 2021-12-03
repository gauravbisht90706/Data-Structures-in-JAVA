package collection;

import java.util.Stack;

public class QueueUsingStack {

	static class Queue {
		public static Stack<Integer> stack1 = new Stack<>();
		public static Stack<Integer> stack2 = new Stack<>();

		public void enqueue(int data) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			stack1.push(data);

			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}

		}

		public int dequeue() {
			if (stack1.isEmpty()) {
				System.out.println("Queue is empty");
				System.exit(0);
			}
			int x = stack1.peek();
			stack1.pop();
			return x;

		}
	}

	public static void main(String[] args) {
		Queue ob = new Queue();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);

		System.out.println(ob.dequeue());
		System.out.println(ob.dequeue());

	}
}
