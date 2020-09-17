package LabsEnHwOpdrachten.hw7;

public class Person {

    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;

    public static final int numberOfPossibleGenders = Gender.values().length;
    public static final int MAX_AGE = 130;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setGender(Gender g) {
        this.gender = g;
    }

    public Gender getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void haveBirthday() throws PersonDiedException {
        this.age++;
        if (age > MAX_AGE){
            throw new PersonDiedException(age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
