package com.company;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        double a1 = Math.random() * 20 - 10;
        double a2 = Math.random() * 20 - 10;
        double a3 = Math.random() * 20 - 10;
        double a4 = Math.random() * 20 - 10;
        double a5 = Math.random() * 20 - 10;
        double a6 = Math.random() * 20 - 10;
        double a7 = Math.random() * 20 - 10;
        double a8 = Math.random() * 20 - 10;
        double a9 = Math.random() * 20 - 10;
        double a10 = Math.random() * 20 - 10;

        double[] nums = new double[] { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 };
        int[] index = { 0 };
        List<Double> sortedNumbers = Arrays.stream(nums).sorted().peek(number ->
        {
            if (number < 0)
            {
                index[0]++;
            }
        }).boxed().collect(toList());
        System.out.println(sortedNumbers.subList(0, index[0]));
        System.out.println(sortedNumbers.subList(index[0], sortedNumbers.size()));
    }
}