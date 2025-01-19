package com.app.singlton;

public class SingletonMain {

    public static void main(String[] args) {

        SingletonEggerInitialization singletonEggerInitialization1 = SingletonEggerInitialization.getInstance();
        SingletonEggerInitialization singletonEggerInitialization2 = SingletonEggerInitialization.getInstance();

        System.out.println(singletonEggerInitialization1.hashCode());
        System.out.println(singletonEggerInitialization2.hashCode());

        SingletonLazyInitialization singletonLazyInitialization1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();

        System.out.println(singletonLazyInitialization1.hashCode());
        System.out.println(singletonLazyInitialization2.hashCode());

        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

        System.out.println(singletonThreadSafe1.hashCode());
        System.out.println(singletonThreadSafe2.hashCode());

        SingletonDoubleCheck singletonDoubleCheck1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck2 = SingletonDoubleCheck.getInstance();

        System.out.println(singletonDoubleCheck1.hashCode());
        System.out.println(singletonDoubleCheck2.hashCode());

    }

}
