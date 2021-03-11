package lab6.Before.bank_application.src.test.bonus;

import lab6.Before.bank_application.src.main.bank.*;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditOfferArgumentConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) {
        assertEquals( String.class, source.getClass(), "Can only convert from String" );
        assertEquals( CreditOffer.class, targetType, "Can only convert to CreditOffer" );

        String[] creditOfferString = source.toString().split( ";" );
        CreditOffer creditOffer = null;

        switch (creditOfferString[1].toLowerCase().trim()) {
            case "b":
                creditOffer = new BusinessCreditOffer( creditOfferString[0] );
                break;
            case "p":
                creditOffer = new PremiumCreditOffer( creditOfferString[0] );
                break;
            case "e":
                creditOffer = new EconomyCreditOffer( creditOfferString[0] );
                break;
        }

        creditOffer.addCustomer( new Customer( creditOfferString[2].trim(), Boolean.valueOf( creditOfferString[3].trim() ) ) );
        creditOffer.setAmount( Integer.valueOf( creditOfferString[4].trim() ) );

        return creditOffer;
    }
}
