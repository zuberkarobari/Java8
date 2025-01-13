package org.example.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpandString {
    public static void main(String[] args) {
        String input = "z1u2b3e4r5";
        
        String output = IntStream.range(0, input.length() / 2)
                .mapToObj(i -> repeatCharacter(input.charAt(i * 2), Character.getNumericValue(input.charAt(i * 2 + 1))))
                .collect(Collectors.joining());

        System.out.println(output);  // Output: wwwaasddddfffff
    }

    private static String repeatCharacter(char c, int count) {
        return IntStream.range(0, count)
                .mapToObj(i -> String.valueOf(c))
                .collect(Collectors.joining());
    }
}
