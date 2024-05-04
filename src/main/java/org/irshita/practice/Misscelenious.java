package org.irshita.practice;

public class Misscelenious {

    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(null);//false;
        Boolean b2 = Boolean.valueOf(false);//false;

       /* Boolean b1 = new Boolean("null");//false;
        Boolean b2 = new Boolean(false);//false;*/

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
    }

}
