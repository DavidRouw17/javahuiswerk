package LabsEnHwOpdrachten.lab13;

import LabsEnHwOpdrachten.hw10.Android;
import LabsEnHwOpdrachten.hw10.Employee;

public class Start {

    public static void main(String[] args) {
        House<Employee> empHouse = new House<>(new Employee("Herman", 12, "MALE"));
        Android henkie = new Android();
        henkie.charge(60);
        House<Android> androidHouse = new House<>(henkie);

        System.out.println(empHouse);
        System.out.println(androidHouse);
    }
}
