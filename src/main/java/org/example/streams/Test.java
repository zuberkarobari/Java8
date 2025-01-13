package org.example.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Test {
    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 30, "HR", 50000.0, "alice@example.com"),
            new Employee(2, "Bob", 25, "IT", 60000.0, "bob@example.com"),
            new Employee(3, "Charlie", 35, "Finance", 70000.0, "charlie@example.com"),
            new Employee(4, "David", 28, "IT", 55000.0, "david@example.com"),
            new Employee(5, "Eve", 40, "HR", 65000.0, "eve@example.com"),
            new Employee(6, "Frank", 50, "Finance", 80000.0, "frank@example.com")
    );


    public static void main(String[] args) {

        Comparator c=Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeeMap= (Map<String, Optional<Employee>>) employees.stream()
                .collect(
                        groupingBy(Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(c)))
                );
        System.out.println(employeeMap.values());
    }

}
