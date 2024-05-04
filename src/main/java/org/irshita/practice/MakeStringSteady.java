package org.irshita.practice;

public class MakeStringSteady {

    public static void main(String[] args) {
        String input = "aaabbbbcccddeee";
        int steadyLength = makeStringSteady(input);
        System.out.println("Original String: " + input);
        System.out.println("Length of Steady String: " + steadyLength);
    }

    public static int makeStringSteady(String str) {
        if (str == null || str.length() <= 1) {
            return str == null ? 0 : str.length(); // Return 0 for null string, or length of string if it's not null
        }

        int steadyLength = 1; // Initialize the length of the steady string to 1 (at least one character will be present)

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the current character

            // If the current character is different from the previous character, increment the length of the steady string
            if (currentChar != str.charAt(i - 1)) {
                steadyLength++;
            }
            // If the current character is the same as the previous character, skip it
        }

        return steadyLength; // Return the length of the steady string
    }

}
