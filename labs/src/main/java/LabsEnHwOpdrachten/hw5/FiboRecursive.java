package LabsEnHwOpdrachten.hw5;

public class FiboRecursive {

    public static void main(String[] args) {
        FiboRecursive f = new FiboRecursive();
        int fibo = 10;
        for (int i = 1; i <= fibo; i++) {
            System.out.print(f.run(5, 10, i) + " ");
        }
        System.out.println();
        System.out.println(f.goldenRatio(10));
    }

    double goldenRatio(int n) {
        long n1 = run(n);
        long n2 = run(n - 1);

        return (double) n1 / n2;
    }

    long run(int n) {

//        if (n <= 2) {
//            return 1;
//        }
//
//        return run(n - 2) + run(n - 1);
        return run(1, 1, n);

    }

    long run(int begin, int n) {
//        if (n <= 2) {
//            return begin;
//        }
//
//        return run(begin, n - 2) + run(begin, n - 1);
        return run(begin, begin, n);

    }

    long run(int f1, int f2, int n) {
        if (n == 1) {
            return f1;
        }
        if (n == 2) {
            return f2;
        }

        return run(f1, f2, n - 2) + run(f1, f2, n - 1);
    }
}
