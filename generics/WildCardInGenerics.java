package generics;

import java.awt.List;
import java.util.ArrayList;

public abstract class WildCardInGenerics {
	
	abstract void draw(double a, double b);
}
class Triangle extends WildCardInGenerics {
	
	double area;
	@Override
	void draw(double a, double b) {
		// TODO Auto-generated method stub
		area = .5 * a * b;
		System.out.println("Triangle's area : " + area);
	}
}

class Rectangle extends WildCardInGenerics {
	
	double area;
	@Override
	void draw(double a, double b) {
		// TODO Auto-generated method stub
		area = a * b;
		System.out.println("Rectangle's area : " + area);
	}
	
}

class GenericsTest { 
	
	public static void drawShapes(List <? extends WildCardInGenerics> lists) {
		for(WildCardInGenerics w : lists) {
			w.draw(5.5, 8.2);
		}
	}
	
	public static void main(String[] args) {
		List<Triangle> T = new ArrayList<Triangle>();
		T.add(new Triangle());
		
	}
}
