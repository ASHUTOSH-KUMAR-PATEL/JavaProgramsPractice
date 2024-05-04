package org.irshita.practice.inf;

public class Test123 implements TestFunctionalInter {

    @Override
    public void m2() {

    }

//    @Override
//    public void m3() {
//
//    }

   public static void main(String[] args) {
       TestFunctionalInter inter = ()-> System.out.println("SAM");
       Test123 test123 = new Test123();
       test123.defaultMethod();
       TestFunctionalInter.staticMethod();
       inter.m2();
   }

}
