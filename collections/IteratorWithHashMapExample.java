package collections;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorWithHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Bannana");
		map.put(2, "Orange");
		map.put(3, "Guava");
		map.put(4, "Lemon");
		map.put(4, "Mango");
		
		//Geta set of the entries
		Set set = map.entrySet();
		
		//Get an Iterator
		Iterator iterator = set.iterator();
		//display the items in the map
		while(iterator.hasNext()) {
			Map.Entry mEntry = (Map.Entry)iterator.next();
			System.out.println(mEntry.getKey() + " " + mEntry.getValue());
		}
	}

}
