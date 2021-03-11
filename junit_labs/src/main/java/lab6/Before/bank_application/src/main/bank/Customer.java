package lab6.Before.bank_application.src.main.bank;

import java.util.Objects;

public class Customer {

	private String name;
	private boolean vip;

	public Customer(String name, boolean vip) {
		this.name = name;
		this.vip = vip;
	}

	public String getName() {
		return name;
	}

	public boolean isVip() {
		return vip;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		Customer customer = (Customer) o;
		return Objects.equals( name, customer.name );
	}

	@Override
	public int hashCode() {

		return Objects.hash( name );
	}

}
