package LabsEnHwOpdrachten.hw10;

import LabsEnHwOpdrachten.lab12.MyAnnotation;
import LabsEnHwOpdrachten.lab12.MyAnnotation2;

public class Person extends Human {

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
    @MyAnnotation("was hello but is bye")
    @MyAnnotation2
    public String greet(){
        return "Hello, my name is " + name + ". Nice to meet you!";
    }

    public String toString(){
        return name + "(" + age + ") is " + gender;
    }
}
