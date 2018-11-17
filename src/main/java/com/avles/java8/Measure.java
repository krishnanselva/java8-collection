package com.avles.java8;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * To illustrate the performance benefits using <code>java.util.stream</code>
 */
public class Measure {

    public static Long getMaxCycleLength(Long start, Long end) {
        long maxCycle = 0;
        for (long i = start; i <= end; i++) {
            long num = i;
            long cycle = 1;
            while (num != 1) {
                cycle++;
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }

            }
            if (maxCycle < cycle) {
                maxCycle = cycle;
            }
        }
        return maxCycle;
    }

    public static Long getMaxCycleLengthStream(LongStream longStream) {
        return longStream.map(num -> {
            long cycle = 1;
            while (num != 1) {
                cycle++;
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }

            }
            return cycle;


        }).max().getAsLong();
    }

    public static Long getMaxCycleLengthStream(Long start, Long end) {
        return getMaxCycleLengthStream(LongStream.range(start, end));
    }

    public static Long getMaxCycleLengthStreamParellel(Long start, Long end) {
        return getMaxCycleLengthStream(LongStream.range(start, end).parallel());
    }

    public static void main(String[] args) {

        long start, end;
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter start = ");
            start = sc.nextLong();
            System.out.print("Enter end = ");
            end = sc.nextLong();

        } else {
            start = Long.parseLong(args[0]);
            end = Long.parseLong(args[1]);
        }
        long startTime = System.currentTimeMillis();
        System.out.println("Max cycle length using conventional way : " + getMaxCycleLength(start, end));
        System.out.println("Process time : " + (System.currentTimeMillis() - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println("Max cycle length using stream api : " + getMaxCycleLengthStream(start, end));
        System.out.println("Process time : " + (System.currentTimeMillis() - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println("Max cycle length using parallel stream api : " + getMaxCycleLengthStreamParellel(start, end));
        System.out.println("Process time : " + (System.currentTimeMillis() - startTime) + " milliseconds");



    }
}
