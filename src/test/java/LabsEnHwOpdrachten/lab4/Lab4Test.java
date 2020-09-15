package LabsEnHwOpdrachten.lab4;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Lab4Test {

    @Test
    public void testWhenBankAccountPassesElevenTest() {
        //given
        ArrayList<Integer> bankAccount = new ArrayList<Integer>();
        for (int i = 1; i <=9; i++){
            bankAccount.add(i);
        }
        //when
        String result = Lab4.bankNumberValidator(bankAccount);
        String expected = "Probably a real bank account.";
        //then
        assertEquals(expected, result);
    }

    @Test
    public void testWhenBankAccountDoesNotPassElevenTest() {
        //given
        ArrayList<Integer> bankAccount = new ArrayList<Integer>();
        for (int i = 1; i <=8; i++){
            bankAccount.add(i);
        }
        bankAccount.add(8);
        //when
        String result = Lab4.bankNumberValidator(bankAccount);
        String expected = "Probably not a real bank account.";
        //then
        assertEquals(expected, result);
    }
}