package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleorterTest {
    Bubblesorter bubblesorter = new Bubblesorter();
    @Test
    void givenIntArrayNoSorted_whenSorted_thenReturnSortedNumbers(){
        int[] array = new int[]{1,3,2,7,5};
        Assertions.assertArrayEquals(bubblesorter.sort(array),Arrays.stream(array).sorted().toArray());
    }

    @Test
    void givenIntArraySorted_whenSorted_thenReturnSortedNumbers(){
        int[] array = new int[]{1,2,3};
        Assertions.assertArrayEquals(bubblesorter.sort(array),Arrays.stream(array).sorted().toArray());
    }

    @Test
    void givenIntArrayOneNumber_whenSorted_thenReturnSortedNumbers(){
        int[] array = new int[]{1};
        Assertions.assertArrayEquals(bubblesorter.sort(array),Arrays.stream(array).sorted().toArray());
    }

    @Test
    void givenIntArrayTwoNumberSorted_whenSorted_thenReturnSortedNumbers(){
        int[] array = new int[]{1,2};
        Assertions.assertArrayEquals(bubblesorter.sort(array),Arrays.stream(array).sorted().toArray());
    }

    @Test
    void givenIntArrayTwoNumberNoSorted_whenSorted_thenReturnSortedNumbers(){
        int[] array = new int[]{2,1};
        Assertions.assertArrayEquals(bubblesorter.sort(array),Arrays.stream(array).sorted().toArray());
    }
}