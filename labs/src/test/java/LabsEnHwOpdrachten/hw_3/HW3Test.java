package LabsEnHwOpdrachten.hw_3;

import LabsEnHwOpdrachten.hw3.HW3;
import org.junit.Test;

import static org.junit.Assert.*;

public class HW3Test {



    @Test
    public void hw3_4() {
    int tijdNu = 23;
    int urenLater = 80;

    int[] resultaat = HW3.hw3_4(tijdNu, urenLater);
    int dagen = resultaat[0];
    int tijd = resultaat[1];
    assertEquals(4, dagen); //dagentest
    assertEquals(7, tijd); //tijdstiptest

    }


}