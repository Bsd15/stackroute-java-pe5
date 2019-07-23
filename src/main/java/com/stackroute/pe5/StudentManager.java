package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java - Practice Exercise - 5
 * Question 4
 * Create a StudentManager class that represents the following information of a student: id, name, and age
 * all the member variables should be private .
 * a. Implement `getter and setter` .
 * b. Create a `StudentSorter` class that implements `Comparator interface` .
 * c. Write a class `Maintest` create StudentManager class object(minimum 5)
 * d. Add these student object into a List of type StudentManager .
 * e. Sort the list based on their age in decreasing order, for student having
 * same age, sort based on their name.
 * f. For students having same name and age, sort them according to their ID.
 */
public class StudentManager {
//    Store list of students
    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param student Student to be added to the list
     */
    public void addStudent(Student student) {
        getStudentList().add(student);
    }

    public List<Student> getSortedStudentsList() {
        Collections.sort(getStudentList(), new StudentSorter());
        return getStudentList();
    }
}

/**
 * Student class holds the details of the student i.e. id, name, age
 */
class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * StudentSorter implements Comparator<Student> to compare to student objects
 * Comparision is done with age and if ages are same then their names are compared.
 * If names are same then their ID's are compared.
 */
class StudentSorter implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        int ageCompareValue = student1.getAge() - student2.getAge();
        if (ageCompareValue == 0) {
            int nameCompareValue = student1.getName().compareTo(student2.getName());
            if (nameCompareValue == 0) {
                return student1.getId() - student2.getId();
            }
            return nameCompareValue;
        }
        return ageCompareValue;

    }
}
