package LabsEnHwOpdrachten.hw10ChainStore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    private static CardDatabase db;

    @Before
    public void setUp() throws Exception {
        db = new CardDatabase();
        Application.dbFiller(db);
    }

    @Test
    public void testIfPayingWorks() {
        Card kaart = db.getCard(2);
        kaart.pay(500);
        double expected = 500;

        assertEquals(expected, kaart.getCredit(), 0.0);
    }

    @Test
    public void testIfRegularCardsCreditCantGetUnderZero() {
        Card kaart = db.getCard(8);
        kaart.pay(500);
        double expected = 5;

        assertEquals(expected, kaart.getCredit(), 0.0);
    }
    @Test
    public void testIfDiscountWorksProperlyOnGoldCards(){
        Card kaart = db.getCard(10);
        kaart.pay(1000);
        double expected = 6100;

        assertEquals(expected, kaart.getCredit(), 0.0);
    }

    @Test
    public void testIfGoldCardCreditCanGetUnderZero(){
        Card kaart = db.getCard(10);
        kaart.pay(10000);
        double expected = -2000;

        assertEquals(expected, kaart.getCredit(), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testIfDiscountCantBeMoreThen30(){
        GoldCard kaart = (GoldCard) db.getCard(1);
        kaart.setDiscount(31);

    }

    @Test(expected = OutOfRangeException.class)
    public void testIfDiscountCantBeLessThen0(){
        GoldCard kaart = (GoldCard) db.getCard(1);
        kaart.setDiscount(-1);

    }
}