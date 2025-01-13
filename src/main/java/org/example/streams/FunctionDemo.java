package org.example.streams;

import java.util.function.Function;
import static org.example.Main.employees;

public class FunctionDemo {
    Employee employee= new Employee(2, "Bob", 25, "IT", 60000.0, "bob@example.com");

    public static void functionExample(){
        System.out.println("***FUNCTION***");
        System.out.println("Function is a functional interface introduced in Java 8 that represents a function that accepts one argument and produces a result. It is often used for mapping or transforming objects.");
        System.out.println("__________________________________________________________________________________________________________________");


        Function<String,String> funcion=emp->emp.toUpperCase();
        System.out.println("Function takes one thing and conver it into another thing ex : input : zuber karobari , output : "+funcion.apply("zuber karobari"));
        Function<Employee, String> employeeToString = e -> "Name: " + e.getName() + ", Department: " + e.getDepartment();

        // Use the Function to transform and print each employee
        employees.stream()
                .map(employeeToString)
                .forEach(System.out::println);

        System.out.println("__________________________________________________________________________________________________________________");


    }

}
