package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void testGetStudents() {
        Double[] s1Scores = { 10.4, 76.6, 30.2 };
        Double[] s2Scores = { 101.2, 99.9, 99.8 };
        Student s1 = new Student("Bob", "Ross", s1Scores);
        Student s2 = new Student("Mike", "Ross", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        Student[] expected = {s1, s2};
        Student[] actual = classroom.getStudents();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetAverageExamScore() {
        Double[] s1Scores = { 10.4, 76.6, 30.2 };
        Double[] s2Scores = { 101.2, 99.9, 99.8 };
        Student s1 = new Student("Bob", "Ross", s1Scores);
        Student s2 = new Student("Mike", "Ross", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        Double expected = 69.68333333333334;
        Double actual = classroom.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAddStudent() {
        Double[] s1Scores = { 10.4, 76.6, 30.2 };
        Student s1 = new Student("Bob", "Ross", s1Scores);
        Student[] students = {s1};
        Classroom classroom = new Classroom(students);

        classroom.addStudent(s1);
        Student[] expected = {s1};
        Student[] actual = classroom.getStudents();

        Assert.assertEquals(expected, actual);
    }

    public void testRemoveStudent() {
        Double[] s1Scores = { 10.4, 76.6, 30.2 };
        Double[] s2Scores = { 101.2, 99.9, 99.8 };
        Student s1 = new Student("Bob", "Ross", s1Scores);
        Student s2 = new Student("Mike", "Ross", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);


    }

    public void testGetStudentsByScore() {
    }

    public void testGetGradeBook() {
    }
}
