package objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class FiveMethodToCreateInstance implements Cloneable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Method1 : New keyword
		SimpleClass sc1 = new SimpleClass();

		// Method 2: newInstance() method
		SimpleClass sc2 = (SimpleClass) Class.forName("SimpleClass").newInstance();

		//Class.forName("SimpleClass").getConstructors().setAccessible(true);
		
		// Method 3 - Reflection API
		Constructor<SimpleClass> c = SimpleClass.class.getConstructor();
		SimpleClass sc3 = c.newInstance();

		// Method 4 - Cloaning
		//SimpleClass sc4 = (SimpleClass) sc1.clone();

		// Method 5 - deserialize an object
		// Serialization
		String filename = "file.ser";
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(sc1);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		SimpleClass object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (SimpleClass) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

}

class SimpleClass implements Cloneable {

}