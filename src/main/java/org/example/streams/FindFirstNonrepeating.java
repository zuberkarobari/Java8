package org.example.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonrepeating {
    public static void main(String[] args) {
        String input="Java articles are Awesome";
        System.out.println(findFirst(input));

    }
    public static Optional<Character> findFirst(String str){
        Map<Character,Long> charCount=new LinkedHashMap<>();
        str.chars().mapToObj(c->(char)c)
                .forEach(c->charCount.put(c,charCount.getOrDefault(c,0l)+1));


        return charCount.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey).findFirst();
    }
}
