package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Quick implements ISorter {
    private int counter = 0;

    @Override
    public String description() {
        return "Quick Sort Sıralama Algoritması";
    }

    @Override
    public int loopCounter() {
        return counter;
    }

    @Override
    public void execute(int[] array) {
        Sort(0, array.length - 1, array);
    }

    private void Sort(int LeftValue, int RightValue, int[] Array) {
        int PivotValue, LeftHoldValue, RightHoldValue;

        LeftHoldValue = LeftValue;
        RightHoldValue = RightValue;
        PivotValue = Array[LeftValue];

        while (LeftValue < RightValue) {
            while ((Array[RightValue] >= PivotValue) && (LeftValue < RightValue)) {
                RightValue--;
                counter++;
            }

            if (LeftValue != RightValue) {
                Array[LeftValue] = Array[RightValue];
                LeftValue++;
            }

            while ((Array[LeftValue] <= PivotValue) && (LeftValue < RightValue)) {
                LeftValue++;
                counter++;
            }

            if (LeftValue != RightValue) {
                Array[RightValue] = Array[LeftValue];
                RightValue--;
            }
            counter++;
        }

        Array[LeftValue] = PivotValue;
        PivotValue = LeftValue;
        LeftValue = LeftHoldValue;
        RightValue = RightHoldValue;

        if (LeftValue < PivotValue) {
            Sort(LeftValue, PivotValue - 1, Array);
        }

        if (RightValue > PivotValue) {
            Sort(PivotValue + 1, RightValue, Array);
        }
    }
}
