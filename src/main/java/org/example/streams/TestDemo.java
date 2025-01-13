package org.example.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestDemo {



    public static void main(String[] args) {
        String input="Java articles";
        Map<Character,Long> charCount =input.chars().mapToObj(c-> (char)c)
                .collect
                        (Collectors.groupingBy
                                (c->c,LinkedHashMap::new,
                                        Collectors.counting()));
        Optional<Character> secondNonrepeating=charCount.entrySet().stream()
                .filter(letter->letter.getValue()==1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst();
        System.out.println(secondNonrepeating);
    }

}
