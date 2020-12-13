package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Quick implements ISorter {

    @Override
    public String description() {
        return "Quick Sort Sıralama Algoritması";
    }

    @Override
    public void execute(int[] array) {
        sort(array, 0, array.length - 1);
    }


    static void sort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int middle = arr[(low + high) / 2];
        while (i <= j) {
            while (arr[i] < middle) {
                i++;
            }
            while (arr[j] > middle) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        if (low < j) {
            sort(arr, low, j);
        }
        if (i < high) {
            sort(arr, i, high);
        }
    }
}