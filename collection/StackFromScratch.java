package collection;

public class StackFromScratch {
	
	int top = -1;
	int size = 7;
	int stack[] = new int[size];
	
	public boolean isEmpty() {
		if(top==-1) 
			return true;
		
		else
			return false;
		
	}
	
	public boolean isFull() {
		if(top==size) {
			return true;
		}
		else
			return false;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else {
			stack[++top] = data;
			System.out.println(data+ " entered in stack");
		}
	}
	
	public void  pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
			
			System.out.println(stack[top]+ " deleted from stack");
			top = top-1;
		}
		
	}
	
	public int top() {
		return stack[top];
		
	}
	
	public void print() {
		System.out.println("Elements in stack are :-");
		for(int i=top;i>=0;i--) {
		System.out.print(stack[i]+  " ");
		}
	}
	
	public static void main(String args[]) {
		StackFromScratch ob = new StackFromScratch();
		ob.push(11);
		ob.push(12);
		ob.push(13);
		ob.print();
		ob.pop();
		ob.print();
		
	}
}



