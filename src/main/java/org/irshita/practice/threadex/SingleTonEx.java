package org.irshita.practice.threadex;

public class SingleTonEx {

    //Lazy Instantiation singleton creation
    private static SingleTonEx singleTonEx = null;
    private String s;
    private SingleTonEx(){
        s = "Hello I am String part of Singleton class";
    }

    public static synchronized SingleTonEx getInstance(){
        if(singleTonEx == null){
            singleTonEx = new SingleTonEx();
        }
        return singleTonEx;
    }

    public static void main(String[] args) {
        SingleTonEx singleTonEx1 = SingleTonEx.getInstance();
        SingleTonEx singleTonEx2 = SingleTonEx.getInstance();
        SingleTonEx singleTonEx3 = SingleTonEx.getInstance();

        System.out.println(singleTonEx1.hashCode());
        System.out.println(singleTonEx2.hashCode());
        System.out.println(singleTonEx3.hashCode());

        if(singleTonEx1 == singleTonEx2 && singleTonEx2 == singleTonEx3){
            System.out.println("Singleton with same hashcode");
        } else {
            System.out.println("Singleton with different hashcode");
        }
    }

}
