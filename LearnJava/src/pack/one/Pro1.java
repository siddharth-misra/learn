//Object value and equality

package pack.one;

public class Pro1 {

	public static void main(String[] args) {

		Object ob1 = new Object();

		Object ob2 = new Object();

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));

		System.out.println("ob1.equals(ob2) : " + ob1.equals(ob2));

		ob2 = ob1;

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));

	}

}
