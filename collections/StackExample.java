package collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Last in First out method
		/*
		 * 
		 * |-----------
		 * |-----------
		 * 
		 */
		Stack<Integer> stack = new Stack<>();
		
		//inserting elements in the stack
		stack.push(5);
		stack.push(2);
		stack.push(8);
		stack.push(3);
		stack.push(7);
		stack.push(9);
		
		System.out.println("Size of the Stack is : " + stack.size());
		System.out.println("Elements in the Stack : " + stack);
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Empty stack");
		} finally {
			System.out.println("Size of the Stack is : " + stack.size());
			System.out.println("Elements in the Stack : " + stack);
		}
		
		System.out.println("Does Stack contain 5 : " + stack.search(1));
		
		System.out.println("Size of the is Stack : "+ stack.empty());
		stack.pop();
		
		System.out.println("Elements in the Stack : " + stack);
	}

}
