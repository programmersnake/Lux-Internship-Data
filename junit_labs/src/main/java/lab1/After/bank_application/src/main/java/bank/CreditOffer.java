package lab1.After.bank_application.src.main.java.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CreditOffer {

    List<Customer> customersList = new ArrayList<Customer>();
    private String id;

    public CreditOffer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Customer> getCustomersList() {
        return Collections.unmodifiableList( customersList );
    }

    public abstract boolean addCustomer(Customer customer);

    public abstract boolean removeCustomer(Customer customer);

}
