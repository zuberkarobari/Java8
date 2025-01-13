package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Main.employees;
import static org.example.Main.employeesMap;

public class MapAndFlatMap {



    public static void test() {
        //employees.stream().filter(dep -> dep.getDepartment().equals("IT")).forEach(p -> System.out.println(p));
        employees.stream().filter(sal -> sal.getSalary() <= 60000).forEach(p-> System.out.println(p));
        employees.stream().filter(sal -> sal.getSalary() <= 60000).map(i -> i.getSalary() + 20000).collect(Collectors.toList()).forEach(p -> System.out.println(p));
        System.out.println("All skills: " );
        List<String> allSkills = employeesMap.stream()
                .flatMap(employe -> employe.getSkills().stream())
                .collect(Collectors.toList());
        allSkills.forEach(skill -> System.out.println("Skill: " + skill));

        System.out.println("All skills: " + allSkills);

    }
}
