# Java - StackRoute - Practice Exercise 5

1. Write a Java program to update specific array element by given element and empty the ​ array list​ .

    Input: [Apple, Grape, Melon, Berry]
    
    Output: [Kiwi, Grape, Mango, Berry]
    
    Array list​ after removing all elements []
    
    [ArrayElementUpdater.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/ArrayElementUpdater.java)

2. Write a program to find the number of counts in the following ​ String​ . Store the output in
Map<​ String​ ,Integer> as key value pair.
    
    Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
    
    Output : {"one":5 , "two":2, "three" :2}
    
    [WordCounter.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/WordCounter.java)

3. Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array

    Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
    
    Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
    
    [MultipleOccurrenceChecker.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/MultipleOccurrenceChecker.java)
4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private.

    a. Implement `getter and setter` .

    b. Create a `StudentSorter` class that implements `Comparator interface` .

    c. Write a class `Maintest` create Student class object(minimum 5)

    d. Add these student object into a List of type Student .

    e. Sort the list based on their age in decreasing order, for student having same age, sort based on their name.

    f. For students having same name and age, sort them according to their ID.
    
    [StudentManager.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/StudentManager.java)
5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2. Modify and return the given map as follows:
    
    a. If the key `val1` has
    
    b. Set the key `val1` to
    
    Example 1:
    
    The map {"val1": "java", "java"} should return {"val1": " ", "val2": "java"}
    
    Example 2:
    
    The map {"val1": "mars", "mars"} a value, set the key `val2` to have that value, and have the value `" "` (empty​ ​ string​ ).
    "val2": "c++"} should return {"val1": " ", "val2": "val2": "saturn"} should return {"val1": " ", "val2": "mars"}

   [MapValueChanger.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/MapValueChanger.java)
    
6. Write a program to implement set interface which sorts the given randomly ordered names inascending order. Convert the sorted set in to an ​ array list

    Input : Harry Olive Alice Bluto Eugene
    
    Output :
    
    Sorted Set : Alice Bluto Eugene Harry Olive
    
    Array list​ from Set : Alice Bluto Eugene Harry Olive
    
    [SetSorter.java](https://github.com/Bsd15/stackroute-java-pe5/blob/master/src/main/java/com/stackroute/pe5/SetSorter.java)