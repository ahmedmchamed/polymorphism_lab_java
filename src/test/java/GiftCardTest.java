import Cards.GiftCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard("Tesco", 1000);
    }

    @Test
    public void canGetVendor() {
        assertEquals("Tesco", giftCard.getVendor());
    }

    @Test
    public void canGetBalance() {
        assertEquals(1000, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canReduceBalance() {
        giftCard.charge(500);
        assertEquals(500, giftCard.getBalance(), 0.01);
    }

}
