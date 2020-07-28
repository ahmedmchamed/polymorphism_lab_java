import Cards.CreditCard;
import Cards.DebitCard;
import Retailers.ReportingSoftware;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {

    private ReportingSoftware reportingSoftware;
    private CreditCard creditCard;
    private DebitCard debitCard;

    @Before
    public void before() {
        reportingSoftware = new ReportingSoftware();
        creditCard = new CreditCard(11223344, "03/08/2024", 111, 2000);
        debitCard = new DebitCard(11223344, "01/01/2025", 111, 221100, 1234567);
    }

    @Test
    public void canAddTransactionCost() {
        double creditCardCost = creditCard.getTransactionCost(1500);
        double debitCardCost = debitCard.getTransactionCost(1000);

        reportingSoftware.addCostToList(creditCardCost);
        reportingSoftware.addCostToList(debitCardCost);

        assertEquals(2, reportingSoftware.getTransactionCostsList().size());
    }


}
