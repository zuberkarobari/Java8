package org.example.streams.Strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String name="NITIN";

        name.chars().distinct().mapToObj(s->String.valueOf((char) s)).forEach(p-> System.out.print(p + " "));

        System.out.println();


        name.chars().
                distinct()
                .mapToObj(c->String.valueOf((char)c))
                .forEach(s-> System.out.println(s));
    }
}
