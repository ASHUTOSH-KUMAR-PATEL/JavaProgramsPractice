package org.irshita.practice;

import java.util.Arrays;

public class AnagramProgram {

    public static void main(String[] args) {
        isAnagram("Hello", "Welcome");
        isAnagram("ACD", "DCA");
    }

    private static void isAnagram(String s1, String s2) {

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        boolean flag = true;

        if(str1.length() != str2.length()){
            flag = false;
        } else {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            flag = Arrays.equals(c1, c2);
        }

        if(flag){
            System.out.println(str1 +" And "+str2 +" is Anagram");
        } else {
            System.out.println(str1 +" And "+str2 +" is not Anagram");
        }
    }

}
