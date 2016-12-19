package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> S = new HashMap<>();
		
		//Inserting values
		S.put(1, "Alex");
		S.put(2, "Jhon");
		S.put(3, "Mia");
		S.put(4, "Daniel");
		S.put(5, "Rose");
		
		System.out.println("Size of the map is : " + S.size());
		S.remove(3);
		System.out.println("Size of the map is : " + S.size());

		System.out.println("What is after Daniel : " + S.get(4));
		
		System.out.println("Elements of the map is : " + S.values());
		
		//Justifying keys and values.........
		System.out.println("Justify : "+ S.containsKey(1));
		System.out.println("Justify : "+ S.containsValue("Rose"));
	}

}
