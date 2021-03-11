package lab5.Before.bank_application.src.test.bank;

import lab5.Before.bank_application.src.main.bank.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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
                assertAll( "Verify all conditions for a usual customer and an economy credit offer",
                        () -> assertEquals( "1", economyCreditOffer.getId() ),
                        () -> assertEquals( true, economyCreditOffer.addCustomer( mike ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( economyCreditOffer.getCustomersSet().contains( mike ) ),
                        () -> assertEquals( true, economyCreditOffer.removeCustomer( mike ) ),
                        () -> assertEquals( 0, economyCreditOffer.getCustomersSet().size() )
                );
            }

            @DisplayName("Then you cannot add him to an economy credit offer more than once")
            @RepeatedTest(5)
            public void testEconomyCreditOfferUsualCustomerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    economyCreditOffer.addCustomer( mike );
                }
                assertAll( "Verify a usual customer can be added to an economy credit offer only once",
                        () -> assertEquals( 1, economyCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( economyCreditOffer.getCustomersSet().contains( mike ) ),
                        () -> assertTrue( new ArrayList<>( economyCreditOffer.getCustomersSet() ).get( 0 ).getName().equals( "Mike" ) )
                );
            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him but cannot remove him from an economy credit offer")
            public void testEconomyCreditOfferVipCustomer() {
                assertAll( "Verify all conditions for a VIP customer and an economy credit offer",
                        () -> assertEquals( "1", economyCreditOffer.getId() ),
                        () -> assertEquals( true, economyCreditOffer.addCustomer( john ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( economyCreditOffer.getCustomersSet().contains( john ) ),
                        () -> assertEquals( false, economyCreditOffer.removeCustomer( john ) ),
                        () -> assertEquals( 1, economyCreditOffer.getCustomersSet().size() )
                );
            }

            @DisplayName("Then you cannot add him to an economy credit offer more than once")
            @RepeatedTest(5)
            public void testEconomyCreditOfferVipCustomerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    economyCreditOffer.addCustomer( john );
                }
                assertAll( "Verify a VIP customer can be added to an economy credit offer only once",
                        () -> assertEquals( 1, economyCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( economyCreditOffer.getCustomersSet().contains( john ) ),
                        () -> assertTrue( new ArrayList<>( economyCreditOffer.getCustomersSet() ).get( 0 ).getName().equals( "John" ) )
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
                assertAll( "Verify all conditions for a usual customer and a business credit offer",
                        () -> assertEquals( false, businessCreditOffer.addCustomer( mike ) ),
                        () -> assertEquals( 0, businessCreditOffer.getCustomersSet().size() ),
                        () -> assertEquals( false, businessCreditOffer.removeCustomer( mike ) ),
                        () -> assertEquals( 0, businessCreditOffer.getCustomersSet().size() )
                );

            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him but cannot remove him from a business credit offer")
            public void testBusinessCreditOfferVipCustomer() {
                assertAll( "Verify all conditions for a VIP customer and a business credit offer",
                        () -> assertEquals( true, businessCreditOffer.addCustomer( john ) ),
                        () -> assertEquals( 1, businessCreditOffer.getCustomersSet().size() ),
                        () -> assertEquals( false, businessCreditOffer.removeCustomer( john ) ),
                        () -> assertEquals( 1, businessCreditOffer.getCustomersSet().size() )
                );

            }

            @DisplayName("Then you cannot add him to a business credit offer more than once")
            @RepeatedTest(5)
            public void testBusinessCreditOfferVipCustomerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    businessCreditOffer.addCustomer( john );
                }
                assertAll( "Verify a VIP customer can be added to a business credit offer only once",
                        () -> assertEquals( 1, businessCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( businessCreditOffer.getCustomersSet().contains( john ) ),
                        () -> assertTrue( new ArrayList<>( businessCreditOffer.getCustomersSet() ).get( 0 ).getName().equals( "John" ) )
                );
            }
        }
    }

    @DisplayName("Given there is a premium credit offer")
    @Nested
    class PremiumCreditOfferTest {
        private CreditOffer premiumCreditOffer;
        private Customer mike;
        private Customer john;

        @BeforeEach
        void setUp() {
            premiumCreditOffer = new PremiumCreditOffer( "3" );
            mike = new Customer( "Mike", false );
            john = new Customer( "John", true );
        }

        @Nested
        @DisplayName("When we have a usual customer")
        class UsualCustomer {

            @Test
            @DisplayName("Then you cannot add or remove him from a premium credit offer")
            public void testPremiumCreditOfferUsualCustomer() {
                assertAll( "Verify all conditions for a usual customer and a premium credit offer",
                        () -> assertEquals( false, premiumCreditOffer.addCustomer( mike ) ),
                        () -> assertEquals( 0, premiumCreditOffer.getCustomersSet().size() ),
                        () -> assertEquals( false, premiumCreditOffer.removeCustomer( mike ) ),
                        () -> assertEquals( 0, premiumCreditOffer.getCustomersSet().size() )
                );
            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {

            @Test
            @DisplayName("Then you can add and remove him from a premium credit offer")
            public void testPremiumCreditOfferVipCustomer() {
                assertAll( "Verify all conditions for a VIP customer and a premium credit offer",
                        () -> assertEquals( true, premiumCreditOffer.addCustomer( john ) ),
                        () -> assertEquals( 1, premiumCreditOffer.getCustomersSet().size() ),
                        () -> assertEquals( true, premiumCreditOffer.removeCustomer( john ) ),
                        () -> assertEquals( 0, premiumCreditOffer.getCustomersSet().size() )
                );
            }

            @DisplayName("Then you cannot add him to a premium credit offer more than once")
            @RepeatedTest(5)
            public void testPremiumCreditOfferVipCustomerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    premiumCreditOffer.addCustomer( john );
                }
                assertAll( "Verify a VIP customer can be added to a premium credit offer only once",
                        () -> assertEquals( 1, premiumCreditOffer.getCustomersSet().size() ),
                        () -> assertTrue( premiumCreditOffer.getCustomersSet().contains( john ) ),
                        () -> assertTrue( new ArrayList<>( premiumCreditOffer.getCustomersSet() ).get( 0 ).getName().equals( "John" ) )
                );
            }
        }

    }

}
