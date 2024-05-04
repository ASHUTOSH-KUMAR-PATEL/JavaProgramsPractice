package org.irshita.practice;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {

    public static void main(String[] args) {
        
        String str = "aabbccddeeffg";
        char firstNonRepeating = findFirstNonreapeatedChar(str);
        System.out.println(firstNonRepeating);
        
    }

    private static char findFirstNonreapeatedChar(String str) {

        Map<Character, Integer> frequencyOfKeyMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            frequencyOfKeyMap.put(ch, frequencyOfKeyMap.getOrDefault(ch, 0)+1);
        }

        for(char ch : str.toCharArray()){
            if(frequencyOfKeyMap.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }
}
