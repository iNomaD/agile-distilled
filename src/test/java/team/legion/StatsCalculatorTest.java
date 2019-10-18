package team.legion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculatorTest {

    private static final int[] EMPTY_ARRAY = {};

    private final StatsCalculator calc = new StatsCalculator();

    @Test
    void testMinOneElement() {
        int[] arr = {6};
        int res = calc.min(arr);
        assertEquals(6, res);
    }

    @Test
    void testMinTwoElements() {
        int[] arr = {6, -2};
        int res = calc.min(arr);
        assertEquals(-2, res);
    }

    @Test
    void testMinNoElements() {
        assertThrows(IllegalArgumentException.class, () -> calc.min(EMPTY_ARRAY));
    }

    @Test
    void testMaxOneElementArray() {
        int[] array = {3};
        int result  = calc.max(array);
        assertEquals(3, result);
    }

    @Test
    void testMaxTwoElementArray() {
        int[] array = {1, 5};
        int result = calc.max(array);
        assertEquals(5, result);
    }

    @Test
    void testMaxNoElements() {
        assertThrows(IllegalArgumentException.class, () -> calc.max(EMPTY_ARRAY));
    }

    @Test
    void testCountNoElements() {
        assertEquals(0, calc.count(EMPTY_ARRAY));
    }

    @Test
    void testCountOneElement() {
        int[] array = {3};
        assertEquals(1, calc.count(array));
    }

    @Test
    void testAverageNoElements() {
        assertThrows(IllegalArgumentException.class, () -> calc.avg(EMPTY_ARRAY));
    }

    @Test
    void testAverageOneElement() {
        int[] array = {10};
        assertEquals(10, calc.avg(array));
    }

    @Test
    void testAverageTwoElements() {
        int[] array = {1, 2};
        assertEquals(1.5, calc.avg(array), 0.0001);
    }

}