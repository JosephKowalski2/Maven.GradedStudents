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
        return examScores.size();
    }

    public String getExamScores(){
        String scores = "";
        for (int i = 0; i < getNumberOfExamsTaken(); i++){
            scores += "Exam " + (i + 1)  + " score is " + examScores.get(i) + "\n";
        }
        return scores;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
//        examScores.remove(examNumber - 1);
//        examScores.add(examNumber - 1, newScore);
        examScores.set(examNumber - 1, newScore);
    }

    public Double getAverageExamScore(){
        Double average = 0.0;
        for (int i = 0; i < examScores.size(); i++){
            average += examScores.get(i);
        }
        return average / examScores.size();
    }

    public String toString(){
        String studentInfo = firstName + " " + lastName + "\n";
        studentInfo += "Average Score: " + getAverageExamScore() + "\n";
        studentInfo += getExamScores();
        return studentInfo;
    }
}
