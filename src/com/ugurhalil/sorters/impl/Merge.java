package com.ugurhalil.sorters.impl;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Merge implements ISorter {
    private int[] Array2;
    private int counter = 0;

    @Override
    public String description() {
        return "Merge Sıralama Algoritması";
    }

    @Override
    public int loopCounter() {
        return counter;
    }

    @Override
    public void execute(int[] array) {
        Array2 = new int[array.length];
        Sort(0, array.length - 1, array);
    }

    private void Sort(int LeftValue, int RightValue, int[] Array) {
        int mid;

        if (RightValue > LeftValue) {
            mid = (RightValue + LeftValue) / 2;
            Sort(LeftValue, mid, Array);
            Sort(mid + 1, RightValue, Array);

            DoMerge(LeftValue, mid + 1, RightValue, Array);
        }
    }

    private void DoMerge(int LeftValue, int MiddleValue, int RightValue, int[] Array) {
        int i, LeftEnd, NumberOfElements, TempPosition;

        LeftEnd = MiddleValue - 1;
        TempPosition = LeftValue;
        NumberOfElements = RightValue - LeftValue + 1;

        while ((LeftValue <= LeftEnd) && (MiddleValue <= RightValue)) {
            if (Array2[LeftValue] <= Array[MiddleValue]) {
                Array2[TempPosition] = Array[LeftValue];
                TempPosition = TempPosition + 1;
                LeftValue = LeftValue + 1;
            } else {
                Array2[TempPosition] = Array[MiddleValue];
                TempPosition = TempPosition + 1;
                MiddleValue = MiddleValue + 1;
            }
            counter++;
        }

        while (LeftValue <= LeftEnd) {
            Array2[TempPosition] = Array[LeftValue];
            LeftValue = LeftValue + 1;
            TempPosition = TempPosition + 1;
            counter++;
        }

        while (MiddleValue <= RightValue) {
            Array2[TempPosition] = Array[MiddleValue];
            MiddleValue = MiddleValue + 1;
            TempPosition = TempPosition + 1;
            counter++;
        }

        for (i = 0; i < NumberOfElements; i++) {
            Array[RightValue] = Array2[RightValue];
            RightValue = RightValue - 1;
            counter++;
        }
    }
}
