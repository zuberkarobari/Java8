package org.example.streams.Strings;



public class CountOfLastWord {

    public static void main(String[] args) {
        String str="Hello Karobari";
        str=str.trim();
       int i = str.trim().indexOf(" ");
        System.out.println(str.length() - i - 1 );

        System.out.println("*********************");
        // Trim the string to remove leading and trailing spaces
        String trimmedStr = str.trim();

// Split the string by spaces into an array of words
        String[] words = trimmedStr.split("\\s+");

// Get the last word from the array
        String lastWord = words[words.length - 1];

// Get the count of characters in the last word
        long count = lastWord.chars().count();

// Print the last word and its character count
        System.out.println("Last word: " + lastWord);
        System.out.println("Character count of last word: " + count);

    }
}
