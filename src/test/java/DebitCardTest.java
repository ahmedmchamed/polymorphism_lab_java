import Cards.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(11223344, "01/01/2023", 111, 001122, 1234567);
    }

    @Test
    public void canGetSortCode() {
        assertEquals(001122, debitCard.getSortCode());
    }

    @Test
    public void canGetAccountNumber() {
        assertEquals(1234567, debitCard.getAccountNumber());
    }

    @Test
    public void canGetTransactionCost() {
        assertEquals(10, debitCard.getTransactionCost(1000), 0.01);
    }

}
