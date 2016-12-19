package collections;

import java.util.ArrayList;

public class ArraylistsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(84);
		grades.add(75);
		
		for(int i = 0;i < grades.size();i++) {
			System.out.printf("Grades #%d = %d\n", i, grades.get(i));
		}
		
		grades.remove(1);
	}

}
