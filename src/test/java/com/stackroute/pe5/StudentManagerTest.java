package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentManagerTest {

    StudentManager studentManager;

    @Before
    public void setUp() throws Exception {
        studentManager = new StudentManager();
    }

    @After
    public void tearDown() throws Exception {
        studentManager = null;
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing various values, method should return the sorted list.
     */
    @Test
    public void givenStudentsListShouldReturnSortedList() {
        Student student1 = new Student(1, "Ajay", 27);
        Student student2 = new Student(2, "Sneha", 23);
        Student student3 = new Student(3, "Simran", 37);
        Student student4 = new Student(4, "Ajith", 22);
        Student student5 = new Student(5, "Vijay", 29);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student4);
        expectedSortedList.add(student2);
        expectedSortedList.add(student1);
        expectedSortedList.add(student5);
        expectedSortedList.add(student3);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList, studentManager.getSortedStudentsList());
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing similar ages, method should return the sorted list.
     */
    @Test
    public void givenStudentsListWithSameAgesShouldReturnSortedList() {
        Student student1 = new Student(1, "Ajay", 29);
        Student student2 = new Student(2, "Sneha", 23);
        Student student3 = new Student(3, "Simran", 37);
        Student student4 = new Student(4, "Ajith", 23);
        Student student5 = new Student(5, "Vijay", 29);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student4);
        expectedSortedList.add(student2);
        expectedSortedList.add(student1);
        expectedSortedList.add(student5);
        expectedSortedList.add(student3);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList, studentManager.getSortedStudentsList());
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing various values, method should return the sorted list.
     */
    @Test
    public void givenStudentsListWithShouldReturnSortedList() {
        Student student1 = new Student(1, "Ajay", 27);
        Student student2 = new Student(2, "Ajay", 27);
        Student student3 = new Student(3, "Ajay", 27);
        Student student4 = new Student(4, "Ajay", 27);
        Student student5 = new Student(5, "Sneha", 27);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student1);
        expectedSortedList.add(student2);
        expectedSortedList.add(student3);
        expectedSortedList.add(student4);
        expectedSortedList.add(student5);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList, studentManager.getSortedStudentsList());
    }
}