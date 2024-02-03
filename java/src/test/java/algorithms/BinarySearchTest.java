package algorithms;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
        int search_term_1 = 1;
        int search_term_2 = 3;
        int search_term_3 = 21;
        int search_term_4 = 50;
        int search_term_5 = 0;
        int search_term_6 = -21;

        assert (BinarySearch.binarySearch(list, search_term_1));
        assert (BinarySearch.binarySearch(list, search_term_2));
        assert (BinarySearch.binarySearch(list, search_term_3));
        assert (!BinarySearch.binarySearch(list, search_term_4));
        assert (!BinarySearch.binarySearch(list, search_term_5));
        assert (!BinarySearch.binarySearch(list, search_term_6));
    }
}
