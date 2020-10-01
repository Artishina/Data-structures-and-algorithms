package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, -11, 43, 2, -22, 9};

        BubbleSort.doBubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
