package team.legion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void testFibonacciNumber0() {
        assertEquals(0, Fibonacci.calculate(0));
    }

    @Test
    void testFibonacciNumber1() {
        assertEquals(1, Fibonacci.calculate(1));
    }

    @Test
    void testFibonacciNumber2() {
        assertEquals(1, Fibonacci.calculate(2));
    }

    @Test
    void testFibonacciNumber3() {
        assertEquals(2, Fibonacci.calculate(3));
    }

    @Test
    void testFibonacciNumber4() {
        assertEquals(3, Fibonacci.calculate(4));
    }

    @Test
    void testFibonacciNumber5() {
        assertEquals(5, Fibonacci.calculate(5));
    }

    @Test
    void testFibonacciNumber6() {
        assertEquals(8, Fibonacci.calculate(6));
    }

    @Test
    void testFibonacciNumber7() {
        assertEquals(13, Fibonacci.calculate(7));
    }

    @Test
    void testFibonacciNumber8() {
        assertEquals(21, Fibonacci.calculate(8));
    }

    @Test
    void testFibonacciNumber9() {
        assertEquals(34, Fibonacci.calculate(9));
    }
}
