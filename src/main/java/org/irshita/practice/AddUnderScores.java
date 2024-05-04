package org.irshita.practice;

public class AddUnderScores {

    public static void main(String[] args) {
        String input = "thisIsAVariable";
        String output = addUnderScoreOrSnake(input);
        System.out.println("Output :: "+output);
    }

    private static String addUnderScoreOrSnake(String input) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char currentChar = input.charAt(i);

            if(Character.isUpperCase(currentChar)){
                if(i > 0){
                    builder.append('_');
                }
                builder.append(Character.toLowerCase(currentChar));
            } else {
                builder.append(currentChar);
            }
        }
        return builder.toString();
    }
}
