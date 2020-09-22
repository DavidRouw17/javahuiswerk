package LabsEnHwOpdrachten.hw10ChainStore;

public class GoldCard extends Card {


    private int discount;

    public GoldCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
        this.discount = 0;
    }




    @Override
    public boolean pay(int amount) {
        double discountedAmount = ((double)(100 - this.discount)/100) * amount;
        this.credit -= discountedAmount;

        return true;
    }

    public void setDiscount(int discount){
        if (discount < 0 || discount > 30){
            throw new OutOfRangeException(discount);
        }
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
