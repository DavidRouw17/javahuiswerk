package LabsEnHwOpdrachten.lab5;

public class Lab5 {

    public static void main(String[] args) {
        Lab5 a = new Lab5();
        int fact = a.factorial(5);
        System.out.println("Factorial is: " + fact);


    }

    /**
     *
     * @param value1 int waarde van 1
     * @param value2 int waarde van 2
     * @return de grootste waarde, als het gelijk is wordt waarde 2 terug gegeven.
     */
    public int greatest(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }

    }

    /**
     * checks the length of 2 strings and returns the longest string
     * @param s1 string 1
     * @param s2 string 2
     * @return the string with the most characters. if same length, returns s2
     */
    public String greatest(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else {
            return s2;
        }

    }

    /**
     * returns the greatest int from a list of ints
     * @param intList list of ints of trivial size
     * @return biggest int from list
     */
    public int greatest(int... intList) {
        Integer biggest = null;
        for (int i = 0; i < intList.length; i++) {
            if (biggest == null || intList[i] > biggest) {
                biggest = intList[i];
            }
        }
        return biggest;
    }

    public int factorial(int n) {
        if (n<=1) return n;
        return n * factorial(n-1);


    }

}
