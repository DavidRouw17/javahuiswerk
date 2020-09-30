package LabsEnHwOpdrachten.lab13;

public class MyIntCollection {

    private int[] cells;
    private int occupied;

    public MyIntCollection() {
        cells = new int[4];
        occupied = 0;
    }

    public void add(int i) {
        if (occupied == cells.length) {
            doubleArrayLength();
        }

        cells[occupied] = i;
        occupied++;
    }

    public void doubleArrayLength() {
        int newArraySize = cells.length * 2;
        int[] newArray = new int[newArraySize];

        for (int i = 0; i < cells.length; i++) {
            newArray[i] = cells[i];
        }
        cells = newArray;
    }

    public int getArraySize() {
        return cells.length;
    }

    public int getOccupiedCells() {
        return occupied;
    }

    public int[] getArray(){
        return cells;
    }
}
