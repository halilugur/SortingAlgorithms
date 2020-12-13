package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Heap implements ISorter {

    @Override
    public String description() {
        return "Heap Sıralama Algoritması";
    }

    @Override
    public void execute(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--){
            adjust(array, i, array.length - 1);
        }

        for (int i = array.length - 1; i >= 1; i--) {
            int Temp = array[0];
            array[0] = array[i];
            array[i] = Temp;
            adjust(array, 0, i - 1);
        }
    }

    private void adjust(int[] array, int i, int m) {
        int TempValue = array[i];
        int j = i * 2 + 1;

        while (j <= m) {
            if (j < m)
                if (array[j] < array[j + 1])
                    j = j + 1;

            if (TempValue < array[j]) {
                array[i] = array[j];
                i = j;
                j = 2 * i + 1;
            } else {
                j = m + 1;
            }
        }

        array[i] = TempValue;
    }
}
