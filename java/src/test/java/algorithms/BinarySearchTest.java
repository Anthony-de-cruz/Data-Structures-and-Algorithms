package algorithms;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
        int searchTerm1 = 1;
        int searchTerm2 = 3;
        int searchTerm3 = 21;
        int searchTerm4 = 50;
        int searchTerm5 = 0;
        int searchTerm6 = -21;

        assert (BinarySearch.binarySearch(list, searchTerm1));
        assert (BinarySearch.binarySearch(list, searchTerm2));
        assert (BinarySearch.binarySearch(list, searchTerm3));
        assert (!BinarySearch.binarySearch(list, searchTerm4));
        assert (!BinarySearch.binarySearch(list, searchTerm5));
        assert (!BinarySearch.binarySearch(list, searchTerm6));
    }
}
