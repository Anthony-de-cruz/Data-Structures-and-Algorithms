package algorithms;

import java.util.List;

public class BinarySearch {

    /**
     * A binary search implementation
     *
     * @param list List to be searched
     * @param term The search term
     * @return Returns whether the search term is in the list
     * @param <T> The type generic
     */
    public static <T extends Comparable<T>> boolean binarySearch(List<T> list, T term) {
        int high = list.size();
        int low = 0;

        while (low < high) {
            int half = low + Math.floorDiv(high - low, 2);
            int comparison = term.compareTo(list.get(half));

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = half;
            } else {
                low = half + 1;
            }
        }
        return false;
    }
}
