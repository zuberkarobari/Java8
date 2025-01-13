package org.example.java8;

public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle=()-> System.out.println("This is a Rectangle ");
        Shape square=()-> System.out.println("This is a SQUARE ");
        print(()->System.out.println("This is a Rectangle PRINTED THROUGH REFERENCE"));
        rectangle.draw();
        square.draw();
    }

    public static void print(Shape shape){
        shape.draw();
    }
}
@FunctionalInterface
interface Shape{
     void draw();
}

