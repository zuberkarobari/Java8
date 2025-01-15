package org.example.streams.DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreampractiseHandsOn {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "apple", "fig");
        String testString = "swiss";
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 5);

        Arrays.asList("AlSaba","Sohail","Zuber","Hazar");
        Arrays.asList(1,2,3,4,5,6,7,8,9);


        strings.stream().map(String::toUpperCase).forEach(p-> System.out.print(" "+p));
        Optional<Character> nonRepeatingChar= testString.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> testString.indexOf(ch) == testString.lastIndexOf(ch))
                .findFirst();

        testString.toLowerCase()
                .chars() // Convert the string to an IntStream of character codes
                .mapToObj(c -> (char) c) // Convert character codes back to Character
                .collect(Collectors.groupingBy(Function.identity(), // Group by character
                        LinkedHashMap::new, // Use LinkedHashMap to preserve insertion order
                        Collectors.counting())) // Count occurrences of each character
                .entrySet()
                .stream() // Convert the map to a stream of entries
                .filter(entry -> entry.getValue() == 1) // Keep only characters with a count of 1
                .map(Map.Entry::getKey) // Extract the key (character)
                .findFirst() // Get the first non-repeated character
                .orElseThrow(() -> new RuntimeException("No non-repeated character found")); // Handle no result case



        numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)).forEach((key, value) ->
                        System.out.println((key ? "Even" : "Odd") + ": " + value));
        // 7. Find the longest string in a list

        String largestzElem =strings.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(largestzElem);

        // 8. Count occurrences of each word in a list
        strings.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting())).forEach((key , value)->
                System.out.println("word : "+ key + ": "+ " Repeat : " + value));

    }
}
//numbers.stream().collect(Collectors.partitioningBy(n->n%2==0)).forEach((k,v)->
//                System.out.println((k ? "Even " : "Odd ") + v));
//        numbers.stream()
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0)).forEach((key, value) ->
//                        System.out.println((key ? "Even" : "Odd") + ": " + value));

//        testString
//                .chars()
//                .mapToObj(c->(char)c)
//                        .collect(Collectors.groupingBy(Function.identity(),
//                                LinkedHashMap::new,
//                                Collectors.counting()))
//                                .entrySet()
//                                        .stream().filter()