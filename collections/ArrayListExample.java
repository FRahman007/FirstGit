package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> S1 = new ArrayList<>();
		S1.add(new Student("Matt", 3.5));
		S1.add(new Student("John", 3.1));
		S1.add(new Student("Oliver", 2.75));
		S1.add(new Student("Ronan", 4.0));
		
		System.out.println("Name\tGPA\n");
		for(Student s : S1) {
			System.out.printf("%s\n", s);
		}
		
		System.out.println();
		
//		for(int i = 0;i < S1.size();i++) {
//			System.out.printf("%s\n",S1.get(i));
//		}
	}

}
