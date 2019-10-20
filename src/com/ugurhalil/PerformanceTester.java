package com.ugurhalil;

import com.ugurhalil.sorters.ISorter;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class PerformanceTester {

    public void execute(ISorter sorter, int[] array) {
        StopWatch watcher = new StopWatch();
        watcher.start();

        sorter.execute(array);

        watcher.stop();

        String result = String.format("%s için Toplam Çalışma Süresi : %s milisaniyedir. Döngü Sayısı %s Dizi boyutu %s"
                , sorter.description()
                , watcher.getElapsedTime()
                , sorter.loopCounter()
                , array.length);
        System.out.println(result);
    }
}
