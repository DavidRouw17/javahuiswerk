package LabsEnHwOpdrachten.lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Lab6 l = new Lab6();
        l.calculateFromInput(8);
    }

    public int[] calculateFromInput(int numberAmt){
        int counter = 0;
        int[] storage = new int[numberAmt];
        int sum = 0;
        while (counter < numberAmt){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number..");
            String numString = in.nextLine();
            int num = Integer.parseInt(numString);
            storage[counter] = num;
            sum += num;
            counter++;
        }
        System.out.print("You have given the following numbers: ");
        for (int i : storage){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("It totals to " + sum);
        return storage;
    }
}
