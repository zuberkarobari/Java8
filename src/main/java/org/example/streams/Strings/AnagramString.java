package org.example.streams.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramString {

    //abc , cba

    private static boolean isAnagram(String s1, String s2){

        if (s1.length()!=s2.length()){
            return false;
        }
        char[] charArray1=s1.toCharArray();
        char[] charArray2=s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {
        if (isAnagram("abc","cab")){
            System.out.println("Both the strings are Anagram");
        }else {
            System.out.println("are not Anagram");
        }
    }
}
