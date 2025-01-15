package org.example.java8;
interface i{
    void m1();
    default void m2(){
        System.out.println("this is i , m2");
    }
}
interface  j{
    void m1();
    default void m2(){
        System.out.println("this is J , m2");
    }
}
public class InterfaceDemo implements i,j {
    @Override
    public void m1() {
        System.out.println("This is M1 method implementation by CLASS");
    }

    @Override
    public void m2() {
        i.super.m2();
    }


    public static void main(String[] args) {

        InterfaceDemo id=new InterfaceDemo();
        id.m1();
        id.m2();

    }

}
