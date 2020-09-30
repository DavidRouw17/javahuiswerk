package LabsEnHwOpdrachten.lab13;

import java.lang.reflect.Array;

public class MyIntCollectionRefactored<T> {

    private Object[] cells;
    private int occupied;

    public MyIntCollectionRefactored() {
        cells = new Object[4] ;
        occupied = 0;
    }

    public void add(T object) {
        if (occupied == cells.length) {
            doubleArrayLength();
        }

        cells[occupied] = object;
        occupied++;
    }

    public void doubleArrayLength() {
        int newArraySize = cells.length * 2;

        Object[] newArray =new Object[newArraySize];

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

    public Object[] getArray(){
        return cells;
    }
}
