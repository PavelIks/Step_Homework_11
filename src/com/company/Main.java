package com.company;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        double a1 = Math.random() * 200 - 100;
        double a2 = Math.random() * 200 - 100;
        double a3 = Math.random() * 20 - 10;
        double a4 = Math.random() * 20 - 10;
        double a5 = Math.random() * 20 - 10;

        int[] numbers = {((int) a1), ((int) a2), ((int) a3), ((int) a4), ((int) a5)};

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + "; ");
        }

        long count1 = IntStream.of(numbers).filter(i -> i > 0).count();
        System.out.println("\nКоличество пол. чисел:\t\t" + count1);

        long count2 = IntStream.of(numbers).filter(i -> i < 0).count();
        System.out.println("Количество отр. чисел:\t\t" + count2);

        long count3 = IntStream.of(numbers).filter(i -> i == 0).count();
        System.out.println("Количество нулей:\t\t\t" + count3);

        long count4 = 0;
        for (int i1 = 0; i1 < numbers.length; i1++)
        {
            int beta1 = String.valueOf(Math.abs(numbers[i1])).length();
            count4 += IntStream.of(beta1).filter(i -> i == 2).count();
        }
        System.out.println("Количество 2-значных чисел:\t" + count4);

        int[] b = IntStream.rangeClosed(1, numbers.length).map(i -> numbers[numbers.length-i]).toArray();
        for(int a : b)
        {
            System.out.print(a + "; ");
        }
    }
}

