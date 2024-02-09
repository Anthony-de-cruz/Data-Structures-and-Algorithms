package algorithms;

public class Fibonacci {

    /**
     * An iterative implementation of the Fibonacci sequence
     *
     * @param n The nth number in the Fibonacci sequence
     * @return The Fibonacci sequence value
     */
    public static long iterative(long n) {
        long a = 0;
        long b = 1;
        long temp = 0;
        for (int x = 0; x < n; x++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }

    /**
     * A recursive implementation of the Fibonacci sequence
     *
     * @param n The nth number in the Fibonacci sequence
     * @return The Fibonacci sequence value
     */
    public static long recursive(long n) {
        if (n < 2) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }
}
