package LabsEnHwOpdrachten.hw5;

public class Fibo {
    public static void main(String[] args) {
        Fibo f = new Fibo();
        System.out.println(f.run(4, 6));
//        int i = 1;
//        while (f.goldenRatio(i) > 0) {
//            i += 1;
//
//        }
//        System.out.println(i);
        // resultaat: bij 93 is het te groot voor long, overschakelen naar bigInt!
    }

    double goldenRatio(int n) {
        long n1 = run(n);
        double n2 = run(n - 1);
        double ratio = n1 / n2;
        System.out.println("Golden ratio is: " + ratio);
        return ratio;
    }

    long run(int n) {
        return run(1, n);
    }

    long run(int start, int n) {
        return run(start, 1, n);
    }

    long run(int f1, int f2, int n) {
        long v1 = f1;
        long v2;
        if (f2 == 1) {
            v2 = v1;
        } else {
            v2 = f2;
        }
        long v3 = 0;

        System.out.print(v1 + " ");
        System.out.print(v2 + " ");
        for (int i = 1; i <= n - 2; i++) {
            v3 = v2 + v1;
            System.out.print(v3 + " ");
            v1 = v2;
            v2 = v3;


        }
        System.out.println();
        return v3;
    }
}

