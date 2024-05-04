package org.irshita.practice;

public class RemoveDupCharactore {

    public static void main(String[] args) {
        String input = "aaigfdhhkssgww";
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<input.length(); i++){

            char currentChar = input.charAt(i);
            builder.append(currentChar);

            if(i < input.length()-1 && currentChar == input.charAt(i+1)){
                i++;
            }
        }
        System.out.println(builder);
    }
}
