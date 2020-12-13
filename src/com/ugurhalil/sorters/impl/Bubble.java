package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Bubble implements ISorter {

    @Override
    public String description() {
        return "Bubble Sort";
    }

    @Override
    public void execute(int[] array) {
        int i;
        int j;
        int TempValue;

        for (i = (array.length - 1); i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                if (array[j - 1] > array[j]) {
                    TempValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = TempValue;
                }
            }
        }
    }
}
