package com.app.singlton;

public class SingletonEggerInitialization {

    private static final SingletonEggerInitialization singletonEggerInitialization = new SingletonEggerInitialization();

    private SingletonEggerInitialization() {

    }

    public static SingletonEggerInitialization getInstance() {
        return singletonEggerInitialization;
    }

}
