package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SetSorterTest {

    SetSorter setSorter;

    @Before
    public void setUp() throws Exception {
        setSorter = new SetSorter();
    }

    @After
    public void tearDown() throws Exception {
        setSorter = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test - sortElements()
     * Method should throw an NullPointerException when null is given.
     */
    @Test
    public void givenNullReturnNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        setSorter.sortElements(null);
    }

    /**
     * Test - sortElements()
     * Method should throw an NullPointerException when empty string is given.
     */
    @Test
    public void givenEmptyStringShouldThrowNullPointerExceptionWithError() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or blank string given. Please enter a valid string.");
        setSorter.sortElements("");
    }

    /**
     * Test - sortElements()
     * Method should throw an NullPointerException when blank string is given.
     */
    @Test
    public void givenBlankStringShouldThrowNullPointerExceptionWithError() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or blank string given. Please enter a valid string.");
        setSorter.sortElements("  ");
    }

    /**
     * Test - setSorter()
     * Given String, method should return a ArrayList of words in the string in
     * a sorted order.
     */
    @Test
    public void givenInputShouldReturnSortedArrayList() {
        String input = "Harry Olive Alice Bluto Eugene";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");
        assertEquals("givenInputShouldReturnSortedArrayList: check sortElements(). Should return an array list of sorted elements(strings).",
                expectedResult, setSorter.sortElements(input));
    }

    /**
     * Test - sortElements()
     * Given string with repeating words should return ArrayList without
     * duplicate elements in a sorted order.
     */
    @Test
    public void givenInputWithDuplicateValuesShouldReturnArrayListWithoutDuplicates() {
        String input = "Harry Olive Alice Bluto Alice Eugene";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");
        assertEquals("givenInputShouldReturnSortedArrayList: check sortElements(). Should return an array list of sorted elements(strings).",
                expectedResult, setSorter.sortElements(input));
    }
}