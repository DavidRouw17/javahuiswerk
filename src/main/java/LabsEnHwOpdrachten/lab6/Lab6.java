package LabsEnHwOpdrachten.lab6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Lab6 l = new Lab6();
        //l.calculateFromInput(8);
        l.randomCube(6);
    }

    public int[] calculateFromInput(int numberAmt) {
        int counter = 0;
        int[] storage = new int[numberAmt];
        int sum = 0;
        while (counter < numberAmt) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number..");
            String numString = in.nextLine();
            int num = Integer.parseInt(numString);
            storage[counter] = num;
            sum += num;
            counter++;
        }
        System.out.print("You have given the following numbers: ");
        for (int i : storage) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("It totals to " + sum);
        return storage;
    }


    public void randomCube(int size) {
        Random rand = new Random();
        int[][] cube = new int[size][size];
        ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
        int newNumber = 0; //starting value, need to be initialized
        numbersUsed.add(0); //0 can never be in the cube
        for (int rij = 0; rij < size; rij++) {
            for (int kol = 0; kol < size; kol++) {
                while (numbersUsed.contains(newNumber)){
                    newNumber = rand.nextInt((size*size)+1);
                }
                cube[rij][kol] = newNumber;
                numbersUsed.add(newNumber);
            }
        }

        //for printing the cube
        for (int[] row : cube) {
            for (int num : row) {
                System.out.printf("%-3s",num);
            }
            System.out.println();
        }
    }
}
