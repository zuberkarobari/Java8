package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataProvider {
    public static List<Employee> getEmployeeList() {
        return Arrays.asList(
            new Employee(1, "Alice", 30, "HR", 55000, "alice@example.com", Arrays.asList("Recruitment", "Training", "Conflict Resolution")),
            new Employee(2, "Bob", 35, "Engineering", 70000, "bob@example.com", Arrays.asList("Java", "Spring Boot", "Microservices")),
            new Employee(3, "Charlie", 28, "Engineering", 75000, "charlie@example.com", Arrays.asList("Java", "Spring Boot", "Docker")),
            new Employee(4, "David", 40, "Sales", 60000, "david@example.com", Arrays.asList("Client Management", "Negotiation", "Sales Strategy")),
            new Employee(5, "Eve", 32, "HR", 56000, "eve@example.com", Arrays.asList("Recruitment", "Onboarding", "Employee Engagement")),
            new Employee(6, "Frank", 45, "Engineering", 80000, "frank@example.com", Arrays.asList("Java", "Spring Boot", "Cloud Computing")),
            new Employee(7, "Grace", 29, "Sales", 58000, "grace@example.com", Arrays.asList("Client Relations", "Sales Reporting", "Market Research"))
        );
    }
}
