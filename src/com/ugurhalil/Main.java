package com.ugurhalil;

import com.ugurhalil.sorters.ISorter;
import com.ugurhalil.sorters.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testler başladı. Lütfen bekleyiniz");

        List<ISorter> sorters = new ArrayList<>();
        sorters.add(new Insertion());
        sorters.add(new Bubble());
        sorters.add(new Heap());
        sorters.add(new Quick());
        sorters.add(new Selection());
        sorters.add(new Shell());
        sorters.add(new Merge());

        execute(Utility.GenerateRandomNumbers(100), sorters);
        execute(Utility.GenerateRandomNumbers(500), sorters);
        execute(Utility.GenerateRandomNumbers(1000), sorters);
        execute(Utility.GenerateRandomNumbers(3000), sorters);
        execute(Utility.GenerateRandomNumbers(5000), sorters);
        execute(Utility.GenerateRandomNumbers(10000), sorters);
        execute(Utility.GenerateRandomNumbers(50000), sorters);
        execute(Utility.GenerateRandomNumbers(100000), sorters);

        System.out.println("Testler tamamlandı.");
    }

    private static void execute(int[] numbers, List<ISorter> sorters) {
        PerformanceTester performanceTester = new PerformanceTester();
        for (int i = 0; i < sorters.size(); i++) {
            performanceTester.execute(sorters.get(i), numbers.clone());
        }
    }

}
