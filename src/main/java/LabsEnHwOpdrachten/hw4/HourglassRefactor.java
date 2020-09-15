package LabsEnHwOpdrachten.hw4;

import java.util.Scanner;

public class HourglassRefactor {

    public static void main(String[] args) {
        HourglassRefactor hg = new HourglassRefactor();
        hg.hourGlass();
    }

    public void hourGlass() {
        Scanner in = new Scanner(System.in);
        System.out.println("Geef een oneven nummer: ");
        String nummer = in.nextLine();
        try {
            int intNum = Integer.parseInt(nummer);
            if (intNum < 0) {
                intNum = intNum * -1;
            }
            hourGlassCreator(intNum);
        } catch (EvenNumberException e) {
            System.out.println(e.getMessage() + "\n");
            hourGlass();
        } catch (NumberFormatException e) {
            System.out.println("Dat is geen nummer, probeer nog eens!" + "\n");
            hourGlass();
        }

    }

    /**
     * programma dat met sterren een holle zandloper maakt, afhankelijk van a
     * @param a hoeveel rijen aan zandloper je wilt
     * @throws EvenNumberException wanneer er een even nummer gegeven wordt
     */
    public void hourGlassCreator(int a) throws EvenNumberException {
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


