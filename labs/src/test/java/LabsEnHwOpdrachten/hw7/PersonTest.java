package LabsEnHwOpdrachten.hw7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() throws PersonDiedException {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);


    }

    @Test(expected = PersonDiedException.class)
    public void testPersonOverMAX_AGEShouldDie() {
        Person p = new Person("Gerda", 130);
        p.haveBirthday();
    }

    @Test
    public void testPersonNameAndAgeConstructor(){
        //given
        Person p = new Person("David", 24);
        //when
        String name = p.getName();
        int age = p.getAge();
        //then
        assertEquals("David", name);
        assertEquals(24, age);
    }

    @Test
    public void testPersonHasBirthday() {
        //given
        Person p = new Person("David", 24);
        //when
        p.haveBirthday();
        //then
        assertEquals(25, p.getAge());
    }
}