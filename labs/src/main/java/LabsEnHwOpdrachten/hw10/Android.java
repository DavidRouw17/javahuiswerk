package LabsEnHwOpdrachten.hw10;

public class Android extends Human implements Chargeable {
    private int charge;

    public Android() {
        this.charge = 0;
    }

    public String greet() {
        return "I'm only half human, but human still... My energy level is " + charge + "%.";
    }

    public String toString(){
        return "Android has no name or age..";
    }

    public int charge(int amount) {
        if (charge + amount <= 100) {
            this.charge += amount;
        } else {
            System.out.println("Overcharge protection, action rejected!");
        }
        return this.charge;
    }
}
