package LabsEnHwOpdrachten.hw10ChainStore;

import java.text.ParseException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        CardDatabase db = new CardDatabase();
        dbFiller(db);
        db.cardPrinter();
        paymentScanner(db);
        db.cardPrinter();


    }
    //creeren van database voor testdata
    public static void dbFiller(CardDatabase db){
        db.addGoldCard("Bram", 3000, 20);
        db.addRegularCard("Bart", 1000);
        db.addRegularCard("Hasan", 20000);
        db.addGoldCard("Bas", 2000, 15);
        db.addGoldCard("David", 100, 12);
        db.addRegularCard("Stijn", 5000);
        db.addGoldCard("Niels", 1500, 8);
        db.addRegularCard("Joshua", 5);
        db.addRegularCard("Petra", 100500);
        db.addGoldCard("Myrthe", 7000, 10);
        db.addGoldCard("Rob", 100, 5);
    }

    //betaling aan de hand van input user
    public static void paymentScanner(CardDatabase db){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cardID: ");
        String cCard = in.nextLine();
        try {
            int cardNumber = Integer.parseInt(cCard);
            if (db.accountNumberChecker(cardNumber)) {
                Card card = db.getCard(cardNumber);
                System.out.println("Enter the amount to pay: ");
                String payment = in.nextLine();
                card.pay(Integer.parseInt(payment));
            }
            else {
                System.out.println("Card not found!");
            }
        }
        catch (NumberFormatException e){
            System.out.println(cCard + " is not a valid number, try with integer next time.");
        }
    }
}
