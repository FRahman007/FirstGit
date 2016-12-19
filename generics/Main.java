package generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGenericClass<String> S = new SimpleGenericClass<String>();
		S.setObj("This is a generics class!!!");
		System.out.println(S.getObj());
		
		SimpleGenericClass<Integer> S2 = new SimpleGenericClass<Integer>();
		S2.setObj(93);
		System.out.println(S2.getObj());
		
		//Non-generic Class...
		NonGenericStack nonGenericStack = new NonGenericStack();
		nonGenericStack.push("sdnj");
		nonGenericStack.push("xsdf");
		nonGenericStack.push(4);
		
		System.out.println(nonGenericStack.pop());
		System.out.println(nonGenericStack.pop());
		
		//Generic Class...
		GenericStack<String> genericStack = new GenericStack<>();
		GenericStack<Integer> genericStack2 = new GenericStack<>();
		
		genericStack.push("Foul");
		genericStack.push("4re");
		
		System.out.println(genericStack.pop());
	}

}
