package org.example;

import java.util.*;
import java.util.function.*;

public class LambdaExpressionsDemo {

    public static void main(String[] args) {

        // 1. Basic Lambda Expression
        Runnable sayHello = () -> System.out.println("Hello, Lambda!");
        sayHello.run();

        // 2. Lambda with Parameters and Return Values
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(5, 3));

        // 3. Built-in Functional Interfaces
        // Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        
        // Consumer
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Using Consumer interface");

        // Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());

        // 4. Lambda with Collections
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Zara");
        
        // Iterating
        System.out.println("Names in the list:");
        names.forEach(name -> System.out.println(name));

        // Sorting
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);

        // 5. Lambda with Streams API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        // Filtering
        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Mapping
        System.out.println("Square of Numbers:");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        // Reducing
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);

        // 6. Method References
        // Static Method Reference
        Consumer<String> staticPrinter = System.out::println;
        staticPrinter.accept("This is a static method reference!");

        // Instance Method Reference
        names.forEach(System.out::println);

        // Constructor Reference
        Supplier<ArrayList<String>> newList = ArrayList::new;
        ArrayList<String> createdList = newList.get();
        createdList.add("Example");
        System.out.println("New List: " + createdList);

        // 7. Custom Functional Interface
        @FunctionalInterface
        interface Greeting {
            String greet(String name);
        }
        Greeting customGreet = name -> "Hello, " + name + "!";
        System.out.println(customGreet.greet("Zuber"));

        // 8. Nested Lambda Expressions
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        BiFunction<BiFunction<Integer, Integer, Integer>, Integer, Integer> applyTwice = 
            (operation, value) -> operation.apply(value, value);
        System.out.println("Result of applying multiplication twice: " + applyTwice.apply(multiply, 3));
    }
}
