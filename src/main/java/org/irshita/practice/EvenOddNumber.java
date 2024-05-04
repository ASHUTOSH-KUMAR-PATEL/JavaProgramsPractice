package org.irshita.practice;

public class EvenOddNumber {

    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=20; i=i+2){
                    synchronized (lock){
                        System.out.println(" "+i);
                        try{
                            Thread.sleep(1000);
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException ex){
                            ex.getLocalizedMessage();
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=2; i<=22; i=i+2){
                    synchronized (lock){
                       System.out.println(" "+i);
                        try{
                            lock.notify();

                            /*if(i == 20){
                                break;
                            }*/
                            Thread.sleep(1000);
                            lock.wait();

                        } catch (InterruptedException e) {
                            e.getLocalizedMessage();
                        }
                    }
                }
            }
        });

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
