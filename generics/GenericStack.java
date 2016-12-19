package generics;

public class GenericStack <F> {

		private F[] elements;
		private int size = 0;
		private static final int capacity = 10;
		public GenericStack() {
			elements = (F[])new Object[capacity];
		}
		
		public void push(F ob) {
			elements[size] = ob;
			size++;
		}
		
		public F pop() {
			if(size<=0) {
				return null;
			}
			size--;
			return elements[size];
		}
	}
