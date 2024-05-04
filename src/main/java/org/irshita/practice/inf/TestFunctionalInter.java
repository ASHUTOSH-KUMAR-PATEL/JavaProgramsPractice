package org.irshita.practice.inf;

//@FunctionalInterface
public interface TestFunctionalInter {

    void m2();

    //void m3();

    default void defaultMethod(){
        System.out.println("Default method");
    }

    static void staticMethod(){
        System.out.println("static method");
    }

}
