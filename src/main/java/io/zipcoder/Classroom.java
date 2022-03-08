package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student){
        students = student;
    }

    public Classroom(){
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double average = 0.0;
        for (int i = 0; i < students.length; i++){
            average += students[i].getAverageExamScore();
        }
        return average / students.length;
    }

    public void addStudent(Student student){
//        for (int i = 0; i < students.length; i++){
//            students[i] = student;
//        }
        Arrays.fill(students, student);
    }

    public void removeStudent(String firstName, String lastName){
        for (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
            if (students)
        }
    }
}
