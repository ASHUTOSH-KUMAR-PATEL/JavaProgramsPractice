package org.irshita.practice;

public class RemoveDuplicateChar {

    public static void main(String[] args) {

        String input = "hello";
        String output = removeDuplicateCharacter(input);
        System.out.println("Output :: "+output);

    }

    private static String removeDuplicateCharacter(String input) {
        boolean[] seen = new boolean[256];
        StringBuilder builder = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(!seen[ch]){
                seen[ch] = true;
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
