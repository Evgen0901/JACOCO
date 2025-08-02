package ru.netology.javaqa.JaCoCo;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void equalValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 12, 12, 12, 12};
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void oneMessage() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {34};
        long expected = 34;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void negativeValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-7, -11, -3, -28, -4};
        long expected = -3;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}