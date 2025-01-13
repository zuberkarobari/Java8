package org.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.example.Main.employees;

public class Sorting {

    public  static void sorting(){
        System.out.println("ASCENDING");
        employees.stream().sorted((e1,e2)-> (int) (e2.getSalary() - e1.getSalary())).forEach(p-> System.out.println(p));
        System.out.println("DESCENDING");
        employees.stream().sorted((e1,e2)-> (int) (e1.getSalary() - e2.getSalary())).forEach(p-> System.out.println(p));

        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("Sorted by salary: " + sortedBySalary);

        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(p-> System.out.println(p));
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(p-> System.out.println(p));

        System.out.println("sortedByAge");
        List<Employee> sortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);

        System.out.println("sortedByDepartment");
        List<Employee> sortedByDepartment = employees.stream()
                .sorted((e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment()))
                .collect(Collectors.toList());
        System.out.println(sortedByDepartment);

        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(p-> System.out.println(p));
        System.out.println("Get second highest sallary"
                +employees.stream().
                sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst().get());
        Optional<Employee> secondHighestSalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort in descending order
                .skip(1) // Skip the first highest salary
                .findFirst(); // Get the second highest salary

        secondHighestSalary.ifPresent(System.out::println); // Print if present


        System.out.println(" IT MEMEBERS ARE : "+employees.stream().filter(f->f.getDepartment().equals("IT")).count());
    }
}
