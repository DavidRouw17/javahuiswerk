package LabsEnHwOpdrachten.hw9;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        Person hans = new Person("Hans");

        hans = null;

        System.gc();
    }
}
