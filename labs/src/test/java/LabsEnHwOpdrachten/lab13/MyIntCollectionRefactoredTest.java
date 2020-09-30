package LabsEnHwOpdrachten.lab13;

import LabsEnHwOpdrachten.hw10.Employee;
import LabsEnHwOpdrachten.hw10.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
@SuppressWarnings("unchecked")

class MyIntCollectionRefactoredTest {
    MyIntCollectionRefactored collection;

    @BeforeEach
    public void setUp() {
        collection = new MyIntCollectionRefactored();
    }

    @Test
    public void testIfAddingWorks() {
        collection.add("Herman");

        assertThat(collection.getOccupiedCells(), is(1));
        Person henk = new Person("Henk");
        collection.add(henk);

        assertThat(collection.getOccupiedCells(), is(2));

        Object[] expected = {"Herman", henk, null, null};
        Object[] returned = collection.getArray();

        assertThat(returned, is(expected));
    }

    @Test
    void testIfAddingMoreThenArraySizeDoublesSize() {
        collection.add(5);
        collection.add(5);
        collection.add(3.125);
        collection.add(5);
        collection.add("Mission accomplished");

        assertThat(collection.getArraySize(), is(8));

        byte b = 12;
        House<Employee> huis = new House<>(new Employee("Peter", 12, "MALE"));

        collection.add(5);
        collection.add(b);
        collection.add(5);
        collection.add(huis);
        collection.add(5);

        assertThat(collection.getArraySize(), is(16));

        Object[] expected = {5, 5, 3.125, 5, "Mission accomplished", 5, b, 5, huis, 5, null,null,null,null,null,null};
        Object[] returned = collection.getArray();

        assertThat(returned, is(expected));

    }
}