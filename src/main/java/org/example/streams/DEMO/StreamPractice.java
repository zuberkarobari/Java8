package org.example.streams.DEMO;// Java 8 Stream Practice Problems

import java.util.*;
import java.util.stream.*;

public class StreamPractice {

    // 1. Find even numbers from a list
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // 2. Convert a list of strings to uppercase
    public static List<String> convertToUpper(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // 3. Find the first non-repeating character in a string
    public static Optional<Character> firstNonRepeatingChar(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst();
    }

    // 4. Sum of squares of numbers in a list
    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
    }

    // 5. Group strings by their length
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    // 6. Partition a list of integers into even and odd
    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }

    // 7. Find the longest string in a list
    public static Optional<String> findLongestString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length));
    }

    // 8. Count occurrences of each word in a list
    public static Map<String, Long> countWordOccurrences(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }

    // 9. Flatten a list of lists into a single list
    public static List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    // 10. Remove duplicate integers from a list
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 11. Find the highest and lowest number in a list
    public static OptionalInt findHighest(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).max();
    }

    public static OptionalInt findLowest(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).min();
    }

    // 12. Check if all numbers in a list are even
    public static boolean areAllEven(List<Integer> numbers) {
        return numbers.stream().allMatch(n -> n % 2 == 0);
    }

    // 13. Check if any number in a list is negative
    public static boolean containsNegative(List<Integer> numbers) {
        return numbers.stream().anyMatch(n -> n < 0);
    }

    // 14. Find the sum of all odd numbers in a list
    public static int sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 15. Concatenate strings in a list with a delimiter
    public static String joinStrings(List<String> strings, String delimiter) {
        return strings.stream()
                .collect(Collectors.joining(delimiter));
    }

    // 16. Find the average of a list of integers
    public static OptionalDouble findAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    // 17. Filter strings that start with a specific character
    public static List<String> filterByStartingChar(List<String> strings, char c) {
        return strings.stream()
                .filter(s -> s.startsWith(String.valueOf(c)))
                .collect(Collectors.toList());
    }

    // 18. Find the 2 largest number in a list
    public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // 19. Convert a list of integers to a comma-separated string
    public static String convertToCommaSeparated(List<Integer> numbers) {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    // 20. Find duplicate elements in a list
    public static Set<Integer> findDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .collect(Collectors.toSet());
    }

    // 21. Skip the first n elements of a list
    public static List<Integer> skipElements(List<Integer> numbers, int n) {
        return numbers.stream()
                .skip(n)
                .collect(Collectors.toList());
    }

    // 22. Limit a stream to the first n elements
    public static List<Integer> limitElements(List<Integer> numbers, int n) {
        return numbers.stream()
                .limit(n)
                .collect(Collectors.toList());
    }

    // 23. Sort a list of strings in reverse order
    public static List<String> reverseSortStrings(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // 24. Filter numbers greater than a threshold
    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    // 25. Find the product of all numbers in a list
    public static int productOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    // 26. Check if a list contains only unique elements
    public static boolean hasUniqueElements(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .count() == numbers.size();
    }

    // 27. Find the longest word in a list of strings
    public static Optional<String> findLongestWord(List<String> words) {
        return words.stream()
                .max(Comparator.comparingInt(String::length));
    }

    // 28. Generate a list of even numbers from a range
    public static List<Integer> generateEvenNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    // 29. Count the number of vowels in a string
    public static long countVowels(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
    }

    // 30. Find the second-shortest string in a list
    public static Optional<String> findSecondShortest(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .skip(1)
                .findFirst();
    }

    // 31. Calculate the factorial of a number
    public static long factorial(int number) {
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }

    // 32. Generate Fibonacci series up to n terms
    public static List<Integer> generateFibonacci(int n) {
        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .map(fib -> fib[0])
                .collect(Collectors.toList());
    }

    // 33. Find the longest increasing subsequence in a list
    public static List<Integer> findLongestIncreasingSubsequence(List<Integer> numbers) {
        List<Integer> subsequence = new ArrayList<>();
        numbers.stream().reduce((a, b) -> {
            if (b > a) subsequence.add(b);
            return b;
        });
        return subsequence;
    }

    // 34. Replace each string in a list with its reverse
    public static List<String> reverseEachString(List<String> strings) {
        return strings.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
    }

    // 35. Find all substrings of a string
    public static List<String> findAllSubstrings(String str) {
        return IntStream.range(0, str.length())
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, str.length() + 1).mapToObj(j -> str.substring(i, j)))
                .collect(Collectors.toList());
    }

    // 36. Find the intersection of two lists
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    // 37. Sort strings by length, then alphabetically
    public static List<String> sortStrings(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

    // 38. Find numbers divisible by both 3 and 5
    public static List<Integer> divisibleByThreeAndFive(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .collect(Collectors.toList());
    }

    // 39. Generate a list of prime numbers in a range
    public static List<Integer> generatePrimes(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(StreamPractice::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int num) {
        return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(n -> num % n == 0);
    }

    // 40. Remove null values from a list
    public static List<String> removeNullValues(List<String> strings) {
        return strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    // 41. Calculate the sum of digits of each number in a list
    public static List<Integer> sumOfDigits(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Sample inputs
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "apple", "fig");
        String testString = "swiss";
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 5);

        // Test cases
        System.out.println("1. Even numbers: " + StreamPractice.findEvenNumbers(numbers));
        System.out.println("2. Uppercase strings: " + StreamPractice.convertToUpper(strings));
        System.out.println("3. First non-repeating character: " + StreamPractice.firstNonRepeatingChar(testString));
        System.out.println("4. Sum of squares: " + StreamPractice.sumOfSquares(numbers));
        System.out.println("5. Group by length: " + StreamPractice.groupByLength(strings));
        System.out.println("6. Partition even and odd: " + StreamPractice.partitionEvenOdd(numbers));
        System.out.println("7. Longest string: " + StreamPractice.findLongestString(strings));
        System.out.println("8. Word occurrences: " + StreamPractice.countWordOccurrences(strings));
        System.out.println("9. Flatten list of lists: " + StreamPractice.flattenListOfLists(listOfLists));
        System.out.println("10. Remove duplicates: " + StreamPractice.removeDuplicates(duplicateNumbers));
        System.out.println("11. Highest number: " + StreamPractice.findHighest(numbers));
        System.out.println("11. Lowest number: " + StreamPractice.findLowest(numbers));
        System.out.println("12. All even: " + StreamPractice.areAllEven(numbers));
        System.out.println("13. Contains negative: " + StreamPractice.containsNegative(numbers));
        System.out.println("14. Sum of odd numbers: " + StreamPractice.sumOfOddNumbers(numbers));
        System.out.println("15. Join strings: " + StreamPractice.joinStrings(strings, ", "));
        System.out.println("16. Average: " + StreamPractice.findAverage(numbers));
        System.out.println("17. Filter by starting char: " + StreamPractice.filterByStartingChar(strings, 'a'));
        System.out.println("18. Second largest: " + StreamPractice.findSecondLargest(numbers));
        System.out.println("19. Comma-separated: " + StreamPractice.convertToCommaSeparated(numbers));
        System.out.println("20. Duplicates: " + StreamPractice.findDuplicates(duplicateNumbers));
        System.out.println("21. Skip elements: " + StreamPractice.skipElements(numbers, 3));
        System.out.println("22. Limit elements: " + StreamPractice.limitElements(numbers, 5));
        System.out.println("23. Reverse sort: " + StreamPractice.reverseSortStrings(strings));
        System.out.println("24. Filter greater than 5: " + StreamPractice.filterGreaterThan(numbers, 5));
        System.out.println("25. Product of numbers: " + StreamPractice.productOfNumbers(numbers));
        System.out.println("26. Unique elements: " + StreamPractice.hasUniqueElements(duplicateNumbers));
        System.out.println("27. Longest word: " + StreamPractice.findLongestWord(strings));
        System.out.println("28. Even numbers in range: " + StreamPractice.generateEvenNumbers(1, 10));
        System.out.println("29. Vowel count: " + StreamPractice.countVowels(testString));
        System.out.println("30. Second shortest: " + StreamPractice.findSecondShortest(strings));
        System.out.println("31. Factorial of 5: " + StreamPractice.factorial(5));
        System.out.println("32. Fibonacci series: " + StreamPractice.generateFibonacci(10));
        System.out.println("33. Longest increasing subsequence: " + StreamPractice.findLongestIncreasingSubsequence(numbers));
        System.out.println("34. Reverse strings: " + StreamPractice.reverseEachString(strings));
        System.out.println("35. All substrings: " + StreamPractice.findAllSubstrings(testString));
        System.out.println("36. Intersection: " + StreamPractice.findIntersection(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 4, 5, 6)));
        System.out.println("37. Sort strings by length: " + StreamPractice.sortStrings(strings));
        System.out.println("38. Divisible by 3 and 5: " + StreamPractice.divisibleByThreeAndFive(numbers));
        System.out.println("39. Primes in range: " + StreamPractice.generatePrimes(1, 20));
        System.out.println("40. Remove nulls: " + StreamPractice.removeNullValues(Arrays.asList("apple", null, "banana", null, "cherry")));
        System.out.println("41. Sum of digits: " + StreamPractice.sumOfDigits(Arrays.asList(123, 456, 789)));
    }

}
