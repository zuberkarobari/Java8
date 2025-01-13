package org.example.streams;

public class Calculators {
    public static void main(String[] args) {
        Calculator add=(double a,double b)->  (a+b);

        System.out.println("given two Numbers Operations Results are as below \n" +
                "Addition : " + add.calculate(10.25,20));

        Calculator subtract=(double a,double b)->  (a-b);
        System.out.println("Subtract : " +subtract.calculate(10.25,20));

        Calculator mul=(double a,double b)->  (a * b);
        System.out.println("Multiplication  : " +mul.calculate(10.25,20));
    }

}
@FunctionalInterface
interface Calculator {
    Double calculate(double i1 , double i2);
}