package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

       ArrayList<Integer> check = bankNumberGetter();
       bankNumberValidator(check);
    }
    /*
    Voor het verkrijgen van een lijst van de bankrekeningnummers (lijst van 9 integers) om later mee te testen.
     */
    public static ArrayList<Integer> bankNumberGetter(){
        ArrayList<Integer> bankAccountNumberList = new ArrayList<Integer>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Bankaccount to check: ");
            String bankAccount = in.nextLine();
            if (bankAccount.length() != 9) {
                System.out.println("Only works with 9 digits, please try again");
                continue;
            }
            else {
                for (int i = 0; i < 9; i++) {
                    Character charLetter = bankAccount.charAt(i);
                    String stringLetter = charLetter.toString();
                    try {
                        bankAccountNumberList.add(Integer.parseInt(stringLetter));
                    }
                    catch(NumberFormatException e){
                        System.out.println("Added one or more invalid characters.");
                        bankAccountNumberList.add(-1);
                        break;
                    }
                }
            break;
            }
        }
//        for (int i: bankAccountNumberList){
//            System.out.println(i);
//        }
        return bankAccountNumberList;
    }

        public static void bankNumberValidator(ArrayList<Integer> numList){
        int sum = 0;
        int multiplier = 1;
        for (int i = 0; i<numList.size();i++){
            sum += (multiplier * numList.get(8 - i));
            multiplier++;
        }
        if (sum % 15 == 0){
            System.out.println("Probably a real bank account.");
        }
        else {
            System.out.println("Probably not a real bank account..");
        }
        }
}
