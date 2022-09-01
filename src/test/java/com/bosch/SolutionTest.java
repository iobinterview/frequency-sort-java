package com.bosch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void basicTest() {
        List<Integer> input = Arrays.asList(5, 1, 5, 5, 3, 1);

        assertEquals(
                Arrays.asList(5, 5, 5, 1, 1, 3),
                Solution.sortByFrequency(input)
        );
    }

    @Test
    public void equalFrequencyTest() {
        List<Integer> input = Arrays.asList(4, 4, 2, 2, 2, 3, 1, 1, 3, 2, 6, 7, 5);

        assertEquals(
                Arrays.asList(2, 2, 2, 2, 1, 1, 3, 3, 4, 4, 5, 6, 7),
                Solution.sortByFrequency(input)
        );
    }
}
