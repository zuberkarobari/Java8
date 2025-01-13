package org.example.streams;

class Parent {
    // Instance block in Parent class
    {
        System.out.println("Parent Instance Block");
    }

    // Constructor in Parent class
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    // Instance block in Child class
    {
        System.out.println("Child Instance Block");
    }

    // Constructor in Child class
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Testing {
    public static void main(String[] args) {
        new Child(); // Creating an instance of Child
    }
}
