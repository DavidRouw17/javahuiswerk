package tddvoorbeeld;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class TestStringAdder {

    @Test
    public void whenAddIsCalledWithEmptyStringItShouldReturnZero(){
        //given
        StringAdder sa = new StringAdder();
        //when
        int result = sa.add("");
        //then
        assertEquals(0, result);
    }

    @Test
    public void whenAddIsCalledWithOneNumberShouldReturnNumber(){
        StringAdder sa = new StringAdder();

        int result = sa.add("5");

        assertEquals(5, result);
    }

    @Test
    public void whenAddIsCalledWithTwoNumbersItShouldReturnTheSum(){
        StringAdder sa = new StringAdder();

        int result = sa.add("5,6");

        assertEquals(11, result);
    }

    @Test
    public void whenAddIsCalledWithMoreThanTwoNumbersTheyAreAddedUp(){
        StringAdder sa = new StringAdder();

        int result = sa.add("2,3,9");

        assertEquals(14, result);
    }

    @Test
    public void whenAddIsCalledWithNewlineAsDelimiterAreAddedUp(){
        StringAdder sa = new StringAdder();

        int result = sa.add("2\n3,9");

        assertEquals(14, result);
    }

    @Test
    public void whenAddIsCalledWithOtherDelimiterAsDelimiterAreAddedUp(){
        StringAdder sa = new StringAdder();

        int result = sa.add("2@3#9_8");

        assertEquals(22, result);
    }

    @Test
    public void whenAddContainsNegativeNumberExceptionMustBeThrown(){
        StringAdder sa = new StringAdder();

        Assertions.assertThrows(NegativeNumberException.class, () -> {
            sa.add("2@3#-9_8");
        });
        }


    }



