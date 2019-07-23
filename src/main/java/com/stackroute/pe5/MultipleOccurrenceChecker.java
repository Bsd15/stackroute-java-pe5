package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

/**
 * Java - Practice Exercise - 5
 * Question - 3
 * Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
 * each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
 */
public class MultipleOccurrenceChecker {

    /**
     * Returns a Map<String, Boolean> containing strings as keys and true if the string
     * occurs multiple times otherwise false.
     * @param inputArray Array of string which is to be checked.
     * @return Map<String, Boolean> containing string with boolean -> True if string is repeated else false.
     */
    public Map<String, Boolean> checkOccurrences(String[] inputArray) {
        if (inputArray.length <= 0) {
            throw  new NullPointerException("Empty array given.");
        }
//        Used to store the strings and their occurrences
        Map<String, Boolean> frequencyMap = new HashMap<>();
//        Iterate through the strings in the array
        for (String string : inputArray) {
//            Change the value of the string in key to true if present.
            frequencyMap.computeIfPresent(string, (k, v) -> v = true);
//            If the string is not present in the map, add it and set it's value to false.
            frequencyMap.putIfAbsent(string, false);
        }
        return frequencyMap;
    }
}
