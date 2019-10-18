package team.legion;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramsTest {

    private Set<String> result;

    @Test
    void testEmptyString() {
        String input = "";
        result = new Anagrams().find(input);
        assertEquals(Set.of(""), result);
    }

    @Test
    void testSingleElementString() {
        String input = "A";
        result = new Anagrams().find(input);
        assertEquals(Set.of(input), result);
    }

    @Test
    void testTwoDistinctElementString() {
        String input = "Ab";
        result = new Anagrams().find(input);
        assertEquals(Set.of("Ab", "bA"), result);
    }

    @Test
    void testThreeDistinctElementString() {
        String input = "Abc";
        result = new Anagrams().find(input);
        assertEquals(Set.of("Abc", "Acb", "bAc", "bcA", "cAb", "cbA"), result);
    }

    @Test
    void testTwoDuplicateElementString() {
        String input = "AA";
        result = new Anagrams().find(input);
        assertEquals(Set.of("AA"), result);
    }

    @Test
    void test() {
        String input = "AAbbCCddEEf";
        result = new Anagrams().find(input);
        assertEquals(1247400, result.size());
    }

}