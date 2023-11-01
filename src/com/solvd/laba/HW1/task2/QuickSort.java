package com.solvd.laba.HW1.task2;

public class QuickSort {
    private int[] array;

    public int[] quickSort(int[] array, int lowIndex, int highIndex){

        if(lowIndex >= highIndex) return array;
        int pivotIndex = highIndex;
        int pivot = array[pivotIndex];

        int left = lowIndex;
        int right = highIndex;

        while (left<right){
            while (array[left] <= pivot && left<right){
                left++;
            }
            while (array[right] >= pivot && left<right){
                right--;
            }
            swap(array, left, right);
        }
        swap(array, left, pivotIndex);

        quickSort(array, lowIndex, left-1);
        quickSort(array, left+1, highIndex);

        return array;
    }
    public void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] =  temp;
    }
}

