package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Selection implements ISorter {
    private long counter = 0;

    @Override
    public String description() {
        return "Selection Sıralama Algoritması";
    }

    @Override
    public long loopCounter() {
        return counter;
    }

    @Override
    public void execute(int[] array) {
        int i, j;
        int MinValue, TempValue;

        for (i = 0; i < array.length - 1; i++) {
            MinValue = i;

            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[MinValue]) {
                    MinValue = j;
                }
                counter++;
            }

            TempValue = array[i];
            array[i] = array[MinValue];
            array[MinValue] = TempValue;
            counter++;
        }

    }
}
