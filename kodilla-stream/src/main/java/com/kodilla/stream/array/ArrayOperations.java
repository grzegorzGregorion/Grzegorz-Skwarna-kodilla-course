package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble averageValueOfNumbersFromList = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        double averageValue = averageValueOfNumbersFromList.getAsDouble();

        return averageValue;
    }
}
