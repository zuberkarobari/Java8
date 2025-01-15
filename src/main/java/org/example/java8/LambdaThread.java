package org.example.java8;

public class LambdaThread {

    public static void main(String[] args) {

        Runnable run=()->{
           try {
                for (int i =0;i<=50;i++){
                    System.out.println(i);
                    Thread.sleep(1000); // Sleep for 100 milliseconds
                    System.out.println(Thread.getAllStackTraces());
                    Thread.getAllStackTraces();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        };
        for (int i = 0; i <= 50; i++) {
            System.out.println("*");
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }

        Thread t=new Thread(run);
        t.start();
    }
}
