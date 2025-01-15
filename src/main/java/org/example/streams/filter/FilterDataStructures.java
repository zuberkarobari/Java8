package org.example.streams.filter;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDataStructures {

//    Filter elements from a stack or queue based on a condition.
//    Filter nodes in a tree structure (e.g., nodes with values > 10).
//    Filter elements in a graph traversal based on a property (e.g., weight of edges).
//    Filter keys/values from a dictionary or hashmap.
//    Filter elements from a set while preserving uniqueness.
    public static void main(String[] args) {
        // Example data
        Map<String, Integer> employeeSalaries = Map.of("Alice", 50000, "Bob", 45000, "Charlie", 55000);
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Problem 1: Filter map entries where salary > 50k
        Map<String, Integer> highEarners = employeeSalaries.entrySet().stream()
                                                           .filter(emp->emp.getValue()>=50000)
                                                           .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("High Earners: " + highEarners);

        // Problem 2: Filter elements in a queue greater than 3
        Queue<Integer> filteredQueue = queue.stream()
                                            .filter(q->q>3)
                                            .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Filtered Queue: " + filteredQueue);

        Map<String, String> dictionary = Map.of("apple", "fruit", "carrot", "vegetable", "banana", "fruit");


        Map<String, String> filteredDictionary = dictionary.entrySet().stream()
                .filter(entry -> "fruit".equals(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered Dictionary: " + filteredDictionary);

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> filteredSet = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Filtered Set: " + filteredSet);



    }
}
