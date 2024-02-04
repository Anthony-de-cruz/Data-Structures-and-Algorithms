import algorithms.BinarySearch;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
        int searchTerm = 20;

        long time = AlgorithmTester.timeAlgorithm(
            () -> BinarySearch.binarySearch(list, searchTerm));

        System.out.printf("Binary search took %fs", time * Math.pow(10, -9));
    }
}
