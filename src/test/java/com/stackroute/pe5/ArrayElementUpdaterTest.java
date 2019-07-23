package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ArrayElementUpdaterTest {

    ArrayElementUpdater arrayElementUpdater;

    @Before
    public void setUp() throws Exception {
        arrayElementUpdater = new ArrayElementUpdater();
    }

    @After
    public void tearDown() throws Exception {
        arrayElementUpdater = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test - updateArrayWithElement()
     * Check if the updateArrayWithElement throws a NullPointerException with a message
     * when any of parameters are given null, empty or blank
     */
    @Test
    public void givenNullAsArrayShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        arrayElementUpdater.updateArrayWithElement(null, "string to replace", "new string");
    }

    @Test
    public void givenNullAsStringToReplaceShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        arrayElementUpdater.updateArrayWithElement(new String[]{"apple", "Orange"}, null, "new string");
    }

    @Test
    public void givenNullAsNewStringShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        arrayElementUpdater.updateArrayWithElement(new String[]{"apple", "Orange"}, "String to replace", null);
    }

    @Test
    public void givenEmptyArrayShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        arrayElementUpdater.updateArrayWithElement(new String[0], "string to replace", "new string");
    }

    @Test
    public void givenBlankStringToReplaceShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        arrayElementUpdater.updateArrayWithElement(new String[]{"apple", "Orange"}, "  ", "new string");
    }

    @Test
    public void givenBlankNewStringShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Null or empty value given");
        arrayElementUpdater.updateArrayWithElement(new String[]{"apple", "Orange"}, "String to replace", "  ");
    }

    /**
     * Test - updateArrayWithElement()
     * When given input method should return string array with updated string.
     */
    @Test
    public void givenInputShouldReturnArrayWithReplacedString() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        String[] expectedResult = {"Kiwi", "Grape", "Melon", "Berry"};
        assertArrayEquals("givenInputShouldReturnArrayWithReplacedString: updateArrayWithElement() should return array with updated string element.",
                expectedResult, arrayElementUpdater.updateArrayWithElement(inputArray, "Apple", "Kiwi"));
    }

    /**
     * Test - updateArrayWithElement()
     * Check if the method respects case of the strings while searching for the given
     * string and updating it.
     */
    @Test
    public void givenInputAndStringToUpdateShouldReturnSameArray() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        assertArrayEquals("givenInputShouldReturnArrayWithReplacedString: updateArrayWithElement() should return array with updated string element.",
                inputArray, arrayElementUpdater.updateArrayWithElement(inputArray, "apple", "KIwI"));

    }

    /**
     * Test - getArrayList()
     * Checks if the array list is emptied after updating the given array.
     */
    @Test
    public void givenInputShouldReturnEmptiedArrayList() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        arrayElementUpdater.updateArrayWithElement(inputArray, "Apple", "Kiwi");
        assertTrue(arrayElementUpdater.getArrayList().isEmpty());
    }

}