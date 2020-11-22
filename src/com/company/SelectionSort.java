package com.company;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
        lastUnsortedIndex --) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                   if (array[i] > array[largest]) {
                       largest = i;
                   }
            }
            General.swap(array, largest, lastUnsortedIndex);
        }

        return array;

    }
}
