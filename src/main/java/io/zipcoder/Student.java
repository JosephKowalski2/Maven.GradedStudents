package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return getExamScores().size();
    }

    public String getExamScores(){
        String scores = "";
        for (int i = 0; i < getNumberOfExamsTaken(); i++){
            scores += "Exam " + i + "score is " + examScores.get(i) + "/n";
        }
        return scores;
    }


}
