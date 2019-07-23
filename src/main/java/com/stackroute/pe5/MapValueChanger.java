package com.stackroute.pe5;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Java - Practice Exercise - 5
 * Question - 5
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has
 * b. Set the key `val1` to
 * Example 1:
 * The map {"val1": "java","java"} should return {"val1": " ", "val2":"java"}
 * Example 2:
 * The map {"val1": "mars","mars"} should return {"val1": " ", "val2":"mars"}
 */
public class MapValueChanger {
    /**
     * Checks  if the given map contains val1 and val2 keys and updates the map by
     * copying value of "val1" key into "val2" and setting "val1" value as " ".
     * @param inputMap Map containing <String, String> which has to be updated
     * @return Map<String, String> with updated keys
     */
    public Map<String, String> changeValues(Map<String, String> inputMap) {
        if (inputMap == null) {
            throw new NullPointerException("Null Map given.");
        }
//        Atomic variable to get the value inside the lambda function
        AtomicReference<String> value = new AtomicReference<>("");
//        Check if map contains "val1" key and get the value and update the value to " "
        inputMap.computeIfPresent("val1",(k,v) -> {
            value.set(v);
            v = " ";
            return v;
        });
//        Set the value of key "val2" to value of "val1".
        inputMap.computeIfPresent("val2",(k,v) -> v = value.get());
        return inputMap;
    }
}
