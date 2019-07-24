package com.stackroute.pe5;

import java.util.*;

/**
 * Java - Practice Exercise 5
 * Question 5
 * Write a program to implement set interface which sorts
 * the given randomly ordered names in ascending order.
 * Convert the sorted set in to an ​ array list
 */
public class SetSorter {

    /**
     * Taken in a string and returns a ArrayList of Strings (words in the given string)
     * in a sorted order by converting into a TreeSet.
     * @param input String to be sorted
     * @return ArrayList of Strings in sorted order.
     */
    public List<String> sortElements(String input) {
        if (input.isEmpty() || input.isBlank()) {
            throw new NullPointerException("Empty or blank string given. Please enter a valid string.");
        }
        String[] inputArray = input.split(" ");
        List<String> inputArrayList = new ArrayList<>(Arrays.asList(inputArray));
        TreeSet<String> treeSet = new TreeSet<>(inputArrayList);
        return new ArrayList<>(treeSet);
    }
}
