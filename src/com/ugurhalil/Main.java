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

        numbers = load(3000);
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
        int[] randomNumbers1 = randomNumbers.clone();
        int[] randomNumbers2 = randomNumbers.clone();
        int[] randomNumbers3 = randomNumbers.clone();
        int[] randomNumbers4 = randomNumbers.clone();
        int[] randomNumbers5 = randomNumbers.clone();
        int[] randomNumbers6 = randomNumbers.clone();
        numbers = new ArrayList<>();
        numbers.add(randomNumbers);
        numbers.add(randomNumbers1);
        numbers.add(randomNumbers2);
        numbers.add(randomNumbers3);
        numbers.add(randomNumbers4);
        numbers.add(randomNumbers5);
        numbers.add(randomNumbers6);
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
        System.out.println("");
    }

}
