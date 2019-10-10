package team.legion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    void test1999() {
        assertFalse(LeapYear.isLeap(1999));
    }

    @Test
    void test4() {
        assertTrue(LeapYear.isLeap(4));
    }

    @Test
    void test8() {
        assertTrue(LeapYear.isLeap(8));
    }

    @Test
    void test100() {
        assertFalse(LeapYear.isLeap(100));
    }

    @Test
    void test200() {
        assertFalse(LeapYear.isLeap(200));
    }

    @Test
    void test2000() {
        assertTrue(LeapYear.isLeap(2000));
    }

    @Test
    void test4000() {
        assertTrue(LeapYear.isLeap(4000));
    }

    @Test
    void testMinus2000() {
        assertThrows(IllegalArgumentException.class, () -> LeapYear.isLeap(-2000));
    }
}
