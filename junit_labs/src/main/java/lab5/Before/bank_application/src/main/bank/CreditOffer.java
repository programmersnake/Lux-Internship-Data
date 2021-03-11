package lab5.Before.bank_application.src.main.bank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class CreditOffer {

	Set<Customer> customersSet = new HashSet<Customer>();
	private String id;

	public CreditOffer(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Set<Customer> getCustomersSet() {
		return Collections.unmodifiableSet( customersSet );
	}

	public abstract boolean addCustomer(Customer customer);

	public abstract boolean removeCustomer(Customer customer);

}
