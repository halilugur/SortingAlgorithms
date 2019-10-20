package com.ugurhalil;

import java.util.Random;

/**
 * @author Halil UĞUR
 * @since 20.10.2019
 */
public class Utility {
    public static int[] GenerateRandomNumbers(int size) {
        int[] numbers = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rnd.nextInt(size);
        }

        return numbers;
    }

    public static void writeArray(int[] Array) {
        StringBuilder builder = new StringBuilder();
        for (int element : Array) {
            builder.append(String.format("%s ", element));
        }
        System.out.println(builder.toString());
    }
}
