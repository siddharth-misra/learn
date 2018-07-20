package exceptions;

public class CustomerService2 {

	public Customer checkNullName(String name) throws NameNotNullException {

		if (name.equals("")) {
			throw new NameNotNullException("Empty Name.Not allowed");
		}

		return new Customer(name);

	}

	public static void main(String[] args) {

		CustomerService2 obj = new CustomerService2();

		try {
			Customer cus = obj.checkNullName("");
		} catch (NameNotNullException e) {
			e.printStackTrace();
		}

	}
}
