package algorithms;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void iterativeTest() {
        assert (Fibonacci.iterative(0) == 0);
        assert (Fibonacci.iterative(1) == 1);
        assert (Fibonacci.iterative(2) == 1);
        assert (Fibonacci.iterative(3) == 2);
        assert (Fibonacci.iterative(4) == 3);
        assert (Fibonacci.iterative(40) == 102334155);
    }

    @Test
    public void recursiveTest() {
        assert (Fibonacci.recursive(0) == 0);
        assert (Fibonacci.recursive(1) == 1);
        assert (Fibonacci.recursive(2) == 1);
        assert (Fibonacci.recursive(3) == 2);
        assert (Fibonacci.recursive(4) == 3);
        assert (Fibonacci.recursive(40) == 102334155);
    }
}
