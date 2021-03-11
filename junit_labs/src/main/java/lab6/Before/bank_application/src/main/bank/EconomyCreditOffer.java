package lab6.Before.bank_application.src.main.bank;

public class EconomyCreditOffer extends CreditOffer {

	public EconomyCreditOffer(String id) {
		super( id );
	}

	@Override
	public boolean addCustomer(Customer customer) {
		return customersSet.add( customer );
	}

	@Override
	public boolean removeCustomer(Customer customer) {
		if ( !customer.isVip() ) {
			return customersSet.remove( customer );
		}
		return false;
	}

}
