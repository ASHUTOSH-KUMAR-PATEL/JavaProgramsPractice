package org.irshita.practice;

public class SortTheGivenArray {

    public static void main(String[] args) {

        int[] array = {0, 5, 0, 3, 0, 8, 0, 1};
        sortArray(array);
        for(int num : array){
            System.out.print(num +" ");
        }
    }

    private static void sortArray(int[] array) {

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){

                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }
        }
    }
}
