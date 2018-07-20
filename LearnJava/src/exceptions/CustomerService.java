package exceptions;

public class CustomerService {

	public Customer checkAgeLimit(int age) throws AgeLimitException {

		if (age < 18) {
			throw new AgeLimitException("Age below 18.Not allowed");
		}

		return new Customer(age);

	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();

		Customer cus = obj.checkAgeLimit(17);

	}
}


