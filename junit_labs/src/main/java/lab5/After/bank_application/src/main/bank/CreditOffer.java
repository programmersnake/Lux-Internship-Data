package lab5.After.bank_application.src.main.bank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class CreditOffer {

	Set<Customer> customersSet = new HashSet<Customer>();
	private String id;
	private int amount;

	public CreditOffer(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Set<Customer> getCustomersSet() {
		return Collections.unmodifiableSet( customersSet );
	}

	public abstract boolean addCustomer(Customer customer);

	public abstract boolean removeCustomer(Customer customer);

}
