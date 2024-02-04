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

        List<Integer> unsortedList = Arrays.asList(2, 3, 1, 5, 8);
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 5, 8);
        BubbleSort.bubbleSort(unsortedList);
        assert (Objects.equals(unsortedList, sortedList));

        Integer[] unsortedIntegerArray = {1, 4, 2, 4, 10, 0};
        Integer[] sortedIntegerArray = {0, 1, 2, 4, 4, 10};
        BubbleSort.bubbleSort(unsortedIntegerArray);
        assert (Arrays.equals(unsortedIntegerArray, sortedIntegerArray));

        int[] unsortedIntArray = {1, 3, 2, 100, 0};
        int[] sortedIntArray = {0, 1, 2, 3, 100};
        BubbleSort.bubbleSort(unsortedIntArray);
        assert (Arrays.equals(unsortedIntArray, sortedIntArray));

        List<Integer> emptyArray = List.of();
        BubbleSort.bubbleSort(emptyArray);
    }
}
