package com.solvd.laba.home_work1.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        QuickSort first = new QuickSort();
        first.quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));

    }

}

