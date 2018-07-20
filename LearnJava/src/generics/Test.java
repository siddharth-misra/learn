package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		System.out.println(l1.getClass() == l2.getClass());

		System.out.println(l1.getClass() + " - " + l2.getClass());

		List<String> ls = new ArrayList<String>(); // 1
		// List<Object> lo = ls; // Compile time error

		List<?> list = new ArrayList<String>();

		// list.add("Hello"); // Compile time error
		// list.add(new String("asd")); // Compile time error
		// list.add(new Object()); // Compile time error
		
		list.add(null);
		
		Object o = list.get(0);

	}
}
