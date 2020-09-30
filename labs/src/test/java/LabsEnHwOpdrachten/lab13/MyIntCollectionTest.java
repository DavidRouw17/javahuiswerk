package LabsEnHwOpdrachten.lab13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MyIntCollectionTest {
    MyIntCollection collection;

    @BeforeEach
    public void setUp() {
        collection = new MyIntCollection();
    }

    @Test
    public void testIfAddingWorks() {
        collection.add(5);

        assertThat(collection.getOccupiedCells(), is(1));

        collection.add(8);

        assertThat(collection.getOccupiedCells(), is(2));

        int[] expected = {5, 8, 0, 0};
        int[] returned = collection.getArray();

        assertThat(returned, is(expected));
    }

    @Test
    void testIfAddingMoreThenArraySizeDoublesSize() {
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);

        assertThat(collection.getArraySize(), is(8));

        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);

        assertThat(collection.getArraySize(), is(16));

        int[] expected = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0};
        int[] returned = collection.getArray();

        assertThat(returned, is(expected));

    }
}