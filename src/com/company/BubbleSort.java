package com.company;

public class BubbleSort {

    public static int[] doBubbleSort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    General.swap(array, i, i + 1);
                }
            }
        }

        return array;
    }

}
