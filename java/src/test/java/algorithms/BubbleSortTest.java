package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Test;

public class BubbleSortTest {

    /**
     * Test BubbleSort.bubbleSort()
     */
    @Test
    public void bubbleSortTest() {

        List<Integer> unsorted_list = Arrays.asList(2, 3, 1, 5, 8);
        List<Integer> sorted_list = Arrays.asList(1, 2, 3, 5, 8);
        BubbleSort.bubbleSort(unsorted_list);
        assert (Objects.equals(unsorted_list, sorted_list));

        Integer[] unsorted_integer_array = {1, 4, 2, 4, 10, 0};
        Integer[] sorted_integer_array = {0, 1, 2, 4, 4, 10};
        BubbleSort.bubbleSort(unsorted_integer_array);
        assert (Arrays.equals(unsorted_integer_array, sorted_integer_array));

        int[] unsorted_int_array = {1, 3, 2, 100, 0};
        int[] sorted_int_array = {0, 1, 2, 3, 100};
        BubbleSort.bubbleSort(unsorted_int_array);
        assert (Arrays.equals(unsorted_int_array, sorted_int_array));

        List<Integer> empty_array = List.of();
        BubbleSort.bubbleSort(empty_array);
    }
}
