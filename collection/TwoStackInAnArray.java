package collection;

// this approach has limitation that stack will overflow even if there is space in an array
public class TwoStackInAnArray {
	static int size = 100;
	static int stack[] = new int[size];

	public static class Stack {
		int top1 = -1;
		int top2 = (size / 2) - 1;

		public void push1(int data) {
			if (top1 + 1 == size / 2) {
				System.out.println("stack 1 Overflow");
			} else {
				top1 = top1 + 1;
				stack[top1] = data;

			}
		}

		public void push2(int data) {
			if (top2 + 1 == size) {
				System.out.println("Stack 2 is overflow");
			}

			else {
				top2 = top2 + 1;
				stack[top2] = data;
			}
		}

		public void pop1() {
			if (top1 == -1) {
				System.out.println("stack 1 is empty");
			} else {
				System.out.println(stack[top1] + " is removed");
				top1 = top1 - 1;

			}
		}

		public void pop2() {
			if (top2 == (size / 2) - 1) {
				System.out.println("stack 2 is empty");
			} else {
				System.out.println(stack[top2] + " is removed");
				top2 = top2 - 1;
			}
		}

		public void printStack1() {
			if (top1 == -1) {
				System.out.println("Stack  1 Underflow");
			} else {
				int i = top1;
				System.out.println("stack1 is :- ");
				while (i >= 0) {
					System.out.println(stack[i]);
					i--;
				}
			}
		}

		public void printStack2() {
			if (top2 == (size / 2) - 1) {
				System.out.println("stack 2 underflow");
			} else {
				int i = top2;
				System.out.println("stack 2 is :- ");
				while (i >= size / 2) {
					System.out.println(stack[i] + "  ");
					i--;
				}
			}
		}
	}

	public static void main(String args[]) {
		Stack ob = new Stack();
		ob.push1(1);
		ob.push1(2);
		ob.push1(3);
		ob.push2(10);
		ob.push2(20);
		ob.push2(30);
		ob.printStack1();
		ob.printStack2();
		ob.pop1();
		ob.pop2();
		ob.printStack1();
		ob.printStack2();

	}

}
