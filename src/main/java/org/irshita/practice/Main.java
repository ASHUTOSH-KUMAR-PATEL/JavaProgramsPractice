package org.irshita.practice;

public class Main {
    public static void main(String[] args) {
       /* String s1 = "";

        for(int i=0; i<1000; i++) {
            s1 += "Hello";
        }
        System.out.printf(s1);*/

        /*String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "Number: " + i + "\n"; // String concatenation
        }
        System.out.println(result);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append("Number: ").append(i).append("\n");
        }
        String result2 = builder.toString();
        System.out.println(result2);*/

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("Number: ").append(i).append("\n");
            System.out.println();
        }
        String result3 = stringBuffer.toString();
        System.out.println(result3);
    }
}