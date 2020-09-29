package LabsEnHwOpdrachten.hw11;

import LabsEnHwOpdrachten.hw10.Human;

public class Start {

    public static void main(String[] args) {
        Person david = new Person();
        david.addHistory("Vroeger was alles beter");
        david.addHistory("Haha inderdaad");
        david.printHistory();

        Human henk = david.createSubHuman();
        System.out.println(henk.greet());
    }
}
