package com.ugurhalil.sorters;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public interface ISorter {
    String description();

    int loopCounter();

    void execute(int[] array);
}
