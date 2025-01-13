package org.example;

import org.example.streams.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.example.streams.FunctionDemo.functionExample;
import static org.example.streams.PredicateDemo.pradicateExample;
import static org.example.streams.Sorting.sorting;
import static org.example.streams.MapAndFlatMap.test;

public class Main {
    ArrayList al=new ArrayList<>();
    LinkedList k=new LinkedList<>();
    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 30, "HR", 50000.0, "alice@example.com"),
            new Employee(2, "Bob", 25, "IT", 60000.0, "bob@example.com"),
            new Employee(3, "Charlie", 35, "Finance", 70000.0, "charlie@example.com"),
            new Employee(4, "David", 28, "IT", 55000.0, "david@example.com"),
            new Employee(5, "Eve", 40, "HR", 65000.0, "eve@example.com"),
            new Employee(6, "Frank", 50, "Finance", 80000.0, "frank@example.com")
    );
    public static List<Employee> employeesMap = Arrays.asList(
            new Employee(1, "Alice", 30, "HR", 50000.0, "alice@example.com", Arrays.asList("Communication", "Recruitment")),
            new Employee(2, "Bob", 25, "IT", 60000.0, "bob@example.com", Arrays.asList("Java", "Spring", "Docker")),
            new Employee(3, "Charlie", 35, "Finance", 70000.0, "charlie@example.com", Arrays.asList("Communication", "Event Planning"))
    );
    public static void main(String[] args) {

        pradicateExample();

        functionExample();

        test();
        sorting();

    }
}