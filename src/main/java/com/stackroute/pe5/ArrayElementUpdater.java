package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java - Practice Exercise - 5
 * Question - 1
 * Write a Java program to update specific array element by given element and empty the ​ array list​ .
 */
public class ArrayElementUpdater {
    private ArrayList<String> arrayList;

    public String[] updateArrayWithElement(String[] arrayToUpdate, String stringToReplace, String newString) {
        String errorMessage = "Null or empty value given";
//        Check if the given input is empty or null or blank
        if (arrayToUpdate == null || arrayToUpdate.length <= 0 || stringToReplace.isEmpty() || newString.isEmpty() || stringToReplace.isBlank() || newString.isBlank()) {
            throw new NullPointerException(errorMessage);
        }
//        Convert the array into a list
        arrayList = new ArrayList<>(Arrays.asList(arrayToUpdate));
//        Find the index of the given stringToReplace
        int indexOfStirngToReplace = arrayList.indexOf(stringToReplace);
//        Check if index is not equal to -1
        if (indexOfStirngToReplace != -1 ) {
//            Update the element at the found index
            arrayList.set(indexOfStirngToReplace, newString);
//            convert the list into a array
            String[] updatedArray = arrayList.toArray(new String[arrayToUpdate.length]);
//            Empty the List
            arrayList.clear();
//            return the updated array
            return updatedArray;
        }
//        If index is -1 then return the same array
        return arrayToUpdate;
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
}
