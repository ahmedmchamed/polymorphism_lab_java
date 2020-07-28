import Cards.CreditCard;
import Cards.PaymentCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentCardTest {

    private PaymentCard card;

    @Before
    public void before() {
        card = new CreditCard(11223344, "01/01/2022", 000, 2000);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals(11223344, card.getCardNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("01/01/2022", card.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(000, card.getSecurityNumber());
    }

    @Test
    public void canAddToListOfCharges() {
        card.charge(200);
        assertEquals(1, card.getCharges().size());
        assertEquals(200, card.getCharges().get(0), 0.01);
    }



}
