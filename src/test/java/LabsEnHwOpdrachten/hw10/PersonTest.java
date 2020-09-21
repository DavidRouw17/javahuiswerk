package LabsEnHwOpdrachten.hw10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void testIfPersonGivesRightGreeting() {
        Person david = new Person("David", 24, "Male");

        String expected = "Hello, my name is David. Nice to meet you!";

        assertEquals(david.greet(), expected);
    }

    @Test
    public void testIfAndroidGivesRightGreeting() {
        Android herman = new Android();

        String expected = "I'm only half human, but human still...";

        assertEquals(herman.greet(), expected);
    }

    @Test
    public void testIfEmployeeGivesRightGreeting() {
        Employee karel = new Employee("Karel");

        String expected = "I'm tired of working. This is inhuman!";

        assertEquals(karel.greet(), expected);
    }

    @Test
    public void testIfTeacherGivesRightGreeting() {
        Teacher emma = new Teacher("Emma");

        String expected = "Hello, my name is Emma. Nice to meet you!";

        assertEquals(emma.greet(), expected);
    }
}