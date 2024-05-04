package org.irshita.practice;

public class RemoveAllDuplicateCharcter {

    public static void main(String[] args) {
        String str = "ilovemyindia";

        String duplicateChar = findDuplicateCharacters(str);

        System.out.println("Duplicate Character : "+ duplicateChar);
    }

    private static String findDuplicateCharacters(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder builder = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!seen[ch]){
                seen[ch] = true;
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
