package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    /**
     * An implementation of bubble sort
     *
     * @param collection The collection to be sorted
     * @param <T>        Any type that is comparable
     */
    public static <T extends Comparable<T>> void
    bubbleSort(List<T> collection) {
        for (int x = 0; x < collection.size(); x++) {
            for (int y = 0; y < collection.size() - 1 - x; y++) {
                if (collection.get(y).compareTo(collection.get(y + 1)) > 0) {
                    T temp = collection.get(y);

                    collection.set(y, collection.get(y + 1));
                    collection.set(y + 1, temp);
                }
            }
        }
    }

    /**
     *
     *
     *
     * @param array The array to be sorted
     * @param <T>   Any type that is comparable
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        bubbleSort(Arrays.asList(array));
    }

    /**
     * An implementation of bubble sort
     *
     * @param array The array of integers to be sorted
     */
    public static void bubbleSort(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        // Convert to List
        List<Integer> list = new ArrayList<>(array.length);
        for (Integer x : array) {
            list.add(x);
        }
        bubbleSort(list);
        // Apply sorted values to the original array
        for (int y = 0; y < array.length; y++) {
            array[y] = list.get(y);
        }
    }
}
