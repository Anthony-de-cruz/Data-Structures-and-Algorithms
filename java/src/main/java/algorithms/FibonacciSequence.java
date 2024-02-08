package algorithms;

public class FibonacciSequence {

    public static int fibonacciSequence(int n) {
        int total = 0;
        for (int x = 0; x < n; x++) {
            total += n - x;
        }

        return total;
    }
}
