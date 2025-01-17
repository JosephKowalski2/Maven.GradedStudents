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

    public Student[] getStudentsByScore() {
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


        List<Student> studentList = Arrays.asList(students);
        studentList.removeAll(Collections.singleton(null));
        Comparator<Student> comparator = Comparator.comparingDouble((Student s) -> -s.getAverageExamScore())
                .thenComparing(s -> s.getLastName())
                .thenComparing(s -> s.getFirstName());
        Collections.sort(studentList, comparator);
        return studentList.toArray(new Student[students.length]);
    }

    public Map<Student, String> getGradeBook(){
        Student[] studentGrades = this.getStudentsByScore();
        Map<Student, String> gradeBook = new HashMap<>();
        double percentile;
        int count = getStudentsByScore().length;
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                count = i + 1;
                break;
            }
            else if (students.length - 1 == i){
                count = students.length;
            }
        }
        for (int i = 0; i < count; i++){
            percentile = ((count - i - 1.0/ (count * 100)));
            if (percentile >= 90){
                gradeBook.put(studentGrades[i], "A");
            }
            else if (percentile <= 89 && percentile >= 71){
                gradeBook.put(studentGrades[i], "B");
            }
            else if (percentile <= 70 && percentile >= 50){
                gradeBook.put(studentGrades[i], "C");
            }
            else if (percentile <= 49 && percentile >= 11){
                gradeBook.put(studentGrades[i], "D");
            }
            else {
                gradeBook.put(studentGrades[i], "F");
            }
        }
        return gradeBook;
    }

}
