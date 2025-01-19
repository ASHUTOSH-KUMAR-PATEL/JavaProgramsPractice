package com.app.singlton;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization singletonLazyInitialization;

    private SingletonLazyInitialization() {

    }

    public static SingletonLazyInitialization getInstance() {
        if (singletonLazyInitialization == null) {
            singletonLazyInitialization = new SingletonLazyInitialization();
        }
        return singletonLazyInitialization;
    }

}
