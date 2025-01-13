package org.example.streams;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String email;
    private List<String> skills;

    public Employee(int id, String name, int age, String department, double salary, String email, List<String> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Employee(int id, String name, int age, String department, double salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.email = email;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}

