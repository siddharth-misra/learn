package constructors;

public class PrivateConstructor {

	private String s;

	// Method 1 - Eager Instantiation
	private static final PrivateConstructor instance = new PrivateConstructor();

	private static PrivateConstructor obj = null;

	// Method 2 - using static
	static {
		getInstance();
	}

	// Method 3- using instance method
	public static PrivateConstructor getInstance() {
		if (getObj() == null) {
			synchronized (PrivateConstructor.class) {
				if (getObj() == null) {
					setObj(new PrivateConstructor());
				}
			}
		}
		return getObj();
	}

	// Method 4 - Bill Pugh Singleton Implementation
	private static class SingletonHelper {
		private static final PrivateConstructor INSTANCE = new PrivateConstructor();
	}

	public static PrivateConstructor getInstance_BillPugh() {
		return SingletonHelper.INSTANCE;
	}

	public enum EnumSingleton {
		INSTANCE;

		public static void doSomething() {
		}
	}

	//------------
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public static PrivateConstructor getObj() {
		return obj;
	}

	public static void setObj(PrivateConstructor obj) {
		PrivateConstructor.obj = obj;
	}

}

// Another class can create only 1 object of Private constructor class called
// as singleton class
class Test {

	public static void main(String[] args) {

		PrivateConstructor ob1 = PrivateConstructor.getInstance();

		ob1.setS("String 1");

		PrivateConstructor ob2 = PrivateConstructor.getInstance();

		ob2.setS("String 2");

		System.out.println("Object 1 string : " + ob1.getS());
		System.out.println("Object 2 string : " + ob2.getS());

	}
}
