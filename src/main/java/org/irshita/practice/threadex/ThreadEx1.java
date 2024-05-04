package org.irshita.practice.threadex;

public class ThreadEx1 extends Thread {

   public void run(){
        for(int i=1; i<10; i++){
            System.out.println("Child Thread...");
        }
    }

    public static void main(String[] args) {
        ThreadEx1 thread = new ThreadEx1();
        thread.start();
    }
}
