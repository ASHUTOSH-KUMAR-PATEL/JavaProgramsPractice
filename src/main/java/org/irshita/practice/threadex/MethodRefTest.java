package org.irshita.practice.threadex;

class MethodRefExample {
    public static void m1(){
        for(int i=0; i<=10; i++){
            System.out.println("Child Thread");
        }
    }
}

public class MethodRefTest {
    public static void main(String[] args) {

        Runnable r = MethodRefExample::m1;

        Thread thread = new Thread(r);
        for(int i=1; i<=10; i++){
            System.out.println("Main Thread");
        }

        thread.start();
    }
}
