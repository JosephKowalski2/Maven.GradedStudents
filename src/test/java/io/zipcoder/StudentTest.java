package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testGetFirstName() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        String output = student.getFirstName();

        Assert.assertEquals(firstName, output);
    }
    @Test
    public void testGetLastName() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        String output = student.getLastName();

        Assert.assertEquals(lastName, output);
    }
    @Test
    public void testSetFirstName() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        student.setFirstName("Uncle");
        String output = student.getFirstName();

        Assert.assertEquals("Uncle", output);
    }
    @Test
    public void testSetLastName() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        student.setLastName("Fester");
        String output = student.getLastName();

        Assert.assertEquals("Fester", output);
    }
    @Test
    public void testGetNumberOfExamsTaken() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        Integer expected = 3;
        Integer output = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, output);
    }
    @Test
    public void testGetExamScores() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Exam 1 score is 100.0\n" +
                "Exam 2 score is 97.8\n" +
                "Exam 3 score is 89.4\n";
        String output = student.getExamScores();

        Assert.assertEquals(expected, output);
    }
    @Test
    public void testAddExamScore() {
        Double examScore = 98.6;
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScore(examScore);
        String expected = "Exam 1 score is 100.0\n" +
                "Exam 2 score is 97.8\n" +
                "Exam 3 score is 89.4\n" +
                "Exam 4 score is 98.6\n";
        String actual = student.getExamScores();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetExamScore() {
        Double examScore = 101.01;
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScore(3, examScore);
        String expected = "Exam 1 score is 100.0\n" +
                "Exam 2 score is 97.8\n" +
                "Exam 3 score is 101.01\n";
        String actual = student.getExamScores();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetAverageExamScore() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        Double expected = 95.73333333333335;
        Double actual = student.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTestToString() {
        String firstName = "Cousin";
        String lastName = "ITT";
        Double [] examScores = {100.0, 97.8, 89.4};
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Cousin ITT\n" +
                "Average Score: 95.73333333333335\n" +
                "Exam 1 score is 100.0\n" +
                "Exam 2 score is 97.8\n" +
                "Exam 3 score is 89.4\n";
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }
}