package org.example.streams.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "zzubu///'''";
        getFirstNonRpeating(input);
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(result);  // Output: 'w'
    }

   static void getFirstNonRpeating(String str){

    Character result=str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
            .map(Map.Entry::getKey)
                .findFirst().orElse(null);
       System.out.println(result);


   }

}
