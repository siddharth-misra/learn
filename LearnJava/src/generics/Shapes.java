package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Shapes {

	public static void main(String[] args) {

		List<Rectangle> rectangle = new ArrayList<Rectangle>();
		rectangle.add(new Rectangle());
		rectangle.add(new Rectangle());

		List<Circle> circle = new ArrayList<Circle>();
		circle.add(new Circle());
		circle.add(new Circle());

		List<? extends Shapes> shapes = new ArrayList<Shapes>();
		// in this list we cannot add a circle or object...we can pass either circle or
		// rectangle only

		// shapes.addAll(circle); //compile time error
		// shapes.addAll(rectangle); //compile time error

		// shapes.add(new Rectangle()); //compile time error
		// shapes.add(new Circle()); //compile time error
		
		addShapes(shapes);
		addShapes(circle);
		addShapes(rectangle);

		List<? extends Shapes> shapes_rec = new ArrayList<Rectangle>();
		List<? extends Shapes> shapes_cirlce = new ArrayList<Circle>();

		// shapes_rec.addAll(rectangle); // compile time error
		// shapes_rec.add(new Rectangle()); // compile time error

		// shapes_cirlce.addAll(circle); // compile time error
		// shapes_cirlce.add(new Circle()); // compile time error

		
		
		addShapes(shapes_rec);
		addShapes(shapes_cirlce);

	}

	public static void addShapes(List<? extends Shapes> shapes) {

	}
	
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}

}

class Rectangle extends Shapes {

}

class Circle extends Shapes {

}