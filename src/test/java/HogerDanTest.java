import org.junit.Test;

import static org.junit.Assert.*;

public class HogerDanTest {
   @Test
    public void whenAGetalIsHogerThenTien(){
       int getal = 11;
       String uitkomst = HogerDan.hogerDanTien(getal);

       assertEquals("Dit is hoger dan 10!", uitkomst);
   }

   @Test
    public void whenAGetalIsLagerThenTien(){
       int getal = 10;
       String uitkomst = HogerDan.hogerDanTien(getal);

       assertEquals("Dit is niet hoger dan 10.", uitkomst);
   }
}