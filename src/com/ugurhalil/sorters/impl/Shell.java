package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Shell implements ISorter {

    @Override
    public String description() {
        return "Shell Sort";
    }

    @Override
    public void execute(int[] array) {
        int i, j, Increment, TempValue;

        Increment = 3;

        while (Increment > 0) {
            for (i = 0; i < array.length; i++) {
                j = i;
                TempValue = array[i];

                while ((j >= Increment) && (array[j - Increment] > TempValue)) {
                    array[j] = array[j - Increment];
                    j = j - Increment;
                }
                array[j] = TempValue;
            }

            if (Increment / 2 != 0) {
                Increment = Increment / 2;
            } else if (Increment == 1) {
                Increment = 0;
            } else {
                Increment = 1;
            }
        }

    }
}
