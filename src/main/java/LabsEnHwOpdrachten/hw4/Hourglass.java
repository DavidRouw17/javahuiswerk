package LabsEnHwOpdrachten.hw4;

public class Hourglass {

    public static void main(String[] args)  {
        try {
            hourGlass(11);
        } catch (EvenNumberException e) {
            System.out.println("Error gespot, alleen oneven nummers");
        }
        //hourGlass(10);
    }

    public static void hourGlass(int a) throws EvenNumberException {
        if (a % 2 == 0) {
            throw new EvenNumberException(a);
        } else {
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
}
