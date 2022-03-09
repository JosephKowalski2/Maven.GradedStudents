package io.zipcoder;

import java.util.*;

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
        for (int i = 0; i < students.length; i++){
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                students[i] = null;
            }
        }
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = students[i + 1];
                students[i + 1] = null;
            }
        }
    }

    public Student[] getStudentsByScore(){
//        for (int i = 0; i < students.length; i++){
//            if (students[i].getAverageExamScore() > students[i + 1].getAverageExamScore()){
//                students[i] = students[i + 1];
//                students[i + 1] = students[i];
//            }
//        }
//        for (int i = 0; i < students.length; i++){
//            if (students[i].getAverageExamScore() == students[i + 1].getAverageExamScore()){
//                String firstName1 = students[i].getFirstName();
//                String firstName2 = students[i + 1].getFirstName();
//                if(firstName1.charAt(i) < firstName2.charAt(i)){
//                    students[i] = students[i + 1];
//                    students[i + 1] = students[i];
//                }
//            }
//        }
//    }

    List<Student> studentList = Arrays.asList(students);
    Comparator<Student> comparator = Comparator.comparingDouble((Student s) -> -s.getAverageExamScore())
            .thenComparing(s -> s.getLastName())
            .thenComparing(s -> s.getFirstName());
    Collections.sort(studentList, comparator);
    return studentList.toArray(new Student[students.length]);

}
