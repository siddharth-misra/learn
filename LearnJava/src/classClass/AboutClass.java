package classClass;

public class AboutClass {

	public static void main(String[] args) {

		AboutClass obj=new AboutClass();
		obj.printClassName(obj);
		
		System.out.println("The name of class Class is: "+Class.class.getName());
		
	}

	void printClassName(Object obj) {
		System.out.println("The class of " + obj + " is " + obj.getClass().getName());
		
	}
	
	

}
