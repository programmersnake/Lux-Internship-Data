package lab2.After.bank_application.src.test.bank;

import lab2.After.bank_application.src.main.bank.BusinessCreditOffer;
import lab2.After.bank_application.src.main.bank.CreditOffer;
import lab2.After.bank_application.src.main.bank.Customer;
import lab2.After.bank_application.src.main.bank.EconomyCreditOffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {


    @DisplayName("Given there is an economy credit offer")
    @Nested
    class EconomyCreditOfferTest {

        private CreditOffer economyCreditOffer;
        private Customer mike;
        private Customer john;

        @BeforeEach
        void setUp() {
            economyCreditOffer = new EconomyCreditOffer( "1" );
            mike = new Customer( "Mike", false );
            john = new Customer( "John", true );
        }

        @Nested
        @DisplayName("When we have a usual customer")
        class UsualCustomer {
            @Test
            @DisplayName("Then you can add and remove him from an economy credit offer")
            public void testEconomyCreditOfferUsualCustomer() {
                assertAll( "Verify all conditions for a usual passenger and an economy credit offer",
                        () -> assertEquals( "1", economyCreditOffer.getId() ),
                        () -> assertEquals( true, economyCreditOffer.addCustomer( mike ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersList().size() ),
                        () -> assertEquals( "Mike", economyCreditOffer.getCustomersList().get( 0 ).getName() ),
                        () -> assertEquals( true, economyCreditOffer.removeCustomer( mike ) ),
                        () -> assertEquals( 0, economyCreditOffer.getCustomersList().size() )
                );
            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him but cannot remove him from an economy credit offer")
            public void testEconomyCreditOfferVipCustomer() {
                assertAll( "Verify all conditions for a VIP passenger and an economy credit offer",
                        () -> assertEquals( "1", economyCreditOffer.getId() ),
                        () -> assertEquals( true, economyCreditOffer.addCustomer( john ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersList().size() ),
                        () -> assertEquals( "John", economyCreditOffer.getCustomersList().get( 0 ).getName() ),
                        () -> assertEquals( false, economyCreditOffer.removeCustomer( john ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersList().size() )
                );
            }
        }
    }


    @DisplayName("Given there is a business credit offer")
    @Nested
    class BusinessCreditOfferTest {
        private CreditOffer businessCreditOffer;
        private Customer mike;
        private Customer john;

        @BeforeEach
        void setUp() {
            businessCreditOffer = new BusinessCreditOffer( "2" );
            mike = new Customer( "Mike", false );
            john = new Customer( "John", true );
        }

        @Nested
        @DisplayName("When we have a usual customer")
        class UsualCustomer {

            @Test
            @DisplayName("Then you cannot add or remove him from a business credit offer")
            public void testBusinessCreditOfferUsualCustomer() {
                assertAll( "Verify all conditions for a usual passenger and a business credit offer",
                        () -> assertEquals( false, businessCreditOffer.addCustomer( mike ) ),
                        () -> assertEquals( 0, businessCreditOffer.getCustomersList().size() ),
                        () -> assertEquals( false, businessCreditOffer.removeCustomer( mike ) ),
                        () -> assertEquals( 0, businessCreditOffer.getCustomersList().size() )
                );

            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him but cannot remove him from a business credit offer")
            public void testBusinessCreditOfferVipCustomer() {
                assertAll( "Verify all conditions for a VIP passenger and a business credit offer",
                        () -> assertEquals( true, businessCreditOffer.addCustomer( john ) ),
                        () -> assertEquals( 1, businessCreditOffer.getCustomersList().size() ),
                        () -> assertEquals( false, businessCreditOffer.removeCustomer( john ) ),
                        () -> assertEquals( 1, businessCreditOffer.getCustomersList().size() )
                );

            }
        }
    }


}
