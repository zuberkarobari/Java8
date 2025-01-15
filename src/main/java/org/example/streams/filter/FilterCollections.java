package org.example.streams.filter;

import org.example.streams.Employee;
import org.example.streams.EmployeeDataProvider;

import java.util.*;
import java.util.stream.Collectors;

public class FilterCollections {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, -3, 4, -5, 6,1,2);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        System.out.println(" Problem 1: Filter even numbers");
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n->n%2==0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        System.out.println("________________________________________________________");
        
        System.out.println("Problem 2: Filter strings longer than 5 characters");
        List<String> longNames = names.stream()
                                      .filter(str->str.toCharArray().length>5)
                                      .collect(Collectors.toList());
        System.out.println("Long Names: " + longNames);



        System.out.println("________________________________________________________");

        List<Integer> postiveNumber =
                numbers.stream()
                .filter(n->n>=0).collect(Collectors.toList());
        System.out.println("Postive Number : "+postiveNumber);


        System.out.println("________________________________________________________");
        List<Integer> duplicateNumber=numbers.stream().distinct().collect(Collectors.toList());
        List<Integer> duplicateNumber2=
                numbers.stream()
                        .filter(new HashSet<Integer>()::add)
                        .collect(Collectors.toList());
        System.out.println("duplicateNumber : "+duplicateNumber);
        System.out.println("duplicateNumber other method ::: "+duplicateNumber2);


        System.out.println("________________________________________________________");
        //        Filter objects based on a property (e.g., employees with salary > 50k).
        List<Employee> employees=EmployeeDataProvider.getEmployeeList();

        System.out.println("Employee with 50K above sallary are : ");
        employees.stream().filter(employee ->employee.getSalary()>=50000).forEach(p-> System.out.println(p));

        System.out.println("________________________________________________________");
        System.out.println("Filter a list of names that start with a specific letter 'A'.");
        System.out.println("________________________________________________________");
        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(name-> System.out.println(name));

        System.out.println("________________________________________________________");

        System.out.println("Filter a list of ages, keeping only those within a 45- 50 range.");
        System.out.println("________________________________________________________");
        employees.stream()
                .filter(employee -> employee.getAge()>=45 && employee.getAge()<=50)
                .forEach(e-> System.out.println(e));

    }
}
