package org.example.streams.filter;

import java.util.stream.*;
import java.util.*;

public class FilterStreams {
    public static void main(String[] args) {

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,null);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Problem 1: Filter numbers divisible by 3
        List<Integer> divisibleByThree = numberStream.filter(n->n!=null&&n%3==0)
                                                     .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3: " + divisibleByThree);
        
       names.stream().filter(name->name.contains("lie")).forEach(p-> System.out.println(p));
        List<String> distinctNames = names.stream()
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
    }
}
