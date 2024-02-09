package algorithms;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

/**
 * To be used with org.openjdk.jmh to benchmark BinarySearch.binarySearch
 */
@State(Scope.Benchmark)
public class FibonacciBenchmark {

    @Param({"2", "4", "6", "8", "10"}) public int numbers;

    /**
     * Benchmark Fibonacci.iterative()
     *
     * @param blackHole Consumes the method result, stopping the JIT compiler
     *                  from optimising it away as dead code
     * @param state     Running state of the benchmark
     */
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void iterative(Blackhole blackHole) {
        blackHole.consume(Fibonacci.iterative(numbers));
    }

    /**
     * Benchmark Fibonacci.recursive()
     *
     * @param blackHole Consumes the method result, stopping the JIT compiler
     *                  from optimising it away as dead code
     * @param state     Running state of the benchmark
     */
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void recursive(Blackhole blackHole) {
        blackHole.consume(Fibonacci.recursive(numbers));
    }
}
