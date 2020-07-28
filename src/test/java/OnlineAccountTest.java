import Cards.CreditCard;
import Cards.DebitCard;
import Cards.GiftCard;
import Retailers.OnlineAccount;
import Retailers.ReportingSoftware;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    private CreditCard creditCard;
    private DebitCard debitCard;
    private GiftCard giftCard;
    private ReportingSoftware reportingSoftware;
    private OnlineAccount onlineAccount;

    @Before
    public void before() {
        creditCard = new CreditCard(99887766, "01/01/2025", 011, 2000);
        debitCard = new DebitCard(55443322, "01/01/2026", 555, 001122, 1234567);
        giftCard = new GiftCard("Tesco", 1000);
        reportingSoftware = new ReportingSoftware();
        onlineAccount = new OnlineAccount("MyRetailer", reportingSoftware);
    }

    @Test
    public void canGetName() {
        assertEquals("MyRetailer", onlineAccount.getName());
    }

    @Test
    public void canChargeCard() {
        onlineAccount.chargeCustomer(creditCard, 1200);
        onlineAccount.chargeCustomer(debitCard, 1300);
        onlineAccount.chargeCustomer(giftCard, 250);

        assertEquals(3, onlineAccount.getPaymentMethods().size());
        assertEquals(800, creditCard.getCreditLimit(), 0.01);
        assertEquals(750, giftCard.getBalance(), 0.01);
    }

}
