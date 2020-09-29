package LabsEnHwOpdrachten.hw6;

public class HW6 {
    public static void main(String[] args) {
        HW6 h = new HW6();
        //h.op1();
        //long[] l = {1, 2, 3, 4, 5};
        //long[] newL = h.op3(l);
//        h.op4(l, 4);
//        for (long number : l) {
//            System.out.print(number + " ");
        long[] fibo = h.op5(92);
        for (long num : fibo){
            System.out.print(num + " ");
        }
    }

    public void op1() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[2]);
        //System.out.println(row[4]); //is een error
    }

    public long[] op3(long[] array) {
        int arraySize = array.length;
        int newLength = arraySize * 2;
        long[] newArray = new long[newLength];
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void op4(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= multiplier;
        }
    }

    public long[] op5(int n) {
        long[] result = new long[n];
        long prev = 1;
        long curr = 1;
        result[0] = prev;
        result[1] = curr;
        long next;
        for (int i = 0; i<n-2;i++){
            next = prev + curr;
            prev = curr;
            curr = next;
            result[i+2] = next;
        }
        return result;
    }
}
