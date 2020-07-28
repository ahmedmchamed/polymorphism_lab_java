import Cards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(11223344, "03/08/2023", 111, 2000);
    }

    @Test
    public void canReduceCreditLimit() {
        creditCard.charge(750);
        assertEquals(1250, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canGetTransactionCost() {
        assertEquals(10, creditCard.getTransactionCost(500), 0.01);
    }

}