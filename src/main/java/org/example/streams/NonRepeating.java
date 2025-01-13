package org.example.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeating {



    public static void main(String[] args) {
        String s = "java avaj";
        String result = s.toUpperCase().replaceAll(" ", "");
        String output= result.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey() + entry.getValue().toString())
                .collect(Collectors.joining());

        System.out.println(output);
        getLetterOcurence(s);
    }

    static void getLetterOcurence(String str){
        String result=str.toUpperCase().replaceAll(" ","");

        result.chars().mapToObj(i->(char) i)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream().map(m-> m.getKey()+m.getValue().toString())
                .forEach(p-> System.out.println(p));
    }
}
