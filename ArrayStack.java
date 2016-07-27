package ArrayStack;
import java.util.Arrays;

public class ArrayStack {
		private String[] stackArray;
		private int stackSize;
		private int top = 0;
		
		public ArrayStack(int size) {
			stackSize = size;
			stackArray = new String[size];
		}
		
		public void push(String input){
			if (isFull()) {
				System.out.println("ADD FAILED.");
				System.out.println();
			} else {
				System.out.println("... trying to push on stack [" + top + "] ...");
				stackArray[top] = input;
			}
				
				stackArray[top] = input;
				top++;
				System.out.println(input + " was successfully added.");
				System.out.println();
			}
		
		private void show() {
			for (int i = stackSize; i<10; i--){
				System.out.println("stack[" + i + "] = " + stackArray[i]);
			}
			
		}
		
		private boolean isEmpty(){
			if (stackArray[0] == null){
				System.out.println ("STORAGE is EMPTY.");
				System.out.println();
				return true;
			}
			return false;
		}
		
		private boolean isFull(){
			if (top == stackSize) {
				System.out.println("STORAGE is FULL.");
				return true;
			}
			return false;
		}

		public void pop(){
			if (isEmpty()) {
				System.out.print("POP FAILED.");
				System.out.println();
			} else {
				System.out.println("... trying to pop stack [" + (top+1) + "] ...");
				stackArray[top] = null;
				top --;
				System.out.println(stackArray[top] + " was successfully removed.");
				System.out.println();
			}
		}
		
		public void peek(){
			if (stackArray[top] == stackArray[0]){
				System.out.println("PEEK TOP = " + stackArray[top]);
				System.out.println();
			} else {
				System.out.println("PEEK TOP = " + stackArray[top-1]);
				System.out.println();
			}
		}
		public static void main(String[] args){
		
			ArrayStack theStack = new ArrayStack(10);
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("one");
			theStack.show();
			theStack.peek();
			theStack.push("two");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("three");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("four");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("five");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("six");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("seven");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("eight");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("nine");
			theStack.show();
			theStack.pop();
			theStack.peek();
			theStack.push("ten");
			
			
		}
}
