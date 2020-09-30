package LabsEnHwOpdrachten.lab13;

import LabsEnHwOpdrachten.hw10.Human;

public class House<T extends Human> {
    private T resident;

    public House(T resident){
        this.resident = resident;
    }

    public String toString(){
        return "This house is owned by [" + resident.toString() + "] and it says ["
                + resident.greet() + "].";
    }

}
