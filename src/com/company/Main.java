package com.company;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        double a1 = Math.random() * 20 - 10;
        double a2 = Math.random() * 20 - 10;
        double a3 = Math.random() * 20 - 10;
        double a4 = Math.random() * 20 - 10;
        double a5 = Math.random() * 20 - 10;

        int[] numbers = { ((int)a1), ((int)a2), ((int)a3), ((int)a4), ((int)a5) };

        long count1 = IntStream.of(numbers).filter(i -> i > 0).count();
        System.out.println("Количество пол. чисел:\t" + count1);

        long count2 = IntStream.of(numbers).filter(i -> i < 0).count();
        System.out.println("Количество отр. чисел:\t" + count2);

        long count3 = IntStream.of(numbers).filter(i -> i == 0).count();
        System.out.println("Количество нулей:\t\t" + count3);
    }
}