package LabsEnHwOpdrachten.hw10ChainStore;

public class RegularCard extends Card {

    public RegularCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    @Override
    public boolean pay(int amount) {
        if (credit - amount >=0){
            credit -= amount;
            return true;
        }
        System.out.println(this.name + " does not have enough credit! You want to pay " + amount +
                " but only have " + this.credit  +"!");
        return false;
    }
}
