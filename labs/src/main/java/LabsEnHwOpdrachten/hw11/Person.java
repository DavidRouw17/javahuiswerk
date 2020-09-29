package LabsEnHwOpdrachten.hw11;

import LabsEnHwOpdrachten.hw10.Human;

import java.util.ArrayList;

public class Person {

    private ArrayList<HistoryRecord> historyList;

    public Person(){
        historyList = new ArrayList<HistoryRecord>();
    }

    public void addHistory(String descr){
        HistoryRecord record = new HistoryRecord(descr);
        historyList.add(record);
    }

    public void printHistory(){
        for (HistoryRecord historyRecord : historyList) {
            System.out.println(historyRecord);
        }
    }


    private class HistoryRecord{
        String description;

        public HistoryRecord(String description){
            this.description = description;
        }

        public String toString(){
            return description;
        }

    }

    public Human createSubHuman(){
        Human human = new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
        return human;
    }
}
