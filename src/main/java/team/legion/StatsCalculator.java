package team.legion;

import java.util.stream.IntStream;

public class StatsCalculator {

    int min(int[] arr) {
        return IntStream.of(arr).min().orElseThrow(() -> new IllegalArgumentException("Empty array"));
    }

    int max(int[] array) {
        return IntStream.of(array).max().orElseThrow(() -> new IllegalArgumentException("Array should not be empty!"));
    }

    int count(int[] array) {
        return array.length;
    }

    double avg(int[] array) {
        return IntStream.of(array).average().orElseThrow(() -> new IllegalArgumentException("Empty array"));
    }
}
