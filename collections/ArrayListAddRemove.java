package collections;

import java.util.ArrayList;

public class ArrayListAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Size of the list is : " + list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Size of the list now is : " + list.size());
		
		System.out.println("Print the elements in the list : " +list);
		
		System.out.println("Print the first element : " + list.get(0));
		
		list.remove(3);
		System.out.println("Size of the list now is : " +list.size());
		System.out.println("Print the elements in the list : " + list);
		
		
		System.out.println("Justify my command : " + list.contains(30));
		System.out.println("Justify my command : " + list.contains(60));
		list.add(60);
		list.add(70);
		System.out.println("Justify my command : " + list.contains(60));
	}

}
