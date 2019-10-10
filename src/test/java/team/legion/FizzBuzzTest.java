package team.legion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testNumber1() {
        assertEquals("1", fizzBuzz.run(1));
    }

    @Test
    void testNumber2() {
        assertEquals("2", fizzBuzz.run(2));
    }

    @Test
    void testNumber4() {
        assertEquals("4", fizzBuzz.run(4));
    }

    @Test
    void testNumber3() {
        assertEquals("Fizz", fizzBuzz.run(3));
    }

    @Test
    void testNumber6() {
        assertEquals("Fizz", fizzBuzz.run(6));
    }

    @Test
    void testNumber9() {
        assertEquals("Fizz", fizzBuzz.run(9));
    }

    @Test
    void testNumber5() {
        assertEquals("Buzz", fizzBuzz.run(5));
    }

    @Test
    void testNumber10() {
        assertEquals("Buzz", fizzBuzz.run(10));
    }

    @Test
    void testNumber15() {
        assertEquals("FizzBuzz", fizzBuzz.run(15));
    }

    @Test
    void testNumber30() {
        assertEquals("FizzBuzz", fizzBuzz.run(30));
    }
}
