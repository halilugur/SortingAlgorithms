package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Insertion implements ISorter {

    @Override
    public String description() {
        return "Insertion Sort";
    }

    @Override
    public void execute(int[] array) {
        int i;
        int j;
        int IndexValue;

        for (i = 1; i < array.length; i++) {
            IndexValue = array[i];
            j = i;

            while ((j > 0) && (array[j - 1] > IndexValue)) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = IndexValue;
        }
    }
}
