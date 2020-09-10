package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        bankNumberGetter();
    }
    /*
    Voor het verkrijgen van een lijst van de bankrekeningnummers (lijst van 9 integers) om later mee te testen.
     */
    public static ArrayList<Integer> bankNumberGetter(){
        ArrayList<Integer> bankAccountNumberList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Bankaccount to check: ");
        String bankAccount = in.nextLine();
        if (bankAccount.length() != 9){
            System.out.println("Only works with 9 digits..");
        }
        else {
            for (int i = 0; i < 9; i++){
                bankAccountNumberList.add((int) bankAccount.charAt(i));
            }

        }
        return bankAccountNumberList;
    }

}
