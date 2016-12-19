package generics;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterface<String> genericInterface = new StringComparator();
			
		System.out.println(genericInterface.comparator("Ferdaus", "Momin"));
		System.out.println(genericInterface.comparator2("Redflix"));
	}
}
