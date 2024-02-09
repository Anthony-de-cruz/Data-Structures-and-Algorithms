package algorithms;

public class Fibonacci {

    public static long iterative(int n) {
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

    public static int recursive(int n) {

        if (n < 2) {
            return n;
        }

        return recursive(n - 1) + recursive(n - 2);
    }
}
