package LabsEnHwOpdrachten.lab5;

public class Lab5 {

    public static void main(String[] args) {
//        int[] list = {-2, -3, -1};
        Lab5 a = new Lab5();
//        int bigNum = a.greatest(list);
//        System.out.println(bigNum);
        int fact = a.factorial(0);
        System.out.println("Factorial is: " + fact);
    }

    public int greatest(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }

    }

    public String greatest(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else {
            return s2;
        }

    }

    public int greatest(int[] intList) {
        Integer biggest = null;
        for (int i = 0; i < intList.length; i++) {
            if (biggest == null || intList[i] > biggest) {
                biggest = intList[i];
            }
        }
        return biggest;
    }

    public int factorial(int n) {
        int result;
        if (n > 1) {
            result = n * factorial(n - 1);
        }
        else {
            result = 1;
        }

        return result;
    }
}
