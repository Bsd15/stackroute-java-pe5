package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java - Practice Exercise - 5
 * Question - 2
 * Write a program to find the number of counts in the following ​ String​ . Store the output in
 * Map<​ String​ ,Integer> as key value pair.
 */
public class WordCounter {
    public Map<String, Integer> countWords(String input) {
//        Validate string
        if (input.isBlank() || input.isEmpty()) {
            throw new NullPointerException("Empty or Blank string given.");
        }
//        Regex to capture only words and exclude any special characters
        final String regex = "([^\\W_]+)";
        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, Integer> wordCountMap = new HashMap<>();
        while (matcher.find()) {
            wordCountMap.computeIfPresent(matcher.group(1), (k,v) -> v + 1 );
            wordCountMap.putIfAbsent(matcher.group(1), 1);
        }
        return wordCountMap;
    }
}
