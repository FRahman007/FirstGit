package generics;

public class NonGenericStack {

	private Object[] elements;
	private int size = 0;
	private static final int capacity = 10;
	public NonGenericStack() {
		elements = new Object[capacity];
	}
	
	public void push(Object ob) {
		elements[size] = ob;
		size++;
	}
	
	public Object pop() {
		if(size<=0) {
			return null;
		}
		size--;
		return elements[size];
	}
}
