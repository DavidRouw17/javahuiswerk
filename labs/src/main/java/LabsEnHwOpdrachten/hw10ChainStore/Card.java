package LabsEnHwOpdrachten.hw10ChainStore;

public abstract class Card {
    private int cardId;
    String name;
    double credit;


    public Card(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);


    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }
}
