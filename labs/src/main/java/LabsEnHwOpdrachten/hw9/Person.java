package LabsEnHwOpdrachten.hw9;

public class Person {

    private String name;
    private int age;
    private String gender; //enum in hw7, but not the point of this exercise

    public Person(String name){
        this(name, 0);
    }

    public Person(String name, int age){
        this(name, age, "unknown");
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void finalize(){
        System.out.println("The Person.finalize() has been initiated by the cleanup crew. Goodbye!");
    }
}
