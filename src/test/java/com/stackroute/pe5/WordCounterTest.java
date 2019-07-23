package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void setUp() throws Exception {
        wordCounter = new WordCounter();
    }

    @After
    public void tearDown() throws Exception {
        wordCounter = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test - countWords()
     * When null is given method should throw NullPointerException
     */
    @Test
    public void givenNullStringShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        wordCounter.countWords(null);
    }

    /**
     * Test - countWords()
     * Should throw NullPointerException with an error message when a empty string is given
     */
    @Test
    public void givenEmptyStringShouldReturnNullPointerExceptionWithErrorMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or Blank string given.");
        wordCounter.countWords("");
    }

    /**
     * Test - countWords()
     * Should throw NullPointerException with an error message when a blank string is given
     */
    @Test
    public void givenBlankStringShouldReturnNullPointerExceptionWithErrorMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or Blank string given.");
        wordCounter.countWords("  ");
    }

    /**
     * Test - countWords()
     * Given string should return Map containing word and it's count.
     */
    @Test
    public void givenStringShouldReturnMapWithWordCount() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 5);
        expectedWordCount.put("two", 2);
        expectedWordCount.put("three", 2);
        assertEquals("givenStringShouldReturnMapWithWordCount: check countWords(). Should return word count as map.",
                expectedWordCount, wordCounter.countWords("one one -one___two,,three,one @three*one?two"));
    }

    @Test
    public void givenStringShouldReturnMapFailure() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 5);
        expectedWordCount.put("two", 5);
        expectedWordCount.put("three", 5);
        assertNotEquals("givenStringShouldReturnMapFailure: check countWords(). Should return word count as map.",
                expectedWordCount, wordCounter.countWords("one one -one___two,,three,one @three*one?two"));
    }
}