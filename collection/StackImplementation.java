package collection;

import java.util.*;
public class StackImplementation {
	Scanner s  = new Scanner(System.in);
	int n;
	public void stack_push(Stack stack) {
		System.out.println("enter the number of element you want to insert in the stack");
		int num = this.n;
		num = s.nextInt();
		System.out.println("enter the element in the stack");
		for(int i=0;i<num;i++) {
			stack.push(s.nextInt());
			}
		
		
	}
	
	public void print(Stack stack) {
		System.out.println(stack);
	}
	
	public void top(Stack stack) {
		System.out.println(stack.peek());
	}
	
	public void popStack(Stack stack) {
		System.out.println(stack.pop()+ " popped from the stack");
	}
	
	


	public static void main(String[] args) {
		
		Stack stack = new Stack();
		StackImplementation obj = new StackImplementation();
		obj.stack_push(stack);
		obj.print(stack);
		obj.top(stack);
		obj.popStack(stack);
		System.out.println("Stack after popping element");
		obj.print(stack);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		

	}

}

