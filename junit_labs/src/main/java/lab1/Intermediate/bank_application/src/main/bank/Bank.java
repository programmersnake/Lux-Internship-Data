package lab1.Intermediate.bank_application.src.main.bank;

public class Bank {

    public static void main(String[] args) {
        CreditOffer economyCreditOffer = new CreditOffer( "1", "Economy" );
        CreditOffer businessCreditOffer = new CreditOffer( "2", "Business" );

        Customer john = new Customer( "John", true );
        Customer mike = new Customer( "Mike", false );

        businessCreditOffer.addCustomer( john );
        businessCreditOffer.removeCustomer( john );
        businessCreditOffer.addCustomer( mike );
        economyCreditOffer.addCustomer( mike );

        System.out.println( "Business credit offer customers list:" );
        for (Customer customer : businessCreditOffer.getCustomersList()) {
            System.out.println( customer.getName() );
        }

        System.out.println( "Economy credit offer customers list:" );
        for (Customer customer : economyCreditOffer.getCustomersList()) {
            System.out.println( customer.getName() );
        }
    }
}
