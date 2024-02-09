import algorithms.BinarySearch;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
        int searchTerm = 21;

        int repetitions = (int)Math.pow(10, 6);
        long averageTime = AlgorithmTester.averageTime(
            () -> BinarySearch.binarySearch(list, searchTerm), repetitions);

        System.out.printf("%d binary searches took an average of %dns\n",
                          repetitions, averageTime);
        long time = AlgorithmTester.timeAlgorithm(
            () -> BinarySearch.binarySearch(list, searchTerm));

        System.out.printf("Binary search took %dns\n", time);
    }
}
