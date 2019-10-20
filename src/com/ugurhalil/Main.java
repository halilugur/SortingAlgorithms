package com.ugurhalil;

import com.ugurhalil.sorters.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static PerformanceTester neco = new PerformanceTester();
    static Insertion insertion = new Insertion();
    static Bubble bubble = new Bubble();
    static Heap heap = new Heap();
    static Quick quick = new Quick();
    static Selection selection = new Selection();
    static Shell shell = new Shell();
    static Merge merge = new Merge();
    static List<int[]> numbers;


    public static void main(String[] args) {
        System.out.println("Testler başladı. Lütfen bekleyiniz");

        numbers = load(100);
        execute(numbers);

        numbers = load(500);
        execute(numbers);

        numbers = load(1000);
        execute(numbers);

        numbers = load(5000);
        execute(numbers);

        numbers = load(10000);
        execute(numbers);

        numbers = load(50000);
        execute(numbers);

        numbers = load(100000);
        execute(numbers);

        System.out.println("Testler tamamlandı.");
    }

    private static List<int[]> load(int MaxValue) {
        int[] randomNumbers = Utility.GenerateRandomNumbers(MaxValue);
        numbers = new ArrayList<>();
        numbers.add(randomNumbers);
        numbers.add(randomNumbers.clone());
        numbers.add(randomNumbers.clone());
        numbers.add(randomNumbers.clone());
        numbers.add(randomNumbers.clone());
        numbers.add(randomNumbers.clone());
        numbers.add(randomNumbers.clone());
        return numbers;
    }

    private static void execute(List<int[]> numbers) {
        neco.execute(bubble, numbers.get(0));
        neco.execute(heap, numbers.get(1));
        neco.execute(insertion, numbers.get(2));
        neco.execute(merge, numbers.get(3));
        neco.execute(quick, numbers.get(4));
        neco.execute(selection, numbers.get(5));
        neco.execute(shell, numbers.get(6));
    }

}
