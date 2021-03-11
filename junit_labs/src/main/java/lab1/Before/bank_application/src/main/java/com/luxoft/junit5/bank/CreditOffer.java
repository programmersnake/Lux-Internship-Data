package com.luxoft.junit5.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreditOffer {

    private String id;
    private List<Customer> customersList = new ArrayList<Customer>();
    private String creditOfferType;

    public CreditOffer(String id, String creditOfferType) {
        this.id = id;
        this.creditOfferType = creditOfferType;
    }

    public String getId() {
        return id;
    }

    public List<Customer> getCustomersList() {
        return Collections.unmodifiableList( customersList );
    }

    public String getCreditOfferType() {
        return creditOfferType;
    }

    public boolean addCustomer(Customer customer) {
        switch (creditOfferType) {
            case "Economy":
                return customersList.add( customer );
            case "Business":
                if ( customer.isVip() ) {
                    return customersList.add( customer );
                }
                return false;
            default:
                throw new RuntimeException( "Unknown type: " + creditOfferType );
        }

    }

    public boolean removeCustomer(Customer customer) {
        switch (creditOfferType) {
            case "Economy":
                if ( customer.isVip() ) {
                    return customersList.remove( customer );
                }
                return false;
            case "Business":
                return false;
            default:
                throw new RuntimeException( "Unknown type: " + creditOfferType );
        }
    }

}
