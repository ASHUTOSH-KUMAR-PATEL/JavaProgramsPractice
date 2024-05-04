package org.irshita.practice;

public class DivisibleByThreeAndFive {

    public static void main(String[] args) {
        // Iterate through numbers from 0 to 100
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i +", "); // divisible by both 3 and 5
            } else if (i % 3 == 0) {
                System.out.print(i+", "); // divisible by 3
            } else if (i % 5 == 0) {
                System.out.print(i+", "); // divisible by 5
            } else {
                //System.out.print(i); // not divisible by 3 or 5
            }
        }
    }

}
