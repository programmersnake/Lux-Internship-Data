package lab6.After.bank_application.src.test.bonus;

import lab6.After.bank_application.src.main.bank.CreditOffer;
import lab6.After.bank_application.src.main.bank.Customer;
import lab6.After.bank_application.src.main.bonus.Bonus;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BonusTest {

    private Bonus bonus;

    @BeforeAll
    void beforeAll() {
        bonus = new Bonus();
    }

    @ParameterizedTest
    @Disabled
    @ValueSource(strings = {"1; e; Mike; false; 30000", "2; b; John; true; 200000", "3; e; Mike; false; 10000", "4; p; John; true; 80000", "5; e; Mike; false; 60000", "6; e; John; true; 90000"})
    void checkGivenPoints(@ConvertWith(CreditOfferArgumentConverter.class) CreditOffer creditOffer) {
        for (Customer customer : creditOffer.getCustomersSet()) {
            bonus.addAmount( customer, creditOffer.getAmount() );
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/credit_offer_information.csv")
    void checkGivenPointsWithCsvInput(@ConvertWith(CreditOfferArgumentConverter.class) CreditOffer creditOffer) {
        for (Customer customer : creditOffer.getCustomersSet()) {
            bonus.addAmount( customer, creditOffer.getAmount() );
        }
    }

    @AfterAll
    void afterAll() {
        bonus.calculateGivenPoints();
        assertEquals( 5000, bonus.getCustomersPointsMap().get( new Customer( "Mike", false ) ).intValue() );
        assertEquals( 37000, bonus.getCustomersPointsMap().get( new Customer( "John", true ) ).intValue() );
        System.out.println( bonus.getCustomersPointsMap() );
    }
}
