package com.ugurhalil;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class PerformanceTester {

    public void execute(ISorter sorter, int[] array) {
        long startTime = System.nanoTime();
        sorter.execute(array);
        long endTime = System.nanoTime();
        String result = String.format("%s,%s,%s"
                , sorter.description()
                , (endTime - startTime) / 1000
                , array.length);
        System.out.println(result);
    }
}
