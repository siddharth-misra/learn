package reflection;

public class ReflectionTest {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub
		
		Test.class.getMethod("method1").setAccessible(true);

	}

}

class Test {

	private String s;

	private Test() {
		System.out.println("private constructor");
	}

	Test(int a) {
		System.out.println("private constructor");
	}

	void method1() {
		System.out.println("Method 1");
	}

	private void method2() {
		System.out.println("Method 2");
	}

	private void method3(int a) {
		System.out.println("Method 3 = " + a);
	}

}
