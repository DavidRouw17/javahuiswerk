package LabsEnHwOpdrachten.lab5;

import org.junit.Assert;
import org.junit.Test;

public class Lab5Test {
    @Test
    public void testGreatestFor5IsGreaterThen4() {
        //given
        int v1 = 5;
        int v2 = 4;
        //when
        Lab5 testing = new Lab5();
        int result = testing.greatest(v1, v2);
        //then
        Assert.assertEquals(v1, result);
    }

    @Test
    public void testGreatestForMin4IsSmallerThenMin1() {
        //given
        int v1 = -4;
        int v2 = -1;
        //when
        Lab5 testing = new Lab5();
        int result = testing.greatest(v1, v2);
        //then
        Assert.assertEquals(v2, result);
    }

    @Test
    public void testGreatestForStringValue() {
        //given
        String v1 = "betalen";
        String v2 = "pannenkoek";
        //when
        Lab5 testing = new Lab5();
        String result = testing.greatest(v1, v2);
        //then
        Assert.assertEquals(v2, result);
    }

    @Test
    public void testGreatestForStringValuesOfSameLength() {
        //given
        String v1 = "betalen";
        String v2 = "bavaria";
        //when
        Lab5 testing = new Lab5();
        String result = testing.greatest(v1, v2);
        //then
        Assert.assertEquals(v2, result);
    }

    @Test
    public void testGreatestFromListOfIntegers() {
        //given
        int[] list = {3, 4, 1, 6, 3, -3};
        //when
        Lab5 testing = new Lab5();
        int result = testing.greatest(list);
        //then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testGreatestFromListOfNegativeIntegers() {
        //given
        int[] list = {-3, -4, -1, -6, -3, -3};
        //when
        Lab5 testing = new Lab5();
        int result = testing.greatest(list);
        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testFactorialForDifferentValues() {
        //given
        int fac1 = 4;
        int fac2 = 5;
        int fac3 = 1;
        //when
        Lab5 testing = new Lab5();
        int result1 = testing.factorial(fac1);
        int result2 = testing.factorial(fac2);
        int result3 = testing.factorial(fac3);
        //then
        Assert.assertEquals(24, result1);
        Assert.assertEquals(120, result2);
        Assert.assertEquals(1, result3);
    }
}