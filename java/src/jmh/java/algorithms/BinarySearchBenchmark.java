package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

/**
 * To be used with org.openjdk.jmh to benchmark BinarySearch.binarySearch
 */
public class BinarySearchBenchmark {

    @State(Scope.Thread)
    public static class benchmarkState {

        public List<Integer> testData;
        public int searchTerm;

        /**
         * Initialise benchmark data
         * Runs at the start of the benchmark trial
         */
        @Setup(Level.Trial)
        public void setup() {

            testData = Arrays.asList(1, 2, 3, 4, 9, 10, 20, 21);
            searchTerm = 21;
        }

        /**
         * Tear down benchmark state data
         * Runs at the end of the benchmark trial
         */
        @Setup(Level.Trial)
        public void tearDown() {}
    }

    /**
     * Benchmark BinarySearch.binarySearch()
     *
     * @param blackHole Consumes the method result, stopping the JIT compiler
     *                  from optimising it away as dead code
     * @param state     Running state of the benchmark
     */
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void binarySearch(Blackhole blackHole, benchmarkState state) {
        blackHole.consume(
            BinarySearch.binarySearch(state.testData, state.searchTerm));
    }
}
