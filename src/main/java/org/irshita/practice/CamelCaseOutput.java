package org.irshita.practice;

public class CamelCaseOutput {

    public static void main(String[] args) {
        String input = "this_is_a_variable";
        String output = convertToCamelCase(input);
        System.out.println(output); // Output: thisIsAVariable
    }

    public static String convertToCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("_");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                // Leave the first word unchanged
                result.append(word);
            } else {
                // Capitalize the first character of subsequent words
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1));
                }
            }
        }
        return result.toString();
    }
}
