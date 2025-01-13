package org.example.streams;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import static org.example.Main.employees;

public class PredicateDemo {

    public static void pradicateExample(){
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println("PREDICATE : ");
        System.out.println("Predicate is a functional interface introduced in Java 8 that represents a single argument function");
        System.out.println("that returns a boolean value. It is often used for filtering collections of objects.");
        System.out.println("__________________________________________________________________________________________________________________");
        //Filter
        Employee employee=new Employee(1, "Alice", 30, "HR", 50000.0, "alice@example.com");
        Predicate<Employee> predicate=emp->emp.getSalary()>=30000;
        System.out.println("Predicate : "+predicate.test(employee));

        Predicate<Employee> predicate2=emp->emp.getSalary()>=30000&&emp.getDepartment().equals("HR");
        System.out.println("Predicate with combined condition : "+predicate2.test(employee));

        Predicate<Employee> predicate3=emp->emp.getSalary()>=80000&&emp.getDepartment().equals("HR");
        System.out.println("Predicate with combined condition : "+predicate3.test(employee));
        employees.stream()
                .filter(emp->emp.getDepartment().equals("IT"))
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

    }

}
