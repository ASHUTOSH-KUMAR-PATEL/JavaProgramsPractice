package org.irshita.practice;

public class MoveAllZerosInStart {

    public static void main(String[] args) {
        int[] array = {0, 5, 0, 3, 0, 8, 0, 1};
        moveZerosToFront(array);
        for(int num : array){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("===============");
        moveZerosToLast(array);
        for(int num : array){
            System.out.print(num +" ");
        }
    }

    private static void moveZerosToFront(int[] array) {
        int nextZeroIndex = array.length-1;

        for(int i=array.length-1; i>=0; i--){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[nextZeroIndex];
                array[nextZeroIndex] = temp;

                nextZeroIndex--;
            }
        }
    }

    private static void moveZerosToLast(int[] array) {
        int nextZeroIndex = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[nextZeroIndex];
                array[nextZeroIndex] = temp;
                nextZeroIndex++;
            }
        }
    }
}
