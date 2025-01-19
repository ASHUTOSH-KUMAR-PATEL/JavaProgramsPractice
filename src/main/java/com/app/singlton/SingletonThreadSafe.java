package com.app.singlton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe() {

    }

    synchronized public static SingletonThreadSafe getInstance() {

        if (singletonThreadSafe == null) {
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }

}
