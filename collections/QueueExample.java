package collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(4);
		queue.add(8);
		queue.add(9);
		queue.add(7);
		queue.add(1);
		
		System.out.println("Elements in the Queue : " + queue);
		try {
			queue.remove();
		} catch(NoSuchElementException e) {
			System.out.println("Empty Queue");
		} finally {
			System.out.println("Elements in the Queue : " + queue);
			// TODO: handle finally clause
		}
		System.out.println("At location '0' : " + queue.peek());
		
	}

}
