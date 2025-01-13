package org.example.streams.Strings;

// Base class or Parent class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    private void privateMethod() {
        System.out.println("Private method in Animal");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in Animal");
    }

    public final void finalMethod() {
        System.out.println("Final method in Animal");
    }

    public static void staticMethod() {
        System.out.println("Static method in Animal");
    }
}

// Derived class or Child class
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Calling parent class constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    @Override
    public void sound() {
        System.out.println(name + " barks");
    }

    // This method hides the static method from the parent class
    public static void staticMethod() {
        System.out.println("Static method in Dog");
    }

    // Uncommenting the below method will cause a compilation error because final methods cannot be overridden
    // @Override
    // public void finalMethod() {
    //     System.out.println("Cannot override final method in Animal");
    // }

    // Accessing protected method from parent class
    public void accessProtected() {
        protectedMethod();
    }

    // Attempting to override a private method will result in method hiding, not overriding
    private void privateMethod() {
        System.out.println("Private method in Dog");
    }
}

// Abstract class with abstract methods
abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    // Abstract method, must be implemented by subclasses
    public abstract void fly();
}

// Concrete class extending abstract class
class Sparrow extends Bird {

    public Sparrow(String name) {
        super(name);
        System.out.println("Sparrow constructor called");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies at low altitude");
    }

    @Override
    public void sound() {
        System.out.println(name + " chirps");
    }
}

// Interface with default methods
interface Pet {
    void play();

    // Default method in an interface
    default void care() {
        System.out.println("General pet care");
    }
}

// Class implementing an interface
class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor called");
    }

    @Override
    public void sound() {
        System.out.println(name + " meows");
    }

    @Override
    public void play() {
        System.out.println(name + " plays with a ball");
    }

    // Overriding the default method from the interface
    @Override
    public void care() {
        System.out.println(name + " needs special care");
    }
}

// Test class to demonstrate inheritance concepts
public class InheritanceTest {

    public static void main(String[] args) {
        // Basic Inheritance and Constructor Chain
//        Dog dog = new Dog("Buddy", "Golden Retriever");
//        dog.sound(); // Method Overriding
//        dog.accessProtected(); // Accessing protected method
//        Dog.staticMethod(); // Static method hiding
//        dog.finalMethod(); // Calling final method

       //  Abstract Class and Method Overriding
//        Sparrow sparrow = new Sparrow("Jack");
//        sparrow.fly();
//        sparrow.sound();
//
//        // Interface Implementation and Default Methods
//        Cat cat = new Cat("Whiskers");
//        cat.sound();
//        cat.play();
//        cat.care(); // Overriding default method
//
//        // Polymorphism: Upcasting and Downcasting
//        Animal animal = new Dog("Rocky", "Labrador");
//        animal.sound(); // Runtime polymorphism (method overriding)
//
//        // Downcasting
//        if (animal instanceof Dog) {
//            Dog specificDog = (Dog) animal;
//            specificDog.accessProtected();
//        }

        // Uncomment the line below to see the effect of trying to override a private method
        // dog.privateMethod(); // Calls Dog's privateMethod
    }
}
