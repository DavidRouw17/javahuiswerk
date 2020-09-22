package LabsEnHwOpdrachten.hw10ChainStore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {
    private static CardDatabase db;
    @Before
    public void setUp() throws Exception {
        db = new CardDatabase();
        Application.dbFiller(db);
    }

    @Test
    public void testIfPayingWorks(){
        Card kaart = db.getCard(2);
        kaart.pay(500);
        double expected = 500;

        assertEquals(expected, kaart.getCredit(), 0.0);
    }
}