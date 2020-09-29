package LabsEnHwOpdrachten.hw10ChainStore;

import java.util.HashMap;

public class CardDatabase {


    int cardAmt; //hoeveel kaarten er zijn aangemaakt, bij elke nieuwe instantie is het +1.
    private HashMap<Integer, Card> cardList;

    public CardDatabase() {
        cardList = new HashMap<Integer, Card>();
        int cardAmt = 0;
    }

    //toevoegen van normale kaart
    public void addRegularCard(String name, double balance) {
        cardAmt++;
        Card newCard = new RegularCard(cardAmt, name, balance);
        cardList.put(cardAmt, newCard);
    }

    //toevoegen van goldcard
    public void addGoldCard(String name, double balance) {
        cardAmt++;
        Card newCard = new GoldCard(cardAmt, name, balance);
        cardList.put(cardAmt, newCard);
    }

    //toevoegen van goldcard inclusief korting
    public void addGoldCard(String name, double balance, int discount) {
        cardAmt++;
        Card newCard = new GoldCard(cardAmt, name, balance);
        ((GoldCard) newCard).setDiscount(discount);
        cardList.put(cardAmt, newCard);
    }

    //checken of opgevraagd account bestaat, geeft true of false
    boolean accountNumberChecker(int accNumber) {
        if (accNumber <= 0 || accNumber > cardAmt) {
            return false;
        }
        return true;
    }

    //vraagt een kaart op en laat betalen
    public void payment(int cardID, int amt) {
        Card currCard = getCard(cardID);
        currCard.pay(amt);
    }

    //vraagt een kaart op en geeft deze terug
    public Card getCard(int cardID) {
        if (accountNumberChecker(cardID)) {
            return cardList.get(cardID);
        } else {
            System.out.println("Error, card not found");
            return null;
        }
    }

    //print alle kaarten in de hashmap, en laat de info zien. Maakt ook
    //onderscheid tussen goldcards en regularcards met instanceOf
    public void cardPrinter() {
        System.out.printf("CardID  Name        Credit  Discount\n");
        for (int i = 1; i <= cardAmt; i++) {
            Card card = cardList.get(i);
            if (card instanceof GoldCard) {
                System.out.printf("%-7s %-11s %-7s %-8s\n", card.getCardId(),
                        card.getName(), card.getCredit(), ((GoldCard) card).getDiscount());
            } else {
                System.out.printf("%-7s %-11s %-7s\n", card.getCardId(),
                        card.getName(), card.getCredit());
            }

        }
        System.out.println();
    }
}
