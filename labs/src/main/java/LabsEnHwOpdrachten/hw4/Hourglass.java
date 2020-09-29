package LabsEnHwOpdrachten.hw4;

import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Hourglass hg = new Hourglass();
        hg.hourGlass();
    }

    public void hourGlass() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Geef een oneven nummer: ");
            String nummer = in.nextLine();
            try {
                int intNum = Integer.parseInt(nummer);
                if (intNum < 0) {
                    intNum = intNum * -1;
                }
                try {
                    hourGlassCreator(intNum);
                    break;
                } catch (EvenNumberException e) {
                    System.out.println("Geen oneven nummer gegeven, probeer nog eens!");
                    System.out.println();
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("Dat is geen nummer, probeer nog eens!");
                System.out.println();
                continue;
            }

        }
    }

    public static void hourGlassCreator(int a) throws EvenNumberException {
        if (a % 2 == 0) {
            throw new EvenNumberException(a);
        }

        System.out.println("Aanschouw uw gepersonaliseerde zandloper!" + "\n");
        for (int rij = 1; rij <= a; rij++) {
            for (int col = 1; col <= a; col++) {
                if (rij == a || rij == 1 || (rij + col) == (a + 1) || (col - rij) == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
