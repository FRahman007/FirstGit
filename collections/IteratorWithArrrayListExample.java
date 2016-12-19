package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithArrrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("3");
		list.add("n");
		list.add("t");
		list.add("g");
		
		System.out.print("Size the List is : " +list.size());
		
		//display the list with Iterator
		System.out.print("\nElements in the List :");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(" " + iterator.next());
		}
		System.out.print("\nElements in the List :");
		
		//display the list with For-each
		for(String string : list) {
			System.out.print(" " + string);
		}
	}

}
