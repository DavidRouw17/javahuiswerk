package LabsEnHwOpdrachten.hw10;

public class Employee extends Person {

    public Employee(String name){
        super(name);
    }

    public Employee(String name, int age) {super(name, age);}

    public Employee(String name, int age, String gender) {super(name, age, gender);}

    public String greet(){
        return "I'm tired of working. This is inhuman!";
    }
}
