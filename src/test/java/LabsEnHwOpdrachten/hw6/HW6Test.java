package LabsEnHwOpdrachten.hw6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HW6Test {

    @Test
    public void op3ArrayDoublesInSize() {
        HW6 h = new HW6();
        //given
        long[] fourDigitArray = new long[4];

        //when
        long[] eightDigitArray = h.op3(fourDigitArray);
        int newLength = eightDigitArray.length;
        //then
        assertEquals(8, newLength);
    }

    @Test
    public void op3NewArrayIsDoubleSizeEndingWithOnlyZeroes() {
        HW6 h = new HW6();
        //given
        long[] threeDigitArray = {1,2,3};
        //when
        long[] newArray = h.op3(threeDigitArray);
        long[] expectedArray = {1,2,3,0,0,0};
        //then
        Assert.assertArrayEquals(expectedArray,newArray);
    }

    @Test
    public void op4NewArrayIsOldArrayMultiplied() {
        HW6 h = new HW6();
        //given
        long[] array = {1,3,2,7,5};
        //when
        h.op4(array, 3);
        long[] expected = {3, 9, 6, 21, 15};
        //then
        Assert.assertArrayEquals(expected, array);
    }
}