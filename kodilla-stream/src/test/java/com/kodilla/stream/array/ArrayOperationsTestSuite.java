package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    //Test 1
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];

        //When
        numbers[0] = 987;
        numbers[1] = 95;
        numbers[2] = 12;
        numbers[3] = 86;
        numbers[4] = 65656;
        numbers[5] = 653;
        numbers[6] = 6445;
        numbers[7] = 622;
        numbers[8] = 766;
        numbers[9] = 9806;
        numbers[10] = 6576;
        numbers[11] = 24236;
        numbers[12] = 73;
        numbers[13] = 1;
        numbers[14] = 2;
        numbers[15] = 3;
        numbers[16] = 4;
        numbers[17] = 5;
        numbers[18] = 6;
        numbers[19] = 7;

        //Then
        double calculatedValueDouble = getAverage(numbers);
        double expectedValue = 5802;

        System.out.println(calculatedValueDouble);
        Assert.assertEquals(expectedValue, calculatedValueDouble, 0.5);
    }
}
