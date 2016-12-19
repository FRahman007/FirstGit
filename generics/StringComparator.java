package generics;

public class StringComparator implements GenericInterface<String> {
	public int comparator(String obj1, String obj2) {
		return obj1.length() - obj2.length();
	}
	public int comparator2(String obj3) {
		return obj3.charAt(0);
	}
}
